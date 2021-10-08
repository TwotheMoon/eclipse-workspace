<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    response.setHeader("Cache-Control","no-store");
    response.setHeader("Pragma","no-cache");
    response.setDateHeader("Expires",0);
    if(request.getProtocol().equals("HTTP/1.1")){
    	response.setHeader("Cache-Control","no-store");
    }
    %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="member.css">
<title>Insert title here</title>
</head>
<body id="member-body">

	<div class="member-box">
	
		<header class="member-header">
			<div class="clock"></div>
		</header>
	
		<aside class="member-aside">
		
		</aside>
	
		<section class="member-section">
			<form id="member-form" method="post" action="memberProc.jsp">
				아이디 : <input type="text" name="id" class="id"> <br>
				패스워드 : <input type="text" name="pw" class="pw"> <br>
				패스워드확인 : <input type="text" name="pw_confirm" class="pw_confirm"> <br>
				이름 : <input type="text" name="name" class="name"> <br>
				생년월일 : <input type="text" name="birth"> <br>
				성별 : 
					<input type="radio" name="gender" value="mail" checked > 남 <br>
					<input type="radio" name="gender" value="femail" > 여 <br>
				취미 : 
					<input type="checkbox" name="hobby" value="game"> 게임
					<input type="checkbox" name="hobby" value="study"> 공부
					<input type="checkbox" name="hobby" value="reading"> 독서 <br>
				지역 : <select name="city"> 
						<option>서울</option>
						<option>경기도</option>
						<option>대전시</option>
					</select> <br>
				<input type="submit" value="확인">
			</form>	
		</section>
		
		<footer class="member-footer">

		</footer>
		
	</div>

	<script type="text/javascript" src="member.js"></script>
</body>
</html>