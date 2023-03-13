<%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/13/23
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<html>
<head>
    <title>Fighters</title>
</head>

<body>
<c:forEach var="fighter" items="${fighters}">
    <h3 style="color: cornflowerblue">${fighter.name}</h3>
    <h3>Hit Damage: ${fighter.hitPoints}</h3>
    <h3>Max Damage: ${fighter.maxDamage}</h3>
</c:forEach>

</body>
</html>
