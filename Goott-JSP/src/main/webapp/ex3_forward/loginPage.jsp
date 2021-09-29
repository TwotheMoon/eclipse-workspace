<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="loginAction.jsp">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" id="id" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호 </td>
				<td><input type="password" id="pwd" name="pwd"></td>
			</tr>
			<tr>
			<td colspan="2">
				<input type="radio" id="user" name="userType" value="user">사용자
				<input type="radio" id="adimin" name="userType" value="admin">관리자</td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"></td>
				<td><input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>