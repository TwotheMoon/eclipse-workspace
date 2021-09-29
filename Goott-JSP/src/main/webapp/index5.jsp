<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 1. 페이지 정보 출력 --%>
<%@page info="Copyright 2021" %> 

<%-- 2. 세션 사용 유무 (기본값 유)--%>
<%@page session="true" %>   

<%-- 3. 버퍼 정의 8kb 기본값--%>
<%@page buffer="8kb" %>   

<%-- 4. 버퍼가 다 찻을 경우 true: 를러시 하고 계속작업 false: 에외를 발생시키고 작업 중지 --%>
<%@page autoFlush="true"%>   

<%-- 5. 다증 스레드에서 JSP의 동작을 제어하기위해 사용--%>
<%@page isThreadSafe="true" %>   

<%-- 6. 외부파일 임포트 --%>
<%@page import="java.util.*"%>   

<%-- 6. 에러시 동작할 파일 지정 및 사용 --%>
<%@page errorPage="errorpage.jsp"%>
<%@page isErrorPage="true" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- page info --%>
<%=this.getServletInfo() %>

<%-- page info --%>
<%@ include file="bot.jsp" %>
<%@ jsp:incude page="http:localhost:3000" %>

</body>
</html>