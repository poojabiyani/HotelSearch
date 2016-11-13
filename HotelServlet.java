package project;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
public class HotelServlet extends HttpServlet{
 
	Hotel hotel= new Hotel();
	Room room= new Room();
    private static final long serialVersionUID = 1L;
    
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        System.out.println("----- HotelServlet -----");
             String ci=request.getParameter("City");
           
            hotel.setCity(ci);
         	try{
         		Connect c= new Connect();
         		ResultSet rs= c.sort(ci);

			if(!rs.next())
				{
				System.out.println("Sorry. Room not available in "+ hotel.getCity());
				}
			else{
				 System.out.println("Proceed");
				 Hotel result;
				 ArrayList<Hotel> list= new ArrayList<Hotel>();
		     		do{   
		                result =new Hotel();  

		                result.setCity(rs.getString("City"));
		                result.setAddress(rs.getString("Address"));
		                result.setName(rs.getString("Name"));
		                result.setRating(rs.getInt("Rating"));
		                result.setNo_of_rooms(rs.getInt("RoomsVacant"));
		                result.setContact(rs.getLong("Contact"));
		                result.setId(rs.getInt("HotelId"));
		                
		                list.add(result);

		            }while (rs.next());
		     		
		     		//System.out.println(list);
		     		//for(int i = 0; i < list.size(); i++) 
		     			//System.out.print((list.get(i)).toString());
		     		
		     		request.setAttribute("HotelServlet", list); 
		     		
		     		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/HotelList.jsp");
		     		requestDispatcher.include(request, response);
				}
        
    } catch(Exception e){
        e.printStackTrace();
    }
            	
     	}

	}
    
