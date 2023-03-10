<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: songjuoh
  Date: 3/9/23
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Map<String, String> users = new HashMap<>();
    List<String> username = new ArrayList<>(Arrays.asList(
            "osj4129",
            "hello",
            "boss123"
    ));
    List<String> password = new ArrayList<>(Arrays.asList(
            "hello1234",
            "12345",
            "sss333"
    ));


    for(int i =0; i<username.size(); i++){
        users.put(username.get(i), password.get(i));
    }





//    String method = request.getMethod();
//    if(method.equals("POST")){
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        if(username.equals("admin") && password.equals("123")){
//            response.sendRedirect("/profile.jsp?username="+userName+"&password="+userPassword);
//        }
//    }



//    String username = "osj4129";
//    String password = "1234";


    String userName = request.getParameter("username");
    String userPassword = request.getParameter("password");

    if(userName !=null && userPassword != null){
        if( (username.contains(userName) && password.contains(userPassword))
                 ) {
            response.sendRedirect("/profile.jsp?username=" + userName + "&password=" + userPassword);
        }else if(( userName.equals("admin") && userPassword.equals("123"))){
            response.sendRedirect("/profile.jsp?username=" + userName + "&password=" + userPassword);
        }else{
            PrintWriter print = response.getWriter();
            print.println("<h2 style=\"color:red;\">Invalid username or password</h2>");
        }
    }


%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/login.jsp" >
  <label for="username">Username</label><input type="text" id="username" name="username" placeholder="username"><br>
  <label for="password">Password</label><input type="password" id="password" name="password" placeholder="password">
  <button>Submit</button>
</form>

</body>
</html>
