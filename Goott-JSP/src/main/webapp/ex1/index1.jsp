<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	include 를 이용해 다른 페이지에서 데이터 처리후 포함 (만약forward 로 보내면 이 글은 보이지 않음) 
	<br><br>
	
	<jsp:include page="index2.jsp" >
		<jsp:param name="name" value='<%=URLEncoder.encode("더문") %>' />
	</jsp:include>
	<br>
	

</body>
</html>