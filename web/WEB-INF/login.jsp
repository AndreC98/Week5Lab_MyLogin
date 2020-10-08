<%-- 
    Document   : login
    Created on : 8-Oct-2020, 3:07:30 PM
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username:<input type="text" name="username" value=${username}><br>
            Password:<input type="text" name="password" value=${password}><br>
            <input type="submit" value="log In" name="logIn">
        </form>
            <p>${errorMessage}</p>
    </body>
</html>
