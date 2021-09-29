<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <% request.setCharacterEncoding("utf-8");%>
    
    <% String name = request.getParameter("name");%>
    <% String studentNum = request.getParameter("studentNum");%>
    <% String gender = request.getParameter("gender");%>
    <% String major = request.getParameter("major");%>
    
    <% 
    	if(gender.equals("man")){
    		gender = "남자";
    	} else {
    		gender = "여자";
    	};    	
    %>
    
    성명 : <%= name%> <br>
    학번 : <%= studentNum%> <br>
    성별 : <%= gender%> <br>
    학과 : <%= major%> <br>