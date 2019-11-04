<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
<h1>To add Location :</h1>
<p style="color:green;">${msg}</p>
<form action ="saveLoc" method ="post">
<pre>
id : <input type ="text" name ="id" />
code : <input type ="text" name ="code"/>
name : <input type ="text" name ="name"/>
type :  Urban <input type = "radio" name  ="type" value="urban"/>
Rural <input type = "radio" name  ="type" value="rural"/>

<input type ="submit" value ="SAVE"/>



</pre>
</form><br>
<a href = "displayLocations">View All =></a>


</body>
</html>