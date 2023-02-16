<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeleteProduct</title>
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
	margin-top:-0.9cm;
	
}
img
{
	height:70px;
	width:120px;
	margin-top:-0.8cm;  
}

.update
{
	height:65vh;
	width:9.7cm;
	background-color:#F5FFFA;
	margin-top:70px;
	border-radius:20px; 
	font-family: 'Lato', sans-serif;
	padding-top:0.5cm;
	border:2px solid #00c20d;
	
	 
}
h2
{
	margin-left:-3.2cm;
	margin-top: 0.4cm;
	font-size:26px;   
}
input[type=text]
{
	margin-top:0.4cm;
	width:7.4cm;;
	height:36px;
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

.submit
{
	margin-top:1.5cm;
	height:39px;
	width:7.9cm;
	border:none;
	border-radius:25px;
	background-color:#00c20d;
	color:white;
	text-align: center;
	font-size:20px;
	cursor: pointer;
}
#amount_type
{
	height:40px;
	width:1.5cm;
	font-size: 20px;
	border-style: none;
	position: absolute;
	margin-top: -2.92cm;
	margin-left: 8.38cm;
	background-color: white;
	
	

}
option
{

	border: none;
}
a
{
	text-decoration: none;  

}

.submit:hover
{
	background-color:#00a300; 
}





</style>
</head>
<body>

<div class="logo">
<a href="Grocery.jsp">
<img src="C:\Users\jayakrushna.rout\Pictures\Saved Pictures\KholKhata.jpg" height=110px width=200px>
</a>
</div>
<center>
<section class="update">
<form method="get" action="DeleteServlet">

<h2>Delete Product</h2>
<table>
<tr>
<td><input type="text" name="item" placeholder="Item name"></td>
</tr>
</table>
</select>
<input type="submit" value="Remove" class="submit">

</form>
</section>
</center>

</body>
</html>