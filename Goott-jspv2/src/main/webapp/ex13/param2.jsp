<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	name: ${param['name'] }
	hobby: ${paramValues.hobby[0]} &nbsp;
	hobby: ${paramValues.hobby[1]} &nbsp;
	hobby: ${paramValues.hobby[2]} &nbsp;
	hobby: ${paramValues.hobby[3]} &nbsp;
	hobby: ${paramValues.hobby[4]}
</body>
</html>