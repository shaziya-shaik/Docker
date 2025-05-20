<%@ page import ="java.util.Scanner"  %>
 <!-- declarative  @import -> import somethinig use import as attribute
 					@include-> when One page added to another page use file aas atribute
 					@taglib-> when you want to use external taag use uri as attribute-->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<%! int n=3; 
%>
 <!-- directive -->
<%
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int k=i+j;
		//out.println("result"+k);
		 %>
		  <!-- Scriplet -->
		  <%= k %><!-- Expression -->
</body>
</html>