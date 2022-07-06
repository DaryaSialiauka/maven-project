<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<meta charset="utf-8">
<title>Authorization</title>
</head>

<body>
	<div class="formstyle">
		<h1>Hello</h1>
		<form action="Controller" method="post">
			<input type="hidden" name="command" value="DO_AUTHORIZATION" />
			<table>
				<tbody>
					<tr>
						<td>Login:</td>
						<td><input type="text" name="login" value="" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" name="password" value="" /></td>
					</tr>
				</tbody>
			</table>
			<input class="bot1" type="submit" value="Send" /><br />
		</form>
		<div class="other">
			Are you not registered?<a href="Controller?command=GO_TO_REGISTRATION_PAGE">Here</a>
		</div>
	</div>
</body>


</html>