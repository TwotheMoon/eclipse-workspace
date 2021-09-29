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
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String userType = request.getParameter("userType");
	if(userType.equals("user")) {
	%>		
	<jsp:forward page="userMain.jsp">
		<jsp:param name="userName" value='<%=URLEncoder.encode("유저", "UTF-8")%>' />
	</jsp:forward>
	<%
		} else {
	%>

	<jsp:forward page="managerMain.jsp">
		<jsp:param name="userName" value='<%=URLEncoder.encode("매니저", "UTF-8")%>' />
	</jsp:forward>

	<%
		}
	%>
	
	
</body>
</html>