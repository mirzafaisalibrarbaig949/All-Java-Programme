<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Lato:ital@0;1&family=Open+Sans:wght@300&family=Playfair+Display&family=Roboto:wght@300;500&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Grocery</title>
<style>
body
{
	margin:0;
	padding:0; 
}
header
{
	width:100%;
	height:100vh;
		 
}
nav
{
	width:100%;
	height:10vh;
	display:flex;
	justify-content: space-between;
	height:26vh;
	width:100%;
	background-color: white;	
	align-items: center;

}
.menu
{

	margin-top:-1cm;
	margin-right:0.9cm;
	font-family: 'Roboto', sans-serif;
	width:75%;
	display:flex;
	
	justify-content: space-between;
}
.menu a
{
		text-decoration: none;
		color:#00c20d; 
	
}

h1
{
	color:#00c20d;
 	font-size:60px;
 	position:static;
 	margin-top:1cm;
	text-align: center; 
}
h3
{
	color:black;
 	font-size:18px;
 	text-align: center;
 	font-family: Arial, Helvetica, sans-serif;
 	margin-top:-1.3cm;
 	margin-left:-0.6cm;
 	position:static;


}

.img
{
	width:23.8cm;
	margin-top:1.7cm;
	position: static;
	
}

</style>
</head>
<body>

<header>
<nav>
<div><a href="Homepage.html"><img src="D:\Eclipse worksapce\KholaKhata\src\main\webapp\KholKhata.jpg" height=110px width=200px></a></div>
<div class="menu">
<a href="Homepage.html">Home</a>
<a href="AddProduct.jsp">AddProduct</a>
<a href="ShowProductServlet">ShowProduct</a>
<a href="Update.jsp">Update</a>
<a href="Delete.jsp">Delete</a>
<a href="Customer.jsp">Customer</a>
<a href="HistoryServlet.jsp">History</a>
<a href="LogoutServlet">Logout</a>
</div>
</nav>


<main>
<section class="title">
<h1>Business hua easy!</h1>
<h3>Manage Your Grocery Details with Digital solution</h3>
</section>

</main>
<img class="img" src="D:\Eclipse worksapce\KholaKhata\src\main\webapp\grocery.jpg">
</header>
<%--JSP --%>


</body>
</html>