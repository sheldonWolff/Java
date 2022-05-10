<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register/Login</title>
</head>
<body>
	<h1>Book Club</h1>
	<h4>A place for friends to share thoughts on books.</h4>
	<div>
		<h2>Register</h2>
		<form:form class="form" action="/register" method="post" modelAttribute="newUser">
			<div>
				<form:label path="name">Name:</form:label>
				<form:input type="text" path="name"/>
				<form:errors path="name"/>
			</div>
			<div>
				<form:label path="email">Email:</form:label>
				<form:input type="email" path="email"/>
				<form:errors path="email"/>
			</div>
			<div>
				<form:label path="password">Password</form:label>
				<form:input type="password" path="password"/>
				<form:errors path="password"/>
			</div>
			<div>
				<form:label path="confirm">Confirm Password:</form:label>
				<form:input type="password" path="confirm"/>
				<form:errors path="confirm"/>
			</div>
			<input type ="submit" value="Register"/>
		</form:form>
	</div>
	<div>
		<h2>Log in</h2>
		<form:form class="form" action="/login" method="post" modelAttribute="newLogin">
			<div>
				<form:label path="email">Email:</form:label>
				<form:input type="email" path="email"/>
			</div>
			<div>
				<form:label path="password">Password</form:label>
				<form:input type="password" path="password"/>
			</div>
			<input type ="submit" value="Login"/>
		</form:form>
	</div>
</body>
</html>