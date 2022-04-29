<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<h1>Edit Expense</h1>
	<a href="/">Go Back</a>
	<form:form action="/expense/${expense.id}" method="post" modelAttribute="expense">
		<input type="hidden" name="_method" value="put">
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