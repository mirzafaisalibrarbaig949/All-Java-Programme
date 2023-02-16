<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This home page</h1>
	<h1>This home page</h1>
	<h1>url /home</h1>
	<h1>Name is Mirza</h1>
	<%-- <%
	String name = (String) request.getAttribute("name");
	String name1 = (String) request.getAttribute("name1");
	List<String> friends=(List<String>)request.getAttribute("f");
	%> --%>
	<h1>
		Name is :
		<%-- <%=name%> --%>
		${name }
	</h1>
	<h1>
		Name is :
		<%-- <%=name1%> --%>
		${name1 }
	</h1>
	
	
	<%-- <%
	for(String s:friends){
		%>
		<h1><%=s %></h1>	
	<%
	}
	%> --%>
	<c:forEach var="friends" items="${f}">
		<h1>${friends}</h1>
	
	</c:forEach> 
</body>
</html>