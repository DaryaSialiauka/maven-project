<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<meta charset="utf-8">
<title>Registration</title>
</head>
<body>
	<div class="formstyle">
		<h1>Registration</h1>
		<form action="Controller" method="post">
			<input type="hidden" name="command" value="DO_REGISTRATION" />
			<table>
				<tbody>
					<tr>
						<td>Login:</td>
						<td><input type="text" name="login" value="" required /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="text" id="first" name="password" value=""
							required /></td>
					</tr>
					<tr>
						<td>Repeat password:</td>
						<td><input type="text" id="second" required
							onBlur=onPassword() /></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>Name:</td>
						<td><input type="text" name="name" value="" required /></td>
					</tr>
					<tr>
						<td>Date of Birth:</td>
						<td><input type="date" name="datebirth" value="" required /></td>
					</tr>
					<tr>
						<td>Phone:</td>
						<td><input type="text" name="phone" value="" required
							pattern="\+375[\(]{0,1}[0-9]{2}[\)]{0,1}\d{3}[-]{0,1}\d{2}[-]{0,1}\d{2}"
							placeholder="+375(__)___-__-__" /></td>
					</tr>
					<tr>
						<td>E-mail:</td>
						<td><input type="email" name="email" value="" required /></td>
					</tr>
					<tr>
						<td>Gender:</td>
						<td><input type="radio" name="gender" value="male" required />Male<br />
							<input type="radio" name="gender" value="female" required />Female</td>
					</tr>
				</tbody>
			</table>
			<input type="checkbox" name="agreement" value="agreement" required />I
			agree to the processing of my personal data<br /> <input
				type="submit" class="bot1" value="Send"><br />
		</form>
	</div>
</body>
<script>
	function onPassword() {
		var elem_first = document.getElementById('first');
		var elem_second = document.getElementById('second');
		if (elem_first.value != elem_second.value) {
			elem_second.value = '';
			elem_second.style.borderColor = 'red';
		} else{
			elem_second.style = elem_first.style;
		}
	}
</script>
</html>
