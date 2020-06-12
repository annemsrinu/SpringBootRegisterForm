<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
</head>

<body>
<div>
	<form:form action="/loginSub" modelAttribute="loginform">
		<table>
			<tr>
				<th colspan="3">Login Form</th>
			</tr>
			<tr>
				<td>UserName:</td>
				<td><form:input path="username" size="20" /></td>

			</tr>

			<tr>
				<td>Password:</td>
				<td><form:input path="password" size="20" /></td>

			</tr>

			<tr>
				<td></td>
				<td><input type="submit" name="login" value="Login" size="40"></td>
				</tr>
			<tr></tr>
			<tr></tr>
			<tr>
				<td></td>
				<td>New User : <a href="register">Register</a>
					</td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>