<%@ page import="model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/10/23
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  Product laptop = new Product("Mac Pro 2023",200000);
  Product sofa = new Product("Sofa", 50000);
  Product desk = new Product("Desk", 30000);

  List<Object> products = new ArrayList<>(Arrays.asList(
          laptop,sofa,desk
  ));
  request.setAttribute("products", products);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
  <h2>Products</h2>

  <c:forEach var="product" items="${products}" >
    <div style="margin-top: 2em">
      <h3 style="color: white; background: cornflowerblue">Name: ${product.getProduct()}</h3>
      <h3>Price: $${product.getCostInCent()/100}</h3>
    </div>
  </c:forEach>
</div>



</body>
</html>
