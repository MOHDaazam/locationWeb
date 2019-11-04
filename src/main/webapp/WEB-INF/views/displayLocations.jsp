<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Locations</title>
</head>
<body>
	<h2>All Locations :</h2>
	<table>
		<tr>
			<th>ID</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
		</tr>
		<c:forEach items="${allLocations}" var="location">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="deleteLocation?id=${location.id} ">delete</a></td>
				<td><a href="editLocation?id=${location.id} ">edit</a></td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<a href="showCreate">Add Location</a>

</body>
</html>