<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Book</title>
</head>
<body>
	<div>
		<h1>Add a Book to Your Shelf!</h1>
		<a href="/home">back to the shelves</a>
		
		<form:form action="/new" method="post" modelAttribute="book">
			<div>
				<form:label path="title">Title:</form:label>
				<form:input type="text" path="title"/>
				<form:errors path="title"/>
			</div>
			<div>
				<form:label path="author">Author:</form:label>
				<form:input type="text" path="author"/>
				<form:errors path="author"/>
			</div>
			<div>
				<form:label path="thoughts">My Thoughts:</form:label>
				<form:input type="text" path="thoughts"/>
				<form:errors path="thoughts"/>
			</div>
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</html>