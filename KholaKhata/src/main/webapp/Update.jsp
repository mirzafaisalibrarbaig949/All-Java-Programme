<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateProduct</title>
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
	margin-top:0.5cm;
	
}
img
{
	height:70px;
	width:120px;
	margin-top:-0.8cm;  
}

.update
{
	height:80vh;
	width:11cm;
	background-color:#F5FFFA;
	margin-top:20px;
	border-radius:20px; 
	font-family: 'Lato', sans-serif;
	padding-top:0.5cm;
	border:2px solid #00c20d;
	
	 
}
h2
{
	margin-left:-4.1cm;
	margin-top: 0.4cm;
	font-size:26px;   
}
input[type=text]
{
	margin-top:0.3cm;
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

.submit
{
	margin-top:1.7cm;
	height:45px;
	width:9cm;
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
<form method="get" action="UpdateServlet">

<h2>Update Grocery</h2>
<table>
<tr>
<td><input type="text" name="item" placeholder="Item name"></td>
</tr>
<tr>
<td><input id="quantity" type="text" name="quantity" placeholder="Quantity"></td>
</tr>

<tr>
<td><input id="amount" type="text" name="amount" placeholder="Amount"></td>

</tr>

</table>
<select id="amount_type" name="select">
<option value="kg">Kg</option>
<option value="gram">Gm</option>
<option value="litre">Ltr</option>
<option value="litre">Ml</option>

</select>
<input type="submit" value="Submit" class="submit">

</form>
</section>
</center>

</body>
</html>