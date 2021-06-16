<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head> <%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Profile Summary</title>
</head>
<body style="background-color:powderblue;">
<h1 style="color:blue;font-family:verdana;">Personal Profile </h1> 
  <h3 style="color:red;"> Name : ${profile.name} </h3>
  <h4 style="color:red;">Qualification : ${profile.qualification}</h4>
  <h4 style="color:red;">Organization : ${profile.company}</h4>
  <h4 style="color:red;">Designation : ${profile.designation}</h4>
  <h4 style="color:red;">Location : ${profile.address}</h4>
  <h4 style="color:red;">Joined On : ${profile.createdDate}</h4>

<a href="http://localhost:8080/MyProfile/"> Home</a>
</body>
</html>