<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.web.dao.DaoService"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>History Details</title>
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
	margin-top: 0.7cm;
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
	HttpSession s=request.getSession(false);
	String name=(String)s.getAttribute("name");
	Connection con=DaoService.getConnection();
	String sql="select * from "+name+"_history order by sell_date";
	PreparedStatement pst=con.prepareStatement(sql);
	
%>
<h1 class="table_name">CUSTOMER HISTORY</h1>
<form method="get" action="HistoryClearServlet">
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
	ResultSet rs=pst.executeQuery();
	while(rs!=null && rs.next())
	{
%>
		<tr>
		<td><%=rs.getDate(1)%></td>
		<td><%=rs.getString(2)%></td>
		<td><%=rs.getString(3)%></td>
		<td><%=rs.getFloat(4)%></td>
		<td><%=rs.getString(5)%></td>
		<td><%=rs.getFloat(6)%></td>
		<td><%=rs.getFloat(7)%></td>		
		</tr>

<%
	
	}
	pst.executeUpdate();
	con.close();
	
%>
</table>
</body>
</html>