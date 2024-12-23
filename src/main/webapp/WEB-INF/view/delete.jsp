<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deleting Product</title>
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
        background-color: #f44336;
        color: #fff;
        border: none;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #e53935;
    }
</style>
</head>
<body>
<a href="/EcommmerceApp_Spring_jdbc/seller">GO BACK</a>
<form:form action="deleteproduct" method="post" modelAttribute="product">
    <label>ENTER THE PRODUCT ID:</label>
    <br>
    <form:input type="text" path="prid"/>
    <br>
    <input type="submit" value="DELETE">
</form:form>
</body>
</html>
