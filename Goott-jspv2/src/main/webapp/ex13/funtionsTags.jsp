<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="JSPStudy :: the whole new world!"></c:set>
str: ${str} <br>
length : ${fn:length(str)}<br>
substring : ${fn:substring(str, 0 ,8)}<br>
substringAfter : ${fn:substringAfter(str, "JSPStudy")}<br>
substringBefore : ${fn:substringBefore(str, "the")}<br>
toUpperCase : ${fn:toUpperCase(str)}<br>
toLowerCase : ${fn:toLowerCase(str)}<br>
replace : ${fn:replace(str, "JSP", "Android")}<br>
indexOf : ${fn:indexOf(str, "the")}<br>
startsWith : ${fn:startsWith(str, "JSPStudy")}<br>
endsWith : ${fn:endsWith(str, "JSPStudy")}<br>
contains : ${fn:contains(str, "jspstudy")}<br>
containsIgnoreCase : ${fn:containsIgnoreCase(str, "jspstudy")}<br>
<c:set var="arr" value="${fn:split(str, ' ')}"></c:set>
join : ${fn:join(arr, "&&")}

</body>
</html>