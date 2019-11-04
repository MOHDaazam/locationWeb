<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Location Page</title>
</head>
<body>
	<h1>To Edit Location =></h1>
	<p style="color: green;">${msg}</p>
	<form action="saveLoc" method="post">
		<pre>
id : <input type="text" name="id"  value ="${location.id} " readonly/>
code : <input type="text" name="code"  value ="${location.code} "/>
name : <input type="text" name="name"  value ="${location.name} " />
type :  Urban <input type="radio" name="type" value="urban" ${location.type == 'urban'?'checked':''} />
Rural <input type="radio" name="type" value="rural" ${location.type == 'rural'?'checked':''}/>

<input type="submit" value="SAVE" />



</pre>
	</form>
	<br>
	<a href="displayLocations">View All =></a>


</body>
</html>