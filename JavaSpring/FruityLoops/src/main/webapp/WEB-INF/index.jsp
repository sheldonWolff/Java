<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruity Loops</title>
</head>
<body>
	<h1>Fruit Store</h1>
	<table style="width: 250px">
		<thead >
			<tr >
				<td>Name</td>
				<td>Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneItem" items="${fruits}">
				<tr>
					<td><c:out value="${oneItem.name}"/></td>
					<td><c:out value="${oneItem.price}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>