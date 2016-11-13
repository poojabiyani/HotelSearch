<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body
    {
        background:url(checkin.jpg) no-repeat center center fixed;
        background-size: cover;
        margin: 0;
        padding: 0;
    }
    
td
	{
		font-weight: bold;
	}
	
p
	{
		font-weight: bold;
		font-family: cursive;
	}
	
a
	{
		font-family: cursive;
		font-weight: bold;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SIGN IN</title>
</head>
<body>
<form action="check" method="post">
<table align="center" border="0" width="70%" >
    <tr>
        <td colspan="2" align="center"  style="font-size: xx-large;">Sign In </td>
    </tr>
    <tr>
        <td align="center" style="font-size: large;">EMAIL ID: </td>
        <td align="left"><input type="text" name="Email ID" maxlength="30"></td>
    </tr>
    <tr>
        <td align="center" style="font-size: large;">PASSWORD: </td>
        <td align="left"><input type="password" name="Password" maxlength="30"></td>
    </tr> 
    <tr>
        <td style="font-size: medium;" colspan="2" align="center"><input type="submit" value="Submit"></td>
    </tr> 
</table>
</form>
<p> If not registerd, <a href="Register.jsp">Click here</a>  </p>
</body>
</html>