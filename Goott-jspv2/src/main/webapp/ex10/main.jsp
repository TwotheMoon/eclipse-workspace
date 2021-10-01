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
		Cookie[] cookies = request.getCookies();
		String userId;
		String userPw;
	if(cookies != null){
			for(int i = 0; i < cookies.length; ++i){
				if(cookies[i].getName().equals("id")){
					 userId = cookies[i].getValue();
				%>
				<%=userId%>님 환영합니다. 	<%=userId%>님의 암호는 
				<% 
				}
				if(cookies[i].getName().equals("pw")){
					 userPw = cookies[i].getValue();
				%>
				 <%=userPw %>
				<%	
				}
			}
		}
	%>
</body>
</html>