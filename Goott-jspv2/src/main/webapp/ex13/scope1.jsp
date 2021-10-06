<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int sum = 0;
	for(int i = 0; i <= 10; i++) sum += 1;
	request.setAttribute("sum", new Integer(sum));
	%>
	<jsp:forward page="scope2.jsp"></jsp:forward>
</body>
</html>