<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world</h1>
<h1>Declaration Tag: </h1>
<%! int a=10; String b = "Text";  %>
<h1>Expression Tag: </h1>
<%= a %> <%= b %>
<h1>Scription Tag: </h1>
<%
	int sum = 10 + 20;
	out.println("Sum" + sum);
	
	int sub = sum -10;
	out.println("Sub" + sub);
%>
<h1 style="color: red"> Sum = <%= sum %> <%= sub %></h1>
</body>
</html>