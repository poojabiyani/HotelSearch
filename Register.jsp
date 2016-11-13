<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body
    {
        background:url(img4.jpg) no-repeat center center fixed;
        background-size: cover;
        margin: 0;
        padding: 0;
    }
    
td
	{
		font-size: large;
		font-style: italic;
	}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTER</title>
</head>
<body>
<form action="register" method="post">
<table align="center" border="0" width="70%">
    <tr>
        <td style="font-size: xx-large;" colspan="2" align="center">REGISTER HERE :</td>
    </tr>
    <tr></tr>
    <tr></tr>
        <tr>
        <td align="center" >Name: </td>
        <td><input type="text" name="Name" maxlength="25"></td>
    </tr>
    <tr>
        <td align="center" >Email ID: </td>
        <td><input type="text" name="Email ID" maxlength="25"></td>
    </tr>
    <tr>
        <td align="center" >Age: </td>
        <td><input type="text" name="Age" maxlength="25"></td>
    </tr>
    <tr>
        <td align="center">Gender: </td>
        <td><input type="text" name="Gender" maxlength="25"></td>
    </tr>
    <tr>
        <td align="center">Password: </td>
        <td><input type="password" name="Password" maxlength="30"></td>
    </tr> 
     <tr></tr>
     <tr></tr>
    <tr>
        <td align="right"><input type="submit" value="Register"></td>
    </tr> 
    <tr></tr>
    <tr>
    <td align="right"><input type="reset" value="Reset"></td>
    </tr> 
</table>
</form>
</body>
</html>