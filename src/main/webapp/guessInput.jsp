<%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/13/23
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Input</title>
</head>
<body>
<form method="POST" action="/guess">
    <h1>Guess a number between 1 and 3:</h1>
    <form action="check" method="post">
        <input type="number" name="guess" id="guess" min="1" max="3">
        <button> Guess Number</button>
    </form>
</form>
<script>

</script>

</body>
</html>
