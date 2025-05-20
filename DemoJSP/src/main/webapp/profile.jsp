<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Define the data source -->
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" 
                   url="jdbc:mysql://localhost:3306/restapi" 
                   user="root" password=""/>

<!-- Query the database -->
<sql:query var="resultSet" dataSource="${db}">
    SELECT * FROM alien 
</sql:query>

<!-- Display the results -->
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Points</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="row" items="${resultSet.rows}">
            <tr>
                <td><c:out value="${row.id}"/></td>
                <td><c:out value="${row.name}"/></td>
                <td><c:out value="${row.point}"/></td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
