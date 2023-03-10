<%@ page import="lecture.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Objects" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/10/23
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <%@ include file="partials/head.jsp" %>

</head>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container-fluid">
    <h1>People</h1>
    <c:forEach var="person" items="${people}">
        <h3>
                ${person.getName()}
            <c:if test="${person.age <21}">(young)</c:if>
        </h3>
    </c:forEach>
</div>

</body>
</html>
