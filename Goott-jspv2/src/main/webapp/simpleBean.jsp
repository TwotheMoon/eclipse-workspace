<%@page import="ch09.SimpleBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="test" class="ch09.SimpleBean" scope="page"></jsp:useBean>
<jsp:setProperty name="test" property="message" value="빈을 쉽게 정복하자!"></jsp:setProperty>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

message: <jsp:getProperty property="message" name="test"/>

<%=test.callByScriptlet() %>

</body>
</html>