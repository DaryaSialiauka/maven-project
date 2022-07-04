<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Entrance</title>
</head>

<body>
<h1>Hello</h1>
	<form action="../Controller" method="post">
		<input type="hidden" name="command" value="entrance" /> 
		
		Enter login:<br />
		<input type="text" name="login" value="" /><br /> 
		Enter password:<br />
		<input type="password" name="password" value="" /><br /> 
		
		<input type="submit" value="Send" /><br />
	</form>
</body>
	
	
</html>