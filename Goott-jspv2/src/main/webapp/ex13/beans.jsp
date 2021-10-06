<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bean" class="ch18.ELBean"></jsp:useBean>
<jsp:setProperty name="bean" property="siteName"></jsp:setProperty>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

빈즈 액션 태그<br>
사이트명 : <jsp:getProperty property="siteName" name="bean"/> <br><br>

EL Beans <br>
사이트명 : ${bean.siteName}

</body>
</html>