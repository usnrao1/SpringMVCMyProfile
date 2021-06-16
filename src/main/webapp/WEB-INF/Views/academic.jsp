<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head><%@ page isELIgnored="false" %>
<meta charset="ISO-8859-1">
<title>Experience Summary</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
}
th {
  text-align: left;
}
</style>
</head>
<body style="background-color:khaki;">

<h1 style="color:blue;">Academic Credentials </h1> 
<table style="width:100%">
  <tr>
    <th>S.No</th>
    <th>Qualification</th>
    <th>Board/University</th>
    <th>Percentge</th>
    
  </tr>
  <tr>
    <td>1</td>
    <td>${aca.name}</td>
    <td>${aca.company}</td>
    <td>${aca.address}</td>
  </tr>
  <tr>
   	<td>2</td>
    <td>B.Tech</td>
    <td>JNTU Hyd</td>
    <td>73.3</td>
  </tr>
  <tr>
   	<td>3</td>
    <td>Intermediate</td>
    <td>BIE,A.P</td>
    <td>85.6</td>
  </tr>
  <tr>
   	<td>4</td>
    <td>SSC</td>
    <td>BSE</td>
    <td>88</td>
  </tr>
</table>
 
<a href="http://localhost:8080/MyProfile/"> Home</a>
</body>
</html>