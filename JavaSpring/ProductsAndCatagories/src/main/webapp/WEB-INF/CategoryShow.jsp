<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Page</title>
</head>
<body>
	<h1><c:out value="${catagory.name}"/></h1>
	<a href="/">Home</a>
	<hr>
	<h2>Products:</h2>
	<br/>
	<c:forEach items="${catagory.products}" var="product">
		<c:out value="${product.name}"/>
		<br/>
	</c:forEach>
	<hr>
	<form action="/add/product/to/category" method="post">
			<p>Add Product:</p>
			<br/>
			<select name="products">
				<c:forEach var="product" items="${products}">
					<option value="${product.id}">
						<c:out value="${product.name}"/>
					</option>
				</c:forEach>
			</select>
			<br/>
		<input type="submit" value="Add"/>
	</form>
</body>
</html>