package project;

import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	 private static final long serialVersionUID = 1L;
	    
		public void doPost(HttpServletRequest request, HttpServletResponse response){
	        System.out.println("----- RegisterServlet -----");
	        try {
	        	String name=request.getParameter("Name");
	        	String age=request.getParameter("Age");
	        	String gen=request.getParameter("Gender");
	            String email=request.getParameter("Email ID");
	            String pass=request.getParameter("Password");
	            
	            Connect c= new Connect();
	        	
	        	Connection conn=null;
	        	try{
	        		
	        		Class.forName(c.driver);
	        		conn= DriverManager.getConnection(c.url,c.user,c.password);

	        		PreparedStatement statement = conn.prepareStatement("insert into customer values (?, ?, ?, ?, ?) ");    
	        		statement.setString(1, email); 
	        		statement.setString(2, pass);
	        		statement.setString(3, name);
	        		statement.setInt(4, Integer.parseInt(age));
	        		statement.setString(5, gen);
	        		
	        		statement.executeUpdate();
	    			
	    				 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/HotelGUI.jsp");
						 requestDispatcher.include(request, response);
	    			
	      			statement.close();
	    			conn.close();
	        	}catch(Exception e)
	        	{
	        		System.out.println(e);
	        	}
	  
	        	finally {
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
