<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if (session.getAttribute("uname") == null) {
    response.sendRedirect("login.jsp");
    return;
}
%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/4XTsAAHW_Tc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<form action="Logout" method="post">
    <input type="submit" value="Logout" />
</form>
</body>
</html>
