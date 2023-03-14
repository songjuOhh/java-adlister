<%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/14/23
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<form method="POST" action="products" >
  <label for="name">Name</label>
    <input type="text" id="name" name="name" placeholder="name"><br>
  <label for="price">Price</label>
    <input type="text" id="price" name="price" placeholder="price">
  <button>Submit</button>
</form>

<h2>Here are all the product2s:</h2>
<c:forEach var="product" items="${products}">
  <div class="product2">
    <h3> ${product.name}</h3>
    <h4> Price: $${product.price}</h4>
  </div>
</c:forEach>

</body>
</html>
