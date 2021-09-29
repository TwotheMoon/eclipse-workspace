<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<div>forward Tag의 포워딩 되기 전의 페이지입니다.</div>
	<jsp:forward page="forwardTag1_2.jsp" />
	
</body>
</html>