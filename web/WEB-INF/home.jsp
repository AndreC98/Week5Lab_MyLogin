<%-- 
    Document   : home
    Created on : 8-Oct-2020, 3:07:40 PM
    Author     : Andre
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HomePage</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <p>Hello ${username}</p>
        <a href="login?logout" name="logout">Log out</a>
    </body>
</html>
