<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*"  %>
    <%@page session="false"  %>
    <%@page isELIgnored="false"  %>
    <%@page errorPage="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<h1>Time <%=new Date().toString() %></h1>
</body>
</html>