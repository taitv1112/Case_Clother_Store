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
    <title>Product - </title>

    <link rel="stylesheet" href="/view/css/home.css">
    <link rel="stylesheet" href="/view/css/product.css">

</head>
<body>

<nav class="navbar"></nav>

<section class="product-details">
    <div class="image-slider">
        <div class="product-images">
            <img src="/view/img/product image 1.png" class="active" alt="">
            <img src="/view/img/product image 2.png" alt="">
            <img src="/view/img/product image 3.png" alt="">
            <img src="/view/img/product image 4.png" alt="">
        </div>
    </div>
    <div class="details">
        <h2 class="product-brand">calvin klein</h2>
        <p class="product-short-des">Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>
        <span class="product-price">$99</span>
        <span class="product-actual-price">$200</span>
        <span class="product-discount">( 50% off )</span>

        <p class="product-sub-heading">select size</p>

        <input type="radio" name="size" value="s" checked hidden id="s-size">
        <label for="s-size" class="size-radio-btn check">s</label>
        <input type="radio" name="size" value="m" hidden id="m-size">
        <label for="m-size" class="size-radio-btn">m</label>
        <input type="radio" name="size" value="l" hidden id="l-size">
        <label for="l-size" class="size-radio-btn">l</label>
        <input type="radio" name="size" value="xl" hidden id="xl-size">
        <label for="xl-size" class="size-radio-btn">xl</label>
        <input type="radio" name="size" value="xxl" hidden id="xxl-size">
        <label for="xxl-size" class="size-radio-btn">xxl</label>

        <button class="btn cart-btn">add to cart</button>
        <button class="btn">add to wishlist</button>
    </div>
</section>

<section class="detail-des">
    <h2 class="heading">description</h2>
    <p class="des">Lorem ipsum dolor sit amet consectetur adipisicing elit. Veniam, magnam. Reprehenderit necessitatibus veritatis iure perferendis quae distinctio optio obcaecati cum aliquid voluptatum in nesciunt, quidem assumenda totam ipsa, maiores hic exercitationem tempore! Sequi, consequatur amet aspernatur ipsum pariatur exercitationem possimus, quaerat corporis eius nesciunt impedit rerum itaque ab nobis. Molestiae quis accusamus, nisi aspernatur eligendi odio asperiores incidunt debitis laborum magnam. Non laudantium provident quae aspernatur sunt quis, accusantium rerum, iure nesciunt quam distinctio dicta eius at a. Dolorem, obcaecati molestias. Laboriosam consectetur voluptatibus tempore adipisci vitae nam soluta. Hic deleniti, similique dignissimos sint quas animi veniam, odit rem aut suscipit tenetur nihil autem fugiat nam provident temporibus sunt error iure sed voluptatum quisquam libero placeat maiores natus. Dolorem nostrum necessitatibus illo explicabo ducimus labore aperiam quos ratione saepe assumenda quod, minus maxime quis quam aut recusandae est in laboriosam iusto placeat! Natus nulla molestias, eos corporis corrupti at error magni hic amet dolore explicabo veritatis dolor atque vitae ipsum exercitationem neque voluptas perspiciatis aut ea? Illo, dolorem dolor a cum non numquam? Laboriosam vero at voluptate esse similique id, neque incidunt quis saepe qui quisquam aliquid optio earum animi cum tempora corrupti molestias aspernatur placeat atque magnam, possimus nostrum minima nulla. Minima quasi blanditiis doloribus unde nam! Libero consequuntur doloremque magnam ad. Aliquid, doloremque. Placeat eum animi quos temporibus! Eum excepturi magnam vel, inventore doloribus, natus voluptatem suscipit et voluptates odit facere alias eius sint provident quam consequatur beatae, autem impedit tempora? Et architecto similique a tempore labore sed eos provident temporibus quibusdam qui, modi, aspernatur dicta ipsa eligendi blanditiis dolores culpa nihil adipisci eaque, saepe consequatur. Quod eveniet reprehenderit labore, provident, excepturi laboriosam officia vel pariatur perferendis consequuntur animi blanditiis, dolorem molestias laborum sapiente aliquid maiores. Quae perspiciatis voluptate ipsam nemo modi a illum doloribus rerum quas beatae.</p>
</section>

<!-- card-container -->
<section class="product">
    <h2 class="product-category">Shirts</h2>
    <button class="pre-btn"><img src="/view/img/arrow.png" alt=""></button>
    <button class="nxt-btn"><img src="/view/img/arrow.png" alt=""></button>
    <div class="product-container">
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card5.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card6.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card7.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card8.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card9.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card10.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card11.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card12.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
    </div>
</section>

<!-- card-container -->
<section class="product">
    <h2 class="product-category">Shoes</h2>
    <button class="pre-btn"><img src="/view/img/arrow.png" alt=""></button>
    <button class="nxt-btn"><img src="/view/img/arrow.png" alt=""></button>
    <div class="product-container">
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card9.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card10.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card11.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card12.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card1.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card2.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card3.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
        <div class="product-card">
            <div class="product-image">
                <span class="discount-tag">50% off</span>
                <img src="/view/img/card4.png" class="product-thumb" alt="">
                <button class="card-btn">add to whislist</button>
            </div>
            <div class="product-info">
                <h2 class="product-brand">brand</h2>
                <p class="product-short-des">A short line about the dress..</p>
                <span class="price">$20</span> <span class="actual-price">$40</span>
            </div>
        </div>
    </div>
</section>

<footer></footer>

<script src="/view/js/nav.js"></script>
<script src="/view/js/footer.js"></script>
<script src="/view/js/home.js"></script>
<script src="/view/js/product.js"></script>

</body>
</html>