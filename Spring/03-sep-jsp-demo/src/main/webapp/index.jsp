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
<form method="post" action="maths">
	Number 1: <input type="number" name="no1" value="${param.no1 }" /><br/>
	Number 2: <input type="number" name="no2" value="${param.no2 }" /><br/>
	<input type="submit" />
	<br/>
	<%
		String result=request.getParameter("result");
		if(result!=null)
			out.print(result);
	
	%>
</form>
</body>
</html>