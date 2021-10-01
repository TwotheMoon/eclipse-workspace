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
		String cookieName = "myCookie";
		Cookie cookie = new Cookie(cookieName, "Apple");
		cookie.setMaxAge(60);
		cookie.setValue("Melone");
		response.addCookie(cookie);
	%>

</body>

<a href="tasteCookie.jsp">쿠키</a>
</html>