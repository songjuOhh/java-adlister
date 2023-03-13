<%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/9/23
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food Order</title>
  <%@ include file="partials/head.jsp" %>

</head>

<%--<head>--%>
<%--  <jsp:include page="partials/head.jsp">--%>
<%--    <jsp:param name="title" value="Pizza"/>--%>
<%--  </jsp:include>--%>
<%--</head>--%>

<body>
<%@ include file="partials/navbar.jsp" %>

<div class="container-fluid">
  <div class="row">
    <h1>Food Order Form</h1>
    <form action="/foods.jsp">
      <select name="food" id="food">
        <option value="dairy">Dairy</option>
        <option value="meat">Meat</option>
        <option value="rhubarb">rhubarb</option>
      </select>
      <button>Submit</button>

    </form>
  </div>
</div>


</body>
</html>
