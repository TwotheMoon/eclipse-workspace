<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	String s = "moon";
	
	int one;
	int two = 2;
	public int plusMethod(){return one + two;}
	public void noReturnMethod(){}

	int a = 1;
%>

<%= plusMethod()%>

<%if(a > 0) {%>
	참입니다.
<%}else{%>
	거짓입니다.
<%} %>

<%while(a == 1){%>
	참입니다.
<% break;
	}
%>

<%switch(a){
	case 1 : %> 참입니다.
	<% break;
	
	case 2 : %> 거짓입니다.
<% 
	}
%>

<%
	for(int i = 0; i < 10; i++) { 
 %>
 	<p> 값 : <%= i %> </p>
<% 	
	} 
%>

</body>
</html>