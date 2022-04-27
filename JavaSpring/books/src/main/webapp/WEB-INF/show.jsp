<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One Book</title>
</head>
<body>
	<h1>TEST!!!</h1>
	<p><c:out value="${book.title}"/></p>
	<p><c:out value="${book.description}"/></p>
</body>
</html>