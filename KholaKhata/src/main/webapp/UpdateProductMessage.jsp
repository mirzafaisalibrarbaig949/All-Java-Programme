<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SavedMessage</title>
<style type="text/css">
h1
{
	
	font-size:50px;
	text-align: center;
	margin-top:4cm;   

}
.logo
{
	position:fixed;
	margin-top:-3.8cm;
	height:3cm; 
}

img
{
	height:70px;
	width:120px;
	 
	 
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
String m=(String)request.getAttribute("msg");	
String item=(String)request.getAttribute("item");
if(m.equals(item+" Updated Successfully"))
{
	out.print("<font color='#00c20d'>");
	out.print("<h1>"+m+"</h1>");	
	out.print("</font>");
}
else
{
	out.print("<font color='red'>");
	out.print("<h1>"+m+"</h1>");
	out.print("</font>");
	
}
%>


</body>
</html>