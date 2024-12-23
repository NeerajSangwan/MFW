<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WEBSITE</title>
<style>
    /* CSS styles */
    body {
        background-color: #f3f3f3;
        font-family: Arial, sans-serif;
    }

    h1 {
        color: #333;
        text-align: center;
    }

    form {
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        margin-top: 20px;
    }

    label {
        font-size: 20px;
        color: #333;
        margin-bottom: 10px;
    }

    input[type="text"],
    input[type="password"],
    input[type="submit"] {
        padding: 10px;
        font-size: 16px;
        border: 1px solid #ccc;
        border-radius: 5px;
        width: 300px;
        margin-bottom: 10px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: #fff;
        border: none;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
</style>
</head>
<body>
<h1>WELCOME TO THE YOUNG STORE</h1>
<form:form action="gotoregistrationpage">
    <label>DON'T HAVE AN ACCOUNT</label>
    <br>
    <br>
    <input type="submit" value="SIGN UP">
</form:form>
<br>
<br>
<br>
<h1>LOGIN</h1>
<form:form action="login" method="post" modelAttribute="user">
    <label>USERNAME:</label>
    <br>
    <form:input type="text" path="username" name="userp"></form:input>
    <br>
    <br>
    <label>PASSWORD:</label>
    <br>
    <form:input type="password" path="password" name="pass"></form:input>
    <br>
    <br>
    <input type="submit" value="LOGIN">
</form:form>

</body>
</html>
