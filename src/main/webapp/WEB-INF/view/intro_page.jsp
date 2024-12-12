<%@ page import="java.util.List" %>
<%@ page import="com.bitebuddy.bitebuddy.model.beans.introBeans.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  List<IntroSlide> introSlides = (List<IntroSlide>) request.getAttribute("introSlides");
  List<HowItWork> howItWorks = (List<HowItWork>) request.getAttribute("howItWorks");
  List<OurMission> ourMissions = (List<OurMission>) request.getAttribute("ourMissions");
  List<OurStoryPart> ourStoryParts = (List<OurStoryPart>) request.getAttribute("ourStoryParts");
  List<OurValue> ourValues = (List<OurValue>) request.getAttribute("ourValues");
  List<OurTeamMember> ourTeamMembers = (List<OurTeamMember>) request.getAttribute("ourTeamMembers");
  List<WhyChooseUsItem> whyChooseUsItems = (List<WhyChooseUsItem>) request.getAttribute("whyChooseUsItems");
  List<CustomerReview> customerReviews = (List<CustomerReview>) request.getAttribute("customerReviews");
%>

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
        .custom-card-img-height{
          max-height: 150px;
        }
      }

      @media (min-width: 768px) {
        .custom-navbar-brand {
          max-width: 150px;
        }
        .custom-card-img-height{
          max-height: 250px;
        }
      }

      .btn-custom{
        background-color: #ff7727;
        color: #fff;
      }

      .text-orange {
        color: #ff7727;
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

    <main class="container">
      <!-- intro slide show -->

      <!-- how it works -->
      <div class="container p-0 my-2">
        <h3 class="text-orange">How It Works ?</h3>
        <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4">
          <%
            for (HowItWork howItWork : howItWorks) {
          %>
          <div class="col">
            <div class="card">
              <img src="${pageContext.request.contextPath}/images/HowItWorks/contact-support.jpeg" class="card-img-top custom-card-img-height img-ful" alt="...">
              <div class="card-body">
                <h5 class="card-title"><%= howItWork.getCaption() %></h5>
                <p class="card-text"><%= howItWork.getDescription() %></p>
              </div>
            </div>
          </div>
          <%
            }
          %>

        </div>
      </div>
      <!-- about us -->

      <!-- Contact us -->

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
