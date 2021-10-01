<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!	// 선언문 (필드)
		String s = "문";
		public String getName() {
			return "달";
		}
	%>
	
	<%	// 스크립트릿	기본 자바 코드 삽입 + 지역변수 선언문
		// (선언내용은 지역변수 선언 초기화 해줘야함)
		String s1 = "강아지";
		String s2;
	%>
	
	<%=	// 표현식
		getName()
	%>
	<h1>Script Example</h1>
	<%! String declaration = "Declaration"; %>
	<%! 
		public String decMethod(){
		return declaration;
	}
	%>
	<%
		String scriptlet = "Scriptlet";
		String comment = "Comment";
		out.println("내장객체 출력 : " + declaration + "<p>");
	%>
	
	선언문의 출력1: <%=declaration %><p>
	선언문의 출력2: <%=decMethod() %><p>
	스크립트릿 출력 : <%=scriptlet %><p>
	
</body>
</html>