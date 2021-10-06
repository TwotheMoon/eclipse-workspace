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
	<c:if test="${param.id != null}">
		${param.id}
	</c:if>
	<c:if test="${param.id == ''}">
		Guest
	</c:if>
	<c:choose>
		<c:when test="${param.color == 'yellow'}">
			<c:set var="c" value="노란색"></c:set>
		</c:when>
		<c:when test="${param.color == 'blue'}">
			<c:set var="c" value="파란색"></c:set>
		</c:when>
		<c:when test="${param.color == 'orange'}">
			<c:set var="c" value="주황색"></c:set>
		</c:when>
		<c:when test="${param.color == 'pink'}">
			<c:set var="c" value="분홍색"></c:set>
		</c:when>
		<c:otherwise>
			<c:set var="c" value="검정색"></c:set>
		</c:otherwise>
	</c:choose>
	님이 좋아하는 색상은 <font color="${param.color}">${c}</font>
</body>
</html>