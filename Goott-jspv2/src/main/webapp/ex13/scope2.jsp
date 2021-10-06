<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("msg", "꿈은 이루어 진다.");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	msg(scope로 받은 값) : ${pageScope.msg} <br>
	1에서 10까지 합(request로 받은 값) : <%=request.getAttribute("sum") %> <br>
	1에서 10까지 합(requestScope로 받은 값) : ${requestScope.sum} <br>
</body>
</html>