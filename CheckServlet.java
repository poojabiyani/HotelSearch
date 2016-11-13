package project;

import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class CheckServlet extends HttpServlet{
 
    private static final long serialVersionUID = 1L;
    
   // @SuppressWarnings("null")
	public void doPost(HttpServletRequest request, HttpServletResponse response){
        System.out.println("----- CheckServlet -----");
        
 
            String email=request.getParameter("Email ID");
            String pass=request.getParameter("Password");
            
        	Connect c= new Connect();
        	ResultSet rs;
        	try{
        		rs= c.check(email);
        		
    			if(!rs.next())
    				{
    				System.out.println("Please register");
    				 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/LoginFail.jsp");
					 requestDispatcher.include(request, response);
    				}
    			else{
    				do {
    					if(rs.getString("Password").equals(pass)){
    						System.out.println("Proceed to hotel sorting");
    	    				 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/HotelGUI.jsp");
    						 requestDispatcher.include(request, response);
    						 break;
    					}
    					else
    					{
    					 System.out.println("Please insert the correct password");
   	    				 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Incorrect.jsp");
   						 requestDispatcher.include(request, response);
   						 break;
    					}
    				}while(rs.next());
    				
    			}
    			c.closing();
    	}catch (Exception e) {
			System.out.println(e);
		}
	}
 
}
        