<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
</head>
<body>
	<h1>Send an Omikuji</h1>
	<form action='/submitForm' method='post'>
		<label>Pick any number from 5 to 25</label>
		<br/>
		<input type="number" min=5 max=25 name='number'>
		<br/>
		<label>Enter the name of any city</label>
		<br/>
		<input type="text" name="city">
		<br/>
		<label>Enter the name of any real person</label>
		<br/>
		<input type="text" name='person'>
		<br/>
		<label>Enter professional endeavor or hobby</label>
		<br/>
		<input type='text' name='hobby'>
		<br/>
		<label>Enter any type of living thing</label>
		<br/>
		<input type='text' name='animal'>
		<br/>
		<label>Say something nice to someone</label>
		<br/>
		<textarea name='compliment' cols='30' rows='5'></textarea>
		<br/>
		<label>Send and show a friend</label>
		<br/>
		<input type='submit' value='Send'>
	</form>
</body>
</html>