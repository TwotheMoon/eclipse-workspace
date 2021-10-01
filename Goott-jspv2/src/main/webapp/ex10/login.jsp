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
	String pw = request.getParameter("pw");
	String ck = request.getParameter("autoLogin");

	String dbId = "qwe";
	String dbPw = "qwe";
	
	if(id.equals(dbId) && pw.equals(dbPw)){
		%>
	당신의 id : <%=id %> <br>
	당신의 pw : <%=pw %> <br>
	고객님이 자동로그인 체크를 하셨습니다.
	<a href="main.jsp">메인</a>
<% 
	Cookie cId = new Cookie("id", id);
	Cookie cPw = new Cookie("pw", pw);
	cId.setMaxAge(30);
	cPw.setMaxAge(30);
	response.addCookie(cId);
	response.addCookie(cPw);
	} else {
%>
	로그인 실패
<%
	}
%>

</body>
</html>