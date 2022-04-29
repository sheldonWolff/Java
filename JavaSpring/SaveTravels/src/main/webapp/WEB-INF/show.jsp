<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Expense</title>
</head>
<body>
	<h1>Expense Details</h1>
	<a href="/">Go back</a>
	<table>
		<tr>
			<td>Expense Name: <c:out value="${expense.expenseName}"/></td>
		</tr>
		<tr>
			<td>Expense Description: <c:out value="${expense.description}"/></td>
		</tr>
		<tr>
			<td>Vendor: <c:out value="${expense.vendor}"/></td>
		</tr>
		<tr>
			<td>Amount Spent: $<c:out value="${expense.amount}"/></td>
		</tr>
	</table>
</body>
</html>