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
		String id = "qwe";
		String pw = "123";
		
		session.setAttribute("idKey", id);
		session.setAttribute("pwKey", pw);
	%>
	<a href="viewSessionInfo.jsp"> 세션 정보 확인 페이지</a>
</body>
</html>