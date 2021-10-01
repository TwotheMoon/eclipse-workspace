
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
<%
	float f =2.3f;
	int i = Math.round(f);
	Date date = new Date();
%>

실수 f의 반올림값은: <%= i %><p>
현재의 날짜와 시간은: <%=date.toString() %>
</body>
</html>