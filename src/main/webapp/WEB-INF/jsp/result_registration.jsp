<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<meta charset="ISO-8859-1">
<title>Result Registration</title>
</head>
<body>

	<div class="formstyle">
		<p>Login: ${param.login}</p>
		<p>Password: ${param.password}</p>

		<p>Name: ${param.name}</p>
		<p>Date of Birth: ${param.datebirth}</p>
		<p>Phone: ${param.phone}</p>
		<p>E-mail: ${param.email}</p>
		<p>Gender: ${param.gender}</p>
	</div>

</body>
</html>