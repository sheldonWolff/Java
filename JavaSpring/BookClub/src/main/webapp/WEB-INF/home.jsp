<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<h1>Welcome, <c:out value="${newUser.name}"/></h1>
	<p>Books from everyone's shelves.</p>
	<div>
		<a href="/logout">logout</a>
		<a href="/books/new">+ Add a book to my shelf</a>
	</div>
	<table>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author Name</th>
			<th>Posted By</th>
		</tr>
		<c:forEach items="${books}" var="book">
			<tr>
				<td><c:out value="${book.id}"/></td>
				<td><a href='/books/<c:out value="${book.id }"/>/edit'><c:out value="${book.title}"/></a></td>
				<td><c:out value="${book.author}"/> </td>
				<td><c:out value="${book.user.name}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>