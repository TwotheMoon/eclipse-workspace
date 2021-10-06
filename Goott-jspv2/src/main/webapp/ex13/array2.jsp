<%@page import="java.util.ArrayList"%>
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
	ArrayList<String> familyList = new ArrayList<String>();
	String nameArr[] = {"simba", "rorod", "tina", "poli"};
	for(int i = 0; i < nameArr.length; i++){
		familyList.add(nameArr[i]);
	}
	pageContext.setAttribute("Family", familyList);
%>

1. ${Family[0] } <br>
2. ${Family[1] } <br>
3. ${Family[2] } <br>
4. ${Family[3] } <br>
</body>
</html>