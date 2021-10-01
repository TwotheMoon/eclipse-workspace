<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% String id = request.getParameter("id");%>
	<% String pw = request.getParameter("pw");%>
	<div>당신의 아이디는 <%= id %></div> <br>
	<div>당신의 비밀번호는 <%= pw %></div> <br>
	
</body>
</html>