<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Teaching Experience</title>
</head>
<body style="background-color:lightpink;">
<h1 style="color:blue;">Teaching Experience </h1> 
  <h3> Organization : ${te.name} </h3>
  <h3> Designation: ${te.company}</h3>
  <h3> Department: ${te.address}</h3>
  <a href="http://localhost:8080/MyProfile/"> Home</a>
</body>
</html>