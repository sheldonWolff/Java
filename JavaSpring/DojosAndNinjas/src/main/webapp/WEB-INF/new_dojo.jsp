<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos</title>
</head>
<body>
	<div>
		<a href="/dojos">Dashboard</a>
		<a href="/ninjas">Register a New Ninja</a>
		<h1>New Dojo</h1>
		
		<form:form class="form" action="/dojos" method="post" modelAttribute="dojo">
		
			<div>
				<form:errors path="location" class="errors"></form:errors>
				<form:label path="location">Location:</form:label>
				<form:input type="text" path="location"/>
			</div>
			<input type ="submit" value="Create"/>
		</form:form>
		<table>
			<tr>
				<th>Location</th>
				<th>Actions</th>
			</tr>
			<c:forEach items="${dojos}" var="dojo">
				<tr>
					<td><c:out value="${dojo.location}"/></td>
					<td><a href='/dojos/<c:out value="${dojo.id }"/>'>See Students</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>