<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="member" class="ch12.Member" scope="page"></jsp:useBean>
<jsp:setProperty name="member" property="*"></jsp:setProperty>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= member.getId() %>
	<%= member.getPw() %>
	<%= member.getConfirmPw() %>
	<%= member.getName() %>
	<%= member.getBirth() %>
	<%= member.getEmail() %>
</body>
</html>