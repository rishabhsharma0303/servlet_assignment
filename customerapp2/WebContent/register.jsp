<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addCustomer" method="POST">
Customer ID:<input name="id"/><br>

Name:<input name="name"/><br>
Address: <textarea name="address" rows="4" cols="20"></textarea><br>
Mobile:<input name="mobile" size="9"/><br>

EMAIL:<input name="email" size="25"/><br><br>
<input type="submit" value="Add"/>
</form>
</body>
</html>