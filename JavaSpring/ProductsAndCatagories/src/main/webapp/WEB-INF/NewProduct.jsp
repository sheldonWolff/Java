<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<h1>New Product</h1>
	<a href="/">Home</a>
	<hr>
	<form:form action="/create/product" method="post" modelAttribute="product">
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name"/>
				<form:errors path="name"/>
			</div>
			<div>
				<form:label path="description">Description:</form:label>
				<form:input type="text" path="description"/>
				<form:errors path="description"/>
			</div>
			<div>
				<form:label path="price">Price:</form:label>
				<form:input type="number" path="price"/>
				<form:errors path="price"/>
			</div>
			<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>