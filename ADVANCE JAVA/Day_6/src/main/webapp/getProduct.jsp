<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="p" class="com.demo.beans.Product"></jsp:useBean>
	<jsp:setProperty property="*" name="p" />

	<h1>Product data:</h1>
	Product Id:
	<jsp:getProperty property="pid" name="p" />
	Product Name:
	<jsp:getProperty property="pname" name="p" />
	Product Quantity:
	<jsp:getProperty property="qty" name="p" />
	Product price:
	<jsp:getProperty property="price" name="p" />
</body>
</html>