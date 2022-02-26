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
<h4>Customer ID :  ${cid}</h4>
<h4>Customer Name :  ${cname}</h4>
<h4>Customer Email id : ${cemail}</h4>

<br>
<br>

<form action="back" method ="post">
	<input type="submit" value="Back">
</form>




</body>
</html>