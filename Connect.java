package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
	
	 final String driver= "com.mysql.jdbc.Driver";
     final String url= "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";
     final String user= "root";
     final String password= "sonuappi";	
     Connection conn=null;
     ResultSet r = null;
     PreparedStatement statement;
     
     // function1 - to check before login
     public ResultSet check(String email) throws SQLException, ClassNotFoundException
     {
    	 
     		Class.forName(driver);
     		conn= DriverManager.getConnection(url,user,password);

     		statement = conn.prepareStatement("select * from customer where EmailId = ?");    
     		statement.setString(1, email); 
     		
     		r= statement.executeQuery();
     		return r;	
     }

    
 // function2- register -- insert into table customer
   public int register(String email, String pass, String name, String age, String gen) throws SQLException
    {
		statement = conn.prepareStatement("insert into customer values (?, ?, ?, ?, ?) ");    
		statement.setString(1, email); 
		statement.setString(2, pass);
		statement.setString(3, name);
		statement.setInt(4, Integer.parseInt(age));
		statement.setString(5, gen);
		
		return statement.executeUpdate();	
    }

   public ResultSet sort(String ci) throws SQLException, ClassNotFoundException
   {
  	 
   		Class.forName(driver);
   		conn= DriverManager.getConnection(url,user,password);

   		statement = conn.prepareStatement("select * from hotel where City = ?");    
   		statement.setString(1, ci); 
   		
   		r= statement.executeQuery();
   		return r;	
   }
   
   
   void closing()
   {
	   try{
			if(conn!=null){
				conn.close();
				statement.close();
			}
		}catch(SQLException e1){
			e1.printStackTrace();
			} catch(Exception e){
	e.printStackTrace();
	}
   }
}
