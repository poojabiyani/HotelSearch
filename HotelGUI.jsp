<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body
    {
        background:url(img5.jpg) no-repeat center center fixed;
        background-size: cover;
        margin: 0;
        padding: 0;
    }

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select City</title>
</head>
<body>
<form action="hotel" method="post">
<center>
<table border="0" align="center">
<br>
<br>
        <tr>
          <td width="200">SELECT CITY <br>
              <label for="City"></label>
              <select name="City" size="1" id="City">
                <option value="Jaipur" selected>Jaipur</option>
                <option value="Chandigarh">Chandigarh</option>
                <option value="Delhi">Delhi</option>
                <option value="Mumbai">Mumbai</option>
                <option value="Kolkata">Kolkata</option>
                <option value="Chennai">Chennai</option>
                <option value="Indore">Indore</option>
                <option value="Bangalore">Bangalore</option>
                <option value="Ahemdabad">Ahemdabad</option>
                <option value="Manali">Manali</option>
                <option value="Darjeeling">Darjeeling</option>
                <option value="Gandhinagar">Gandhinagar</option>
                <option value="Hyderabad">Hyderabad</option>
                <option value="Haridwar">Haridwar</option>
                <option value="Jaisalmer">Jaisalmer</option>
                <option value="Lonavala">Lonavala</option>
                <option value="Mysore">Mysore</option>
                <option value="Nainital">Nainital</option>
                <option value="Ooty">Ooty</option>
                <option value="Patna">Patna</option>
                <option value="Pondicherry">Pondicherry</option>
                <option value="Pune">Pune</option>
                <option value="Shimala">Shimla</option>
                <option value="Srinagar">Srinagar</option>
                <option value="Tirupati">Tirupati</option>
                <option value="Thiruvananthpuram">Thiruvananthpuram</option>
                <option value="Udaipur">Udaipur</option>
                <option value="Ujjain">Ujjain</option>
                <option value="Varanasi">Varanasi</option>
                <option value="Vishakhapatnam">Vishakhapatnam</option>
              </select>
              <br/>
          </td>
          </tr>   
        <tr  align="center">
        <td>
        <input type="submit" name="Sort" id="Sort" value="Sort">
        </td>
        </tr>
          </table>
          </center>
          </form>
</body>
</html>