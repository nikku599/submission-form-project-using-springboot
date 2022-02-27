<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Customers</title>
</head>
<body>

<h1>View Customer Details</h1>
<h2>Details are submitted as follows : </h2>

<form action="getdetails" method="post">
	<input type="number" name ="cid">
	<input type ="submit" value = "Submit">
</form>

<br>
<br>

<form action="back" method ="post">
	<input type="submit" value="Back">
</form>




</body>
</html>