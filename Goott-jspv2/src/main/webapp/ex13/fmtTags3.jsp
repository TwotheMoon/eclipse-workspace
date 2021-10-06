<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="dayTime" value="<%=new Date() %>"></c:set>
<fmt:formatDate value="${dayTime}" type="date" dateStyle="full"/><br>
<fmt:formatDate value="${dayTime}" type="time"/><br>

<fmt:timeZone value="Europe/Lundon">
	유럽 : <fmt:formatDate value="${dayTime}" type="both" dateStyle="full" timeStyle="full"/>
</fmt:timeZone>

<fmt:setTimeZone value="America/New_York"></fmt:setTimeZone>
	아메리카 : <fmt:formatDate value="${dayTime}" type="both" dateStyle="full" timeStyle="full"/>
</body>
</html>