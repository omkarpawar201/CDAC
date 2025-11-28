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
	
	<%!
	public int factorial(int num){
		int fact = 1;
		
		for(int i = 1; i <= num; i++){
			fact = fact * i;
		}
		return fact;
	}
	%>
	
	<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	String btn = request.getParameter("btn");
	
	if(btn.equals("add")){
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int ans = num1 + num2;
	%>
	<h2>
		Addition : <%=ans%></h2>
	<%
	}
	else if(btn.equals("fact")){ 
		int fact = factorial(num1); 
	
	%>
	<h2>
		Factorial : <%=fact %>
	</h2>
	<%} %>

	<%@ include file="footer.html"%>

</body>
</html>