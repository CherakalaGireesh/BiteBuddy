<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/19/2024
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
  <head>
    <title>Intro_page</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/bootstrap-icons-1.11.3/font/bootstrap-icons.min.css">
    <link href="path/to/bootstrap-icons.css" rel="stylesheet">
    <style>
      .btn-outline-orange {
        color: #ff7727 !important;
        border-color: #ff7727 !important;
      }

      .btn-outline-orange:hover {
        color: #fff !important;
        background-color: #ff7727 !important;
        border-color: #ff7727 !important;
      }
      .text-orange{
        color: #ff7727 !important;
      }
    </style>
  </head>
  <body>
  <div class="container">
    <!-- nav bar -->
    <nav class="navbar navbar-expand-lg w-100">
        <button class="navbar-toggler px-2" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
          <i class="bi bi-list text-orange"></i>
        </button>
        <a class="navbar-brand" href="#" style="max-width: 150px;">
          <img src="../../../../../webapp/logo.png" alt="Logo" class="img-fluid" />
        </a>
        <div class="collapse navbar-collapse " id="navbarContent">
          <ul class="navbar-nav mx-auto mb-2 mb-lg-0">
            <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Menu</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Features</a></li>
            <li class="nav-item"><a class="nav-link" href="#">About</a></li>
            <li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
          </ul>
        </div>
        <div class="d-flex gap-2">
          <a href="/login" class="btn btn-outline-orange px-sm-2 px-lg-4 fs- rounded-pill" role="button">Login</a>
          <a href="/signup" class="btn btn-outline-orange px-sm-2 px-lg-4 rounded-pill" role="button">SignUp</a>
        </div>
    </nav>
    <!-- slideshow -->
    <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
      </div>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img src="../../../../../webapp/temp.jpeg" class="d-block w-100" alt="...">
          <div class="carousel-caption d-none d-md-block">
            <h5>First slide label</h5>
            <p>Some representative placeholder content for the first slide.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="../../../../../webapp/temp.jpeg" class="d-block w-100" alt="...">
          <div class="carousel-caption d-none d-md-block">
            <h5>Second slide label</h5>
            <p>Some representative placeholder content for the second slide.</p>
          </div>
        </div>
        <div class="carousel-item">
          <img src="../../../../../webapp/temp.jpeg" class="d-block w-100" alt="...">
          <div class="carousel-caption d-none d-md-block">
            <h5>Third slide label</h5>
            <p>Some representative placeholder content for the third slide.</p>
          </div>
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>

  </div>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
