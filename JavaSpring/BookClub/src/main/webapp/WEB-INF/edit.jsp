<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
</head>
<body>
	<h1>Change your Entry</h1>
	<a href="/home">back to the shelves</a>
	<form:form action="/book" method="post" modelAttribute="book">
		<input type="hidden" name="_method" value="put"/>
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
			<form:input type="hidden" path="id" value="${book.id}"/>
			<input type="submit" value="Submit"/>
		</form:form>
		<form:form action="/book/${book.id}/delete" method="post">
						<input type="hidden" name="_method" value="delete">
						<input type="submit" value="Delete" style="background-color: red">
		</form:form>
</body>
</html>