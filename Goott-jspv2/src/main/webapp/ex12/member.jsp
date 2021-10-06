<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="memberProc.jsp">
		아이디 <input type="text" name="id"> <br>
		패스워드 <input type="text" name="pw"> <br>
		패스워드 확인 <input type="text" name="confirmPw"> <br>
		이름 <input type="text" name="name"> <br>
		생일 <input type="text" name="birth"> <br>
		이메일 <input type="text" name="email"> <br>
		<input type="submit" value=가입> <br>
	</form>
</body>
</html>