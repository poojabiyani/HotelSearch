package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
public class RoomServlet extends HttpServlet{
 
	Room room= new Room();
    private static final long serialVersionUID = 1L;
    
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        System.out.println("----- RoomServlet -----");
        try {
        	int id = 1;
        	try{
        	String i= request.getParameter("idd");
        	id= Integer.parseInt(i);
            }catch(NumberFormatException e)
            {
            	
            }
        	String na= request.getParameter("name");
            String chkinm=request.getParameter("month");
            String chkind=request.getParameter("dt");
            String chkoutm=request.getParameter("month1");
            String chkoutd=request.getParameter("dt1");
            String no= request.getParameter("rooms");
            String fo= request.getParameter("food");
            
            room.setName(na);
            room.setFood(fo);
            room.setCheckin(chkinm +"-"+ chkind);
            room.setCheckout(chkoutm +"-"+ chkoutd);
            room.setNo_of_rooms(Integer.parseInt(no));
            
           Connect c= new Connect();
         	
         	Connection conn=null;
         	Statement stmt=null;

         	try{
    		Class.forName(c.driver);
    		conn= DriverManager.getConnection(c.url,c.user,c.password);

    		String selectSQL = "SELECT RoomsVacant FROM hotel WHERE HotelId=?";
    		PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
    		preparedStatement.setInt(1, id);
    		ResultSet r = preparedStatement.executeQuery();
    		int rooms = 0;
    		while (r.next()) {
    			rooms = r.getInt("RoomsVacant");	
    		} 
    		if(rooms-room.getNo_of_rooms() >=0)
    		{
        		PreparedStatement statement = conn.prepareStatement("insert into details values (?,?,?,?,?,?)");    
        		statement.setString(1, room.getName());
        		statement.setInt(2, room.getNo_of_rooms());
        		statement.setString(3, room.getCheckin());
        		statement.setString(4, room.getCheckout());
        		statement.setString(5, room.getFood());
        		statement.setInt(6, id);
        		
        		statement.executeUpdate();
        		
    		String updateTableSQL = "UPDATE hotel SET RoomsVacant = ? WHERE HotelId = ?";
    		preparedStatement = conn.prepareStatement(updateTableSQL);
    		preparedStatement.setInt(1, (rooms-room.getNo_of_rooms()));
    		preparedStatement.setInt(2, id);
    		preparedStatement .executeUpdate();
    		
				 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Thankyou.jsp");
				 requestDispatcher.include(request, response);
    		}
    		
    		else
    		{
    			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Sorry.jsp");
				 requestDispatcher.include(request, response);
    		}
    			

    	}catch(Exception e)
    	{
    		System.out.println(e);
    	}

    	finally {
    		try{
    			if(stmt!=null)
    				stmt.close();
    		}catch(SQLException e){
    			}
    		try{
    			if(conn!=null)
    				conn.close();
    		}catch(SQLException e){
    			e.printStackTrace();
    			}
    	}
        
    } catch(Exception e){
        e.printStackTrace();
    }
            	
     	}

	}
    
