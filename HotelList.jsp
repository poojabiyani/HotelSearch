<%@page import="project.Hotel"%>
<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body
    {
        background:url(img2.jpg) no-repeat center center fixed;
        background-size: cover;
        margin: 0;
        padding: 0;
    }
    
td
	{
		padding: 1cm;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Details</title>
</head>
<body>
<%  
// retrieve your list from the request, with casting 

ArrayList<Hotel> list =new ArrayList<Hotel>();
//storing passed value from jsp
list = (ArrayList<Hotel>)request.getAttribute("HotelServlet");

// print the information about every category of the list
%>
<form action="Room.jsp" method="get">
<table cellspacing="1" cellpadding="4" border="0">
        <tr>
            <TH>
                ID
            </TH>
            <TH>
                Name
            </TH>
            <TH>
                Address
            </TH>
            <TH>
                Contact
            </TH>
            <TH>
                Rating
            </TH>
             <TH>
                Rooms Vacant
            </TH>
        </tr>

        <tr>
            <% for (int i = 0; i < list.size(); i++) {
                
            %>
            <td>
                <center>
                    <% out.println( list.get(i).getId()); %>
                </center>
            </td>
             <td>
                <center>
                    <% out.println( list.get(i).getName()  ); %>
                </center>
            </td>
        
             <td>
                <center>
                    <% out.println( list.get(i).getAddress()  ); %>
                </center>
            </td>
        
             <td>
                <center>
                    <% out.println( list.get(i).getContact()  ); %>
                </center>
            </td>
        
             <td>
                <center>
                    <% out.println( list.get(i).getRating()  ); %>
                </center>
            </td>
             <td>
                <center>
                    <% out.println( list.get(i).getNo_of_rooms()  ); %>
                </center>
            </td>
            <td colspan="2" align="center">
                <%
   				 session.setAttribute("userId",  list.get(i).getId());
      			  %>
            <input type="submit" value="Book Now">
            </td>
        </tr>
        <% } %>
    </table>
    </form>
</body>
</html>