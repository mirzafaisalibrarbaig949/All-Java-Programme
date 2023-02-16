<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://fonts.googleapis.com/css2?family=Lato&family=Open+Sans:wght@300&family=Playfair+Display&family=Roboto:wght@500&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css" />
    
<style type="text/css">
body
{
	background-color:white;
}

.logo
{
	position:fixed;
	margin-top:0cm;
	height:3cm; 
}

img
{
	height:70px;
	width:120px;
	margin-top:-0.5cm;  
}
.login
{
	height:75vh;
	width:11cm;
	background-color:#F5FFFA;
	border-radius:10px; 
	font-family: 'Lato', sans-serif;
	padding-top:0.5cm;
	border:2px solid #00c20d;
	position: static;
	margin-top: 1cm;
	 
}
h2
{
	margin-left:-7cm;
	margin-top: 0.4cm;
	font-size:26px;   
}
input[type=text]
{
	margin-top:0.2cm;
	width:8.5cm;;
	height:42px;
	border:2px solid #00c20d;
	border-radius:7px;
	transition:0.1s;
	font-size:20px; 
	padding-left:10px; 

}
input[type=text]:focus
{
	border:3px solid #87cefa; 
}
input[type=password]
{

	width:8.5cm;
	height:42px;  
	border-radius:7px;
	border:2px solid #00c20d;
	margin-top:0.8cm;  
	transition:0.1s; 
	font-size: 20px;
	padding-left:10px;

	 
	 
	
}
input[type=password]:focus
{
border:3px solid #87cefa; 

}

.submit
{
	margin-top:1.3cm;
	height:45px;
	width:9cm;
	border:none;
	border-radius:202px;
	background-color:#00c20d;
	color:white;
	text-align: center;
	font-size:20px;
	cursor: pointer;
}
a
{
	text-decoration: none;  

}

.submit:hover
{
	background-color:#00a300; 
}

.signup
{
	color:#00c20d; 
	 
}

.msg
{
	color:red;
	margin-top:-9.5cm;
	margin-left:9.5cm;  

}
.msg2
{
	color:red;
	margin-top:2cm;
	margin-left:10.2cm;  

}


</style>
</head>
<body>
<header>
<div class="logo">
<a href="Homepage.html">
<img src="C:\Users\jayakrushna.rout\Pictures\Saved Pictures\KholKhata.jpg" height=110px width=200px>
</a>
</div>
</header>
<center><section class="login">
<form method="get" action="LoginValidation">

<h2>Log in</h2>
<table>
<tr>
<td><input type="text" name="name" placeholder="User name"></td>
</tr>
<tr>
<td><input id="password" type="password" name="password" placeholder="Password"></td>
</tr>

</table>
<input type="submit" value="Log in" class="submit">

</form>
<p>Need an account? &nbsp; <a class="signup" href="Signup.jsp">Sign up</a></p>
</section>
</center>

<%--JSP code --%>
<%
	String msg=(String)request.getAttribute("msg");
	String msg2=(String)request.getAttribute("msg2");


%>
<p class="msg">
${msg}
<p>
<p class="msg2">
${msg2}
<p>


</body>
</html>