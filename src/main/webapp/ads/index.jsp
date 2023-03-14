<%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/14/23
  Time: 12:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${ads}">
  <div class="ad">
    <h2>${ad.title}</h2>
    <p>Description: ${ad.description}</p>
  </div>
</c:forEach>

</body>
</html>
