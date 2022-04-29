<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expenses</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneExpense" items="${expenses}">
				<tr>
					<td><a href="/show/${oneExpense.id}"><c:out value="${oneExpense.expenseName}"/></a></td>
					<td><c:out value="${oneExpense.vendor}"/></td>
					<td><c:out value="${oneExpense.amount}"/></td>
					<td><a href="/expense/${oneExpense.id}/edit">Edit</a></td>
					<td><form action="/expense/${oneExpense.id}/delete" method="post">
						<input type="hidden" name="_method" value="delete">
						<input type="submit" value="Delete">
					</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h1>New Expense</h1>
	<form:form action="/expense" method="post" modelAttribute="expense">
	    <p>
	        <form:label path="expenseName">Expense Name</form:label>
	        <form:errors path="expenseName"/>
	        <form:input path="expenseName"/>
	    </p>
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description"/>
	        <form:textarea path="description"/>
	    </p>
	    <p>
	        <form:label path="vendor">Vendor</form:label>
	        <form:errors path="vendor"/>
	        <form:input path="vendor"/>
	    </p>
	    <p>
	        <form:label path="amount">Amount</form:label>
	        <form:errors path="amount"/>     
	        <form:input type="number" path="amount"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form> 
</body>
</html>