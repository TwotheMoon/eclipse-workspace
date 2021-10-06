<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String str1 = "JAVA의 JSTL";
	String str2 = null;
%>

<c:set var="str3" value="JSPStudy" scope="page" />
<c:set var="str4" value="JSTL" scope="session"></c:set>
	<c:out value="<%=str1 %>" default="기본출력값"></c:out>
	<c:out value="<%=str2 %>" default="기본출력값"></c:out>
	<c:out value="${str3}" default="기본출력값"></c:out>
	<c:remove var="str4"/>
	${str3}의 ${str4}
	<%String s = (String)pageContext.getAttribute("str3"); %>
	<font color="red"><b><%=s %></b></font>
</body>
</html>