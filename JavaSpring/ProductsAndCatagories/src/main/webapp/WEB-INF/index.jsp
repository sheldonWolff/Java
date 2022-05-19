<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>Home Page</h1>
	<a href="/new/product">New Product</a>
	<br/>
	<a href="/new/category">New Category</a>
	<hr>
	<table style="border:2px solid black;border-collapse:collapse; display:inline-block; height:200px; width:30%">
		<thead>
			<tr style="border:2px solid black">
				<td style="border:2px solid black; width:10%"><h2>Products</h2></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr style="border:2px solid black">
					<td style="border:2px solid black"><a href='/show/product/<c:out value="${product.id}"/>'><c:out value="${product.name}"/></a></td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
	<table style="border:2px solid black;border-collapse:collapse; display:inline-block; height:200px; width:30%">
		<thead>
			<tr style="border:2px solid black">
				<td style="border:2px solid black"><h2>Categories</h2></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${catagories}" var="catagory">
				<tr style="border:2px solid black">
					<td style="border:2px solid black; width:10%"><a href='/show/category/<c:out value="${catagory.id}"/>'><c:out value="${catagory.name}"/></a></td>
				</tr>
			</c:forEach>	
		</tbody>
	</table>
</body>
</html>