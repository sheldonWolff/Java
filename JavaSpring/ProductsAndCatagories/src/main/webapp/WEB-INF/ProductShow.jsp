<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>
	<h1><c:out value="${product.name}"/></h1>
	<a href="/">Home</a>
	<hr>
	<h2>Categories:</h2>
	<br/>
	<c:forEach items="${product.categories}" var="catagory">
		<c:out value="${catagory.name}"/>
		<br/>
	</c:forEach>
	<hr>
	<form action="/add/category/to/product" method="post">
			<p>Add Category:</p>
			<br/>
			<select name="categories">
				<c:forEach var="catagory" items="${catagories}">
					<option value="${catagory.id}">
						<c:out value="${catagory.name}"/>
					</option>
				</c:forEach>
			</select>
			<br/>
		<input type="submit" value="Add"/>
	</form>
</body>
</html>