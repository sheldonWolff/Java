<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneExpense" items="${expenses}">
				<tr>
					<td><c:out value="${oneExpense.expenseName}"/></td>
					<td><c:out value="${oneExpense.vendor}"/></td>
					<td><c:out value="${oneExpense.amount}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h1>New Book</h1>
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