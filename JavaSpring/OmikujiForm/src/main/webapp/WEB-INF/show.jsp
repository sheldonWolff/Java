<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Form</title>
</head>
<body>
	<h2>Here's Your Omikuji!</h2>
	<div style="width:100px; background-color:lightblue; border:2px solid black">
		<p><c:out value="${result}"></c:out></p>
	</div>
	<a href="/">Go Back</a>
</body>
</html>