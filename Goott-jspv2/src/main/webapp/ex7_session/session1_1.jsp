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
		
		String season = request.getParameter("season");
		String fruit = request.getParameter("fruit");
		String id = (String)session.getAttribute("idkey");
		
		String sessionId = session.getId();
		
		int intervalTime = session.getMaxInactiveInterval();
		
		if(id != null){
	%>
		<b><%=id %></b> 님이 좋아하시는 계절과 과일은? <br>
		<b><%=season %></b>과 <b><%=fruit %></b> 입니다. <br>
		세션 ID : <%=sessionId %> <br>
		세션 유지 시간 : <%= intervalTime%>
	<%
		} else {
			out.println("세션 다됨");
		}
	%>
	
	
</body>
</html>