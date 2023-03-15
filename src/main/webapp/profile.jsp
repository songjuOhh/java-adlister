<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <div class="container">
        <form action="/logout" method="POST">
            <c:if test="${sessionScope.user != null}">
                <h1 class="mb-5"> Hello, ${sessionScope.user}!</h1>
                <h3>Viewing your profile...</h3>

            </c:if>

            <input type="submit" class="btn btn-primary btn-block mt-3" value="Log Out">
        </form>
    </div>

</body>
</html>
