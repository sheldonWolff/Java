<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
	<div>
		<a href="/dojos">Dashboard</a>
		<h1>New Ninja</h1>
		
		<form:form action="/ninjas" method="post" modelAttribute="ninja">
			<div>
				<form:label path="firstName">First Name:</form:label>
				<form:input type="text" path="firstName"/>
			</div>
			<div>
				<form:label path="lastName">Last Name:</form:label>
				<form:input type="text" path="lastName"/>
			</div>
			<div>
				<form:label path="age">Age:</form:label>
				<form:input type="number" path="age"/>
			</div>
			<div>
				<form:label path="dojo">Select Dojo:</form:label>
				<form:select path="dojo">
					<c:forEach var="oneDojo" items="${dojos}">
						<form:option value="${oneDojo.id}">
								<c:out value="${oneDojo.location}"/>
						</form:option>
					</c:forEach>
				</form:select>
			</div>
			<input type="submit" value="Create"/>
		</form:form>
	</div>
</body>
</html>