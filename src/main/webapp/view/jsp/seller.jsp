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
    <title>Seller Dashboard</title>

    <link rel="stylesheet" href="css/home.css">
    <link rel="stylesheet" href="css/search.css">
    <link rel="stylesheet" href="css/signup.css">
    <link rel="stylesheet" href="css/seller.css">

</head>

<body>

<img src="img/loader.gif" class="loader" alt="">

<div class="alert-box">
    <img src="img/error.png" class="alert-img" alt="">
    <p class="alert-msg">Error message</p>
</div>

<img src="img/dark-logo.png" class="logo" alt="">

<!-- become seller element -->
<div class="become-seller hide">
    <p class="heading">become a seller</p>
    <p class="des">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Quas hic incidunt nam at magni animi
        reiciendis velit. Autem repellat natus obcaecati impedit adipisci consectetur tempora excepturi nemo officia
        ipsa saepe incidunt reiciendis voluptates dolore quaerat ea sit ipsam inventore debitis, ducimus, soluta
        nihil? Similique voluptate sunt itaque maxime temporibus. Officiis iure provident architecto facere </p>
    <button class="btn" id="apply-btn">apply for seller account</button>
</div>

<!-- apply form -->
<div class="apply-form hide">
    <input type="text" id="business-name" placeholder="business name / company name / shop name">
    <textarea id="business-add" placeholder="address"></textarea>
    <textarea id="about" placeholder="about"></textarea>
    <input type="text" id="number" placeholder="number">
    <input type="checkbox" checked class="checkbox" id="terms-and-cond">
    <label for="terms-and-cond">agree to our <a href="">terms and conditions</a></label>
    <br>
    <input type="checkbox" checked class="checkbox" id="legitInfo">
    <label for="legitInfo">all information is legit</a>
    </label>
    <button class="submit-btn" id="apply-form-btn">apply</button>
</div>

<!-- products list -->
<div class="product-listing hide">
    <div class="add-product">
        <p class="add-product-title">add product</p>
        <button class="btn" onclick="location.href = '/add-product'">add product</button>
    </div>
    <img src="/view/img/no-products.png" class="no-product-image hide" alt="">

    <!-- delete alert -->
    <div class="delete-alert">
        <div class="alert">
            <button class="close-btn"><img src="/view/img/close.png" alt=""></button>
            <img src="/view/img/delete-warning.png" class="delete-svg" alt="">
            <p class="text">are you sure ? you want to delete this product</p>
            <button class="delete-btn">delete</button>
        </div>
    </div>

    <!-- cards -->
    <div class="product-container">
        <!-- <div class="product-card">
            <div class="product-image">
                <span class="tag">Draft</span>
                <img src="img/card5.png" class="product-thumb" alt="">
                <button class="card-action-btn edit-btn"><img src="img/edit.png" alt=""></button>
                <button class="card-action-btn open-btn"><img src="img/open.png" alt=""></button>
                <button class="card-action-btn delete-popup-btn"><img src="img/delete.png" alt=""></button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
    </div> -->
    </div>
</div>
    <script src="/view/js/token.js"></script>
    <script src="/view/js/createProduct.js"></script>
    <script src="/view/js/seller.js"></script>

</body>

</html>