<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/9/23
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName = request.getParameter("username");
    String userPassword = request.getParameter("password");


    request.setAttribute("username", userName);
    request.setAttribute("password", userPassword);
    Map<String, String> user = new HashMap<>();
    user.put(userName,userPassword);

%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Username: ${username}</h2>
<h2>Password: ${password}</h2>

</body>
</html>
