<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
if (session.getAttribute("uname") == null) {
    response.sendRedirect("login.jsp");
    return;
}
%>
Hello, Welcome User ID <%= session.getAttribute("uname") %><br>
<a href="videos.jsp">Videos here</a>
<form action="Logout" method="post">
    <input type="submit" value="Logout" />
</form>
</body>
</html>
