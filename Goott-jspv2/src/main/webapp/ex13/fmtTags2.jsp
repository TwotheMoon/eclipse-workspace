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
<c:set var="num" value="123456789"></c:set>
core태그 set으로 변수 num을 선언합니다. <br>
숫자 : <fmt:formatNumber value="${num}" type="number"></fmt:formatNumber> <br>
퍼센트 : <fmt:formatNumber value="${num}" type="percent" groupingUsed="true"></fmt:formatNumber> <br>
달러 : <fmt:formatNumber value="${num}" type="currency" currencySymbol="$"></fmt:formatNumber> <br>
패턴 : <fmt:formatNumber value="${num}" pattern="0.0000" groupingUsed="false"></fmt:formatNumber> <br>
<fmt:parseNumber var="i" integerOnly="true" value="123.456"></fmt:parseNumber>
실수를 제외한 정수 : <c:out value="${i}"></c:out>
</body>
</html>