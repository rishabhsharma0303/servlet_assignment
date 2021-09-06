
<%@page import="com.customer.dao.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Customer customer=(Customer)session.getAttribute("customer");
	out.println(customer.getName()+"<br/>");
	out.println(customer.getEmail()+"<br/>");
	out.println(customer.getMobile()+"<br/>");
%>
</body>
</html>