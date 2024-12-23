<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding Product</title>
<style>
    /* CSS styles */
    body {
        background-color: #f3f3f3;
        font-family: Arial, sans-serif;
    }

    a {
        color: #333;
        text-decoration: none;
        margin-bottom: 10px;
    }

    a:hover {
        color: #000;
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
    input[type="submit"] {
        padding: 10px;
        font-size: 16px;
        border: 1px solid #ccc;
        border-radius: 5px;
        width: 300px;
        margin-bottom: 10px;
    }

    input[type="submit"] {
        background-color: #4caf50;
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
<a href="/EcommmerceApp_Spring_jdbc/seller">GO BACK</a>
<form:form action="addproduct" method="post" modelAttribute="product">
    <label>PRODUCT ID:</label>
    <br>
    <form:input type="text" path="prid"/>
    <br><br>
    <label>PRODUCT NAME:</label>
    <br>
    <form:input type="text" path="prname"/>
    <br><br>
    <label>PRODUCT TYPE:</label>
    <br>
    <form:input type="text" path="prtype"/>
    <br><br>
    <label>PRODUCT PRICE:</label>
    <br>
    <form:input type="text" path="prprice"/>
    <br><br>
    <input type="submit" value="ADD">
</form:form>
</body>
</html>
