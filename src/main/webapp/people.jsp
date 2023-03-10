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

<%
    Person p1 = new Person("Songju Oh", 28);
    Person p2 = new Person("Cavin Ngoc", 29);
    Person p3 = new Person("Minsun Jung", 20);

    List<Object> people = new ArrayList<>(Arrays.asList(
            p1,p2,p3
    ));
    request.setAttribute("people", people);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>People</h1>
    <c:forEach var="person" items="${people}">
        <h3>
            ${person.getName()}
            <c:if test="${person.age <21}">(young)</c:if>
        </h3>
    </c:forEach>

</body>
</html>
