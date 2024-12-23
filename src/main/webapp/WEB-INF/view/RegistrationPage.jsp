<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration page</title>
    <style>
        /* CSS styles */
        body {
            background-color: #f3f3f3;
            font-family: Arial, sans-serif;
        }
        
        form {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            flex-direction: column;
        }
        
        form {
            text-align: center;
            background-color: #fff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        
        h1 {
            color: #333;
        }
        
        label {
            font-size: 20px;
        }
        
        input[type="text"],
        input[type="password"],
        select {
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            outline: none;
        }
        
        input[type="submit"] {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #4CAF50;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        
        /* Increase placeholder font size */
        input::placeholder {
            font-size: 16px;
        }
    </style>
</head>
<body>
    <h1>REGISTRATION PAGE</h1>
    <br>
    <br>
    <form:form action="gotologinpage" method="post" modelAttribute="user">
        <form:input type="text" path="firstname" placeholder="Firstname"  />
        <br>
        <br>
        <form:input type="text" path="lastname" placeholder="Lastname"  />
        <br>
        <br>
        <form:input type="text" path="username" placeholder="Username"  />
        <br>
        <br>
        <form:input type="password" path="password" placeholder="Password" />
        <br>
        <br>
        <form:input type="text" path="emailid" placeholder="Email"  />
        <br>
        <br>
        <label>ENTER USER TYPE:</label>
        <form:select path="usertype">
            <option value="buyer">BUYER</option>
            <option value="seller">SELLER</option>
        </form:select>
        <br>
        <br>
        <input type="submit" value="REGISTER">
    </form:form>
</body>
</html>
