<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="login">
	Username: <input type="text" name="username" value="${cookie.username.value}" /><br/>
	Password: <input type="text" name="password" value="${coookie.password1.value}" /><br/>
	<label for="chkRememberMe">Remember Me</label> <input id="chkRememberMe" name="remember" type="checkbox" value="rememberMe" />
	<input type="submit" />
	<br/>

</form>
</body>
</html>