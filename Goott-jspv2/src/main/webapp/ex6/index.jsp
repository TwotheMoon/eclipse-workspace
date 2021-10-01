<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%String serverInfo = application.getServerInfo(); %>
<%= serverInfo %>
<br>

<%String mimeType = application.getMimeType("request1.html"); %>
<%= mimeType %>
<br>

<%String realPath = application.getRealPath("/"); %>
<%= realPath %>
<br>

<%JspWriter jw = pageContext.getOut();%>
<%= jw %>

<jsp:include page="/ex5/noCache.jsp"></jsp:include>
</body>
</html>