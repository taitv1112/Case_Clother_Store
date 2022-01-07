<%--
  Created by IntelliJ IDEA.
  User: MRBUMMMM
  Date: 1/5/2022
  Time: 3:53 PM
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
    <title>Clothing : Log In</title>

    <link rel="stylesheet" href="/view/css/signup.css">


</head>
<body>

<img src="/view/img/loader.gif" class="loader" alt="">

<div class="alert-box">
    <img src="/view/img/error.png" class="alert-img" alt="">
    <p class="alert-msg">Error message</p>
</div>

<div class="container">
    <img src="/view/img/dark-logo.png" class="logo" alt="">
    <div>
        <input type="email" autocomplete="off" id="email" placeholder="email">
        <input type="password" autocomplete="off" id="password" placeholder="password">
        <button class="submit-btn">log in</button>
    </div>
    <a href="/signup" class="link">don't have an account? Create one</a>
</div>

<script src="/view/js/token.js"></script>
<script src="/view/js/form.js"></script>

</body>
</html>