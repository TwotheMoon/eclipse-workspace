<%@page import="ch14.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="member" class="ch14.MemberBean" scope="page"></jsp:useBean>
<jsp:setProperty name="member" property="*"></jsp:setProperty>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String hobby[] = request.getParameterValues("hobby");
	%>
	아이디 : <jsp:getProperty name="member" property="id"></jsp:getProperty> <br>
	패스워드 : <jsp:getProperty name="member" property="pw"></jsp:getProperty> <br>
	패스워드 확인 : <jsp:getProperty name="member" property="pw_confirm"></jsp:getProperty> <br>
	이름 : <jsp:getProperty name="member" property="name"></jsp:getProperty> <br>
	생일 : <jsp:getProperty name="member" property="birth"></jsp:getProperty> <br>
	성별 : <jsp:getProperty name="member" property="gender"></jsp:getProperty> <br>
	취미 : <%
		for(int i = 0; i < hobby.length; i++){
			out.print(hobby[i] + " ");
		}
	%> <br>
	지역 : <jsp:getProperty name="member" property="city"></jsp:getProperty> <br>

</body>
</html>