<%@ page import="com.bitebuddy.bitebuddy.model.beans.introBeans.IntroSlide" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12/10/2024
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="bootstrap/bootstrap-icons/font/bootstrap-icons.css" >
    <style type="text/css">

      @media(max-width: 767px) {
        .custom-navbar-brand {
          max-width: 125px;
        }
      }

      @media (min-width: 768px) {
        .custom-navbar-brand {
          max-width: 150px;
        }
      }

      .btn-custom{
        background-color: #ff7727;
        color: #fff;
      }

      .carousel-item {
        transition: transform 1s ease, opacity 1s ease;
      }

      .carousel-caption {
        background: rgba(0, 0, 0, 0.6);
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        max-width: 90%;
        left: 5%;
      }

      .carousel-item img {
        object-fit: cover;
        height: 60vh;
        border-radius: 10px;
      }

      .carousel-caption h5 {
        font-size: 2.5rem;
        font-weight: bold;
        text-transform: uppercase;
        letter-spacing: 1px;
        color: #f8c15c;
      }

      .carousel-caption p {
        font-size: 1.1rem;
        color: #f1f1f1;
      }

      .features-list {
        font-size: 1rem;
        color: #f1f1f1;
        line-height: 1.8;
      }

      .keywords {
        font-size: 1rem;
        font-weight: bold;
        color: #f8c15c;
      }

      /* Responsive Design */
      @media (max-width: 768px) {
        .carousel-caption h5 {
          font-size: 1.8rem;
        }
        .carousel-caption p {
          font-size: 1rem;
        }
        .features-list, .keywords {
          font-size: 0.9rem;
        }
      }

    </style>
    <title>introPage</title>
  </head>
  <body>

    <nav class="navbar navbar-expand-lg">
        <div class="container">
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <a class="navbar-brand custom-navbar-brand" href="#" >
            <img src="${pageContext.request.contextPath}/images/logo.png" class="img-fluid" alt="Logo">
          </a>
          <div class="collapse navbar-collapse " id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 mx-auto">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#howItWorks">How It Works</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#aboutUs">About Us</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#customerReviews">Customer Reviews</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#contactUs">Contact Us</a>
              </li>
            </ul>
          </div>
          <div>
            <a href="/login" class="btn btn-custom">Login</a>
            <a href="/signup" class="btn btn-custom">Sign Up</a>
          </div>
        </div>
    </nav>

    <main class="container py-3">
      <div id="carouselExampleCaptions" class="carousel slide carousel-fade" data-bs-ride="carousel">
        <!-- Carousel Indicators -->
        <div class="carousel-indicators">
          <%
            List<IntroSlide> introSlides = (List<IntroSlide>) request.getAttribute("introSlides");
            int slideCount = introSlides.size();
            for (int i = 0; i < slideCount; i++) {
          %>
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="<%= i %>" class="<%= (i == 0) ? "active" : "" %>" aria-current="true" aria-label="Slide <%= i + 1 %>"></button>
          <% } %>
        </div>

        <!-- Carousel Inner (Slides) -->
        <div class="carousel-inner">
          <%
            int index = 0;
            for (IntroSlide slide : introSlides) {
              String activeClass = (index == 0) ? "active" : "";
          %>
          <div class="carousel-item <%= activeClass %>">
            <!-- Image -->
            <img src="${pageContext.request.contextPath}/images/IntroSlides/favorite-food-delivered.jpeg" class="d-block w-100" alt="<%= slide.getCaption() %>">

            <!-- Caption Overlay -->
            <div class="carousel-caption d-none d-md-block">
              <h5><%= slide.getCaption() %></h5>
              <p><%= slide.getDescription() %></p>

              <!-- Features List -->
              <ul class="features-list">
                <li><strong>Features:</strong> <%= slide.getFeatures() %></li>
              </ul>

              <!-- Keywords Section -->
              <p class="keywords"><strong>Keywords:</strong> <%= slide.getKeywords() %></p>
            </div>
          </div>
          <%
              index++;
            }
          %>
        </div>

        <!-- Carousel Controls (Navigation) -->
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>

    </main>

    <footer class="bg-dark text-white py-5">
      <div class="container">
        <div class="row">
          <!-- Company Info -->
          <div class="col-md-3">
            <h5>BiteBuddy</h5>
            <p>Delivering your favorite food, hot and fresh, at your doorstep.</p>
          </div>

          <!-- Useful Links -->
          <div class="col-md-3">
            <h5>Quick Links</h5>
            <ul class="list-unstyled">
              <li><a href="#" class="text-white">About Us</a></li>
              <li><a href="#" class="text-white">Contact</a></li>
              <li><a href="#" class="text-white">FAQs</a></li>
              <li><a href="#" class="text-white">Privacy Policy</a></li>
            </ul>
          </div>

          <!-- Social Media Links -->
          <div class="col-md-3">
            <h5>Follow Us</h5>
            <ul class="list-unstyled d-flex">
              <li><a href="#" class="text-white fs-3 me-3"><i class="bi bi-facebook"></i></a></li>
              <li><a href="#" class="text-white fs-3 me-3"><i class="bi bi-twitter"></i></a></li>
              <li><a href="#" class="text-white fs-3 me-3"><i class="bi bi-instagram"></i></a></li>
              <li><a href="#" class="text-white fs-3"><i class="bi bi-linkedin"></i></a></li>
            </ul>
          </div>

          <!-- Contact Info -->
          <div class="col-md-3">
            <h5>Contact Us</h5>
            <ul class="list-unstyled">
              <li><i class="bi bi-geo-alt"></i> 123 Food Street, City, Country</li>
              <li><i class="bi bi-phone"></i> +1 234 567 890</li>
              <li><i class="bi bi-envelope"></i> support@bitebuddy.com</li>
            </ul>
          </div>
        </div>
        <hr class="bg-white">
        <div class="text-center">
          <p>&copy; 2024 BiteBuddy. All rights reserved.</p>
        </div>
      </div>
    </footer>

    <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    <script src="bootstrap/js/bootstrap.bundle.min.js"> </script>
  </body>
</html>
