<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 >${Header}</h2>
	<p>${Instruction}</p>
	<h1 style="color:green">${msg}</h1>
	
	<h1>Name is :${user.user_name}</h1>
	<h1>Password is :${user.user_password }</h1>
	<h1>Email is :${user.user_email }</h1>


</body>
</html>