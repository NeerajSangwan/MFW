<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SELLER PAGE</title>
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

    div.logout {
        text-align: right;
    }

    div.logout form {
        display: inline-block;
    }

    div.actions a {
        display: block;
        text-align: center;
        margin-top: 20px;
        font-size: 18px;
        color: #fff;
        background-color: #4CAF50;
        padding: 10px;
        border-radius: 5px;
        text-decoration: none;
        width: 200px;
    }

    div.actions a:hover {
        background-color: #45a049;
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    table th,
    table td {
        padding: 10px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    table th {
        background-color: #4CAF50;
        color: #fff;
    }

    c\\:forEach {
        display: contents;
    }
</style>
</head>
<body>
<h1>SELLER PAGE</h1>
<div class="logout">
    <form:form action="logout" method="post">
        <input type="submit" value="LOGOUT">
    </form:form>
</div>
<div class="actions">
    <a href="/EcommmerceApp_Spring_jdbc/add">ADD A PRODUCT</a>
    <a href="/EcommmerceApp_Spring_jdbc/delete">DELETE A PRODUCT</a>
</div>
<form:form action="seller" method="post" modelAttribute="product">
    <table>
        <thead>
            <tr>
                <th>PRODUCT ID</th>
                <th>PRODUCT NAME</th>
                <th>PRODUCT TYPE</th>
                <th>PRODUCT PRICE</th>
            </tr>
        </thead>
        <c:forEach var="product" items="${product}">
            <tr>
                <td>${product.prid}</td>
                <td>${product.prname}</td>
                <td>${product.prtype}</td>
                <td>${product.prprice}</td>
            </tr>
        </c:forEach>
    </table>
</form:form>
</body>
</html>
