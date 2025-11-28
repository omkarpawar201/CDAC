<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.html"%>
	<form action="result.jsp">
		Number 1 : <input type="text" name="num1" id="num1"><br>
		Number 2 : <input type="text" name="num2" id="num2"><br>
		<button type="submit" name="btn" value="add">Addition</button>
		<button type="submit" name="btn" value="fact">Factorial</button>
	</form>
	<%@ include file="footer.html"%>

</body>
</html>