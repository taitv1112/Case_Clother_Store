<%--
  Created by IntelliJ IDEA.
  User: MRBUMMMM
  Date: 1/5/2022
  Time: 3:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clothing : Create Account</title>

    <link rel="stylesheet" href="/view/css/signup.css">

</head>
<body>

<img src="/view/img/loader.gif" class="loader" alt="">

<div class="alert-box show">
    <img src="/view/img/error.png" class="alert-img" alt="">
    <p class="alert-msg">Error message</p>
</div>

<div class="container">
    <img src="/view/img/dark-logo.png" class="logo" alt="">
    <div>
        <input type="text" autocomplete="off" id="name" placeholder="name">
        <input type="email" autocomplete="off" id="email" placeholder="email">
        <input type="password" autocomplete="off" id="password" placeholder="password">
        <input type="text" autocomplete="off" id="number" placeholder="number">
        <input type="checkbox" checked class="checkbox" id="terms-and-cond">
        <label for="terms-and-cond">agree to our <a href="">terms and conditions</a></label>
        <br>
        <input type="checkbox" class="checkbox" id="notification">
        <label for="notification">recieve upcoming offers and events mails</a></label>
        <button class="submit-btn">create account</button>
    </div>
    <a href="/login" class="link">already have an account? Log in here</a>
</div>

<script src="/view/js/token.js"></script>
<script src="/view/js/form.js"></script>

</body>
</html>