<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Category</title>
</head>
<body>
	<h1>New Category</h1>
	<a href="/">Home</a>
	<hr>
	<form:form action="/create/category" method="post" modelAttribute="catagory">
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name"/>
				<form:errors path="name"/>
			</div>
			<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>