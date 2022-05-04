<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Dojo</title>
</head>
<body>
	<h1><c:out value="${dojo.location}"/> Location Ninjas</h1>
	<table>
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneNinja" items="${dojo.ninjas}">
				<tr>
					<td><c:out value="${oneNinja.firstName}"/></td>
					<td><c:out value="${oneNinja.lastName}"/></td>
					<td><c:out value="${oneNinja.age}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>