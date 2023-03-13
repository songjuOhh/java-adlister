<%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/10/23
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
  <%@ include file="partials/head.jsp" %>

</head>
<body>
<%@ include file="partials/navbar.jsp" %>
< class="container-fluid">
  <div class="row">
    <h1>Pizza Order Form</h1>
    <form method="POST">

      <label for="crust">Crust Type:</label>
      <select name="crust" id="crust">
        <option value="thin">Thin</option>
        <option value="regular">Regular</option>
        <option value="thick">Thick</option>
      </select>

      <label for="sauce">Crust Type:</label>
      <select name="sauce" id="sauce">
        <option value="marinara">Marinara</option>
        <option value="whiteGarlic">White Garlic</option>
        <option value="pesto">Pesto</option>
      </select>

      <label for="size">Crust Type:</label>
      <select name="size" id="size">
        <option value="small">small</option>
        <option value="medium">medium</option>
        <option value="large">large</option>
      </select>

      <fieldset>
        <div>
          <label for="pepperoni">Pepperoni
            <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni" checked></label>
        </div>
        <div>
          <label for="sausage">Sausage
            <input type="checkbox" id="sausage" name="toppings" value="sausage" checked></label>
        </div>
        <div>
          <label for="pepper">Pepper
            <input type="checkbox" id="pepper" name="toppings" value="pepper" checked></label>
        </div>
        <div>
          <label for="onion">Onion
            <input type="checkbox" id="onion" name="toppings" value="onion" checked>
          </label>
        </div>
      </fieldset>


      <label for="address">Delivery Address:
        <input type="text" id="address" name="address" placeholder="Enter your address">
      </label>

        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
