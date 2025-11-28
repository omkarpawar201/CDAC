<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Number 1 : <%= request.getParameter("num1") %><br /> 
	Number 2 : <%= request.getParameter("num2") %><br /> 
	<%= request.getParameter("msg") %>
</body>
</html>