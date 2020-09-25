<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 25, 2020, 12:56:29 PM
    Author     : 818396
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first_num" value="${age}">
            <br>
            <label>Second: </label>
            <input type="text" name="second_num" value="${age}">
            <br>
            <input type = "submit" name = "operator" value="+">
            <input type = "submit" name = "operator"  value="-">
            <input type = "submit" name = "operator" value="*">
            <input type = "submit" name = "operator" value="%">
            <p>result: ${message}</p>
            <a href ="age">Age Calculator</a>
        </form>
    </body>
</html>
