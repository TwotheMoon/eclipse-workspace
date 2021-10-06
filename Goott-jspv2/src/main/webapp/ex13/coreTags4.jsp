<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="http://localhost/Goott-jspv2/ex13/coreTags2.jsp">
	<c:param name="id" value="JSPStudy"></c:param>
	<c:param name="color" value="orange"></c:param>
</c:import>

<c:url var="url1" value="https://www.google.com">
	<c:param name="q" value="JSPStudy"></c:param>
	<c:param name="safe" value="off"></c:param>
</c:url>

<a href="${url1}"> 구글에서 JSPStudy 검색
</body>
</html>