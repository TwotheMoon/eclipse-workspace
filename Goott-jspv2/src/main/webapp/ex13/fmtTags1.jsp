<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fmt:setLocale value="ko_kr"/>
<fmt:requestEncoding value="UTF-8"/>
name: <%=request.getParameter("name") %><br>
<form method="post">
	name: <input type="text" name="name">
	<input type="submit">
</form>
</body>
</html>