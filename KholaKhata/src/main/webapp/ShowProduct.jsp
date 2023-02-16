<%@page import="com.web.model.Grocery"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Product</title>
<style>
h1
{
	text-align: center;
	font-family: Arial, Helvetica, sans-serif;
	color: #00c20d;
	margin-top: 2cm;
}
table
{
	border-collapse: collapse;
	margin-top: 0cm;
	text-align: center;
	font-family: Arial, Helvetica, sans-serif;
	position:absolute;
	margin-left: 8.1cm;
	
}
tr td
{
	border: 1px solid #ddd;
	height: 50px;
	width:60px;
}
 table tr {
  border: 1px solid #ddd;
  padding: 8px;
}
table th {
  border: 1px solid #ddd;
  background-color: #00c20d;
  color:white;
  padding:15px;
  
}
.logo
{
	position:fixed;
	margin-top:0.5cm;
	height:3cm; 
}

img
{
	height:70px;
	width:120px;
	position: fixed;
	top:0.2cm;
	  
}

table tr:nth-child(even){background-color: #f2f2f2;}

table tr:hover {background-color: #ddd;}


</style>
</head>
<body>

<header>
<div class="logo">
<a href="Grocery.jsp">
<img src="C:\Users\jayakrushna.rout\Pictures\Saved Pictures\KholKhata.jpg" height=110px width=200px>
</a>
</div>
</header>
<h1>PRODUCT</h1>

<%
ServletContext ctx=request.getServletContext();
List<Grocery> list=(List<Grocery>)ctx.getAttribute("array");

%>
<form>
<table border=1 align="center">
<tr>
<th>ITEM</th>
<th>AVl_QUANTITY</th>
<th>UNIT</th>
<th>PRICE</th>
</tr>
<%
for(Grocery l:list)
{
%>
	<tr>
	<td><%= l.getItem() %></td>
	<td><%= l.getQuantity() %></td>
	<td><%= l.getUnit() %></td>
	<td><%= l.getPrice() %></td>
	</tr>	
<%
}
%>




</table>
</form>
</body>
</html>