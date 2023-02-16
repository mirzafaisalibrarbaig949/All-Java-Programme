<%@page import="com.web.model.GroceryHistory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.web.model.GroceryHistory"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerList</title>
<style type="text/css">
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
.table_name
{
	text-align: center;
	font-family: Arial, Helvetica, sans-serif;
	color: #00c20d;
	margin-top: 1cm;
}
table
{
	border-collapse: collapse;
	margin-top: 0.2cm;
	text-align: center;
	font-family: Arial, Helvetica, sans-serif;
	position:absolute;
	margin-left: 2.3cm;
	
}
tr td
{
	border: 1px solid #ddd;
	height: 50px;
	width:100px;
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


table tr:nth-child(even)
{
	background-color: #f2f2f2;
}

table tr:hover 
{
	background-color: #ddd;
}

#clear
{
	border: none;
	background-color: #00c20d;:
	font-family: Arial, Helvetica, sans-serif;
	cursor: pointer;
	color:white;
	padding: 8px;
	font-weight:bold;
	border-radius:6px;
	position:absolute;
	margin-left: 21cm;
	margin-top:-1.3cm; 
}
#clear:hover 
{
		background-color:#00a300; 
	
}
h3
{
		font-family: Arial, Helvetica, sans-serif;
		position:relative;
		margin-left:2.4cm;
		  
}
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
<%
	List<GroceryHistory> list=(List<GroceryHistory>)request.getAttribute("list");
	double total_amount=0;
%>

<h1 class="table_name">CUSTOMER LIST</h1>
<form method="get" action="ClearListServlet">
<input type="submit" value="CLEAR" id="clear">
</form>
<table>
<tr>
<th>DATE</th>
<th>CUSTOMER NAME</th>
<th>ITEM</th>
<th>QUANTITY</th>
<th>UNIT</th>
<th>ITEM PRICE</th>
<th>TOTAL PRICE</th>
</tr>
<%
	for(GroceryHistory g:list)
	{
%>
		<tr>
		<td><%=g.getDate() %></td>
		<td><%=g.getName() %></td>
		<td><%=g.getItems()%></td>
		<td><%=g.getQuantity()%></td>
		<td><%=g.getUnit()%></td>
		<td><%=g.getItemprice()%></td>
		<td><%=g.getTotalPrice()%></td>
		</tr>

<%
	
	total_amount+=g.getTotalPrice();
	}
	out.print("<br>");
	
	out.print("<h3>Total Amount to be payed "+total_amount+"</h3>");
%>

</table>
</body>
</html>