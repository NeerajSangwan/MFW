<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BUYER PAGE</title>
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

    div.actions {
        text-align: center;
        margin-bottom: 20px;
    }

    div.actions a {
        display: inline-block;
        margin: 0 10px;
        font-size: 18px;
        color: #fff;
        background-color: #4CAF50;
        padding: 10px;
        border-radius: 5px;
        text-decoration: none;
    }

    div.actions a:hover {
        background-color: #45a049;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        margin-bottom: 20px;
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

    input[type="submit"] {
        padding: 10px 20px;
        font-size: 16px;
        background-color: #4CAF50;
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        display: block;
        margin: 0 auto;
    }
    
       #kart {
        padding: 10px 20px;
        font-size: 16px;
        background-color: #4CAF50;
        color: #fff;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        display: block;
        margin: 0 auto;
    }
</style>
</head>
<body>
<h1>BUYER PAGE</h1>
<div class="actions">
    <a href="/EcommmerceApp_Spring_jdbc/sorta">SORT IN INCREASING ORDER</a>
    <a href="/EcommmerceApp_Spring_jdbc/sortd">SORT IN DECREASING ORDER</a>
</div>
<form:form action="buy" method="post" modelAttribute="product">
    <table>
        <thead>
            <tr>
                <th>PRODUCT ID</th>
                <th>PRODUCT NAME</th>
                <th>PRODUCT TYPE</th>
                <th>PRODUCT PRICE</th>
                <th>Kart</th>
            </tr>
        </thead>
        <c:forEach var="product" items="${product}">
            <tr>
                <td>${product.prid}</td>
                <td>${product.prname}</td>
                <td>${product.prtype}</td>
                <td>${product.prprice}</td>
                <td id="kart">ADD to CART</td>
            </tr>
            
            
        </c:forEach>
    </table>
    <input type="submit" value="CHECKOUT">
</form:form>
</body>
</html>
