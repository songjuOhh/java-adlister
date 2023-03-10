<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/10/23
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Names</h1>
  <h3>${names}</h3>
  <c:forEach var="name" items="${names}">
    <h3 style="color: cornflowerblue">${name}</h3>
  </c:forEach>

</body>
</html>
