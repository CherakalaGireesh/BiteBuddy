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

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
  <link rel="stylesheet" href="bootstrap/bootstrap-icons/font/bootstrap-icons.css">
  <style>
    @media (max-width: 767px) {
      .custom-navbar-brand {
        max-width: 125px;
      }
      .custom-card-img-height {
        max-height: 200px;
      }
      .custom-intro-slide-height {
        max-height: 300px;
        overflow: hidden;
      }
    }

    @media (min-width: 768px) {
      .custom-navbar-brand {
        max-width: 150px;
      }
      .custom-card-img-height {
        max-height: 250px;
      }
      .custom-intro-slide-height {
        max-height: 600px;
        overflow: hidden;
      }
    }

  </style>
  <title>Intro Page</title>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg">
  <div class="container">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand custom-navbar-brand" href="#">
      <img src="${pageContext.request.contextPath}/images/logo.png" class="img-fluid" alt="Logo">
    </a>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0 mx-auto">
        <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
        <li class="nav-item"><a class="nav-link" href="#howItWorks">How It Works</a></li>
        <li class="nav-item"><a class="nav-link" href="#aboutUs">About Us</a></li>
        <li class="nav-item"><a class="nav-link" href="#customerReviews">Customer Reviews</a></li>
        <li class="nav-item"><a class="nav-link" href="#contactUs">Contact Us</a></li>
      </ul>
    </div>
    <div>
      <a href="/login" class="btn btn-primary">Login</a>
      <a href="/signup" class="btn btn-primary">Sign Up</a>
    </div>
  </div>
</nav>

<main class="container">
  <!-- Intro Slideshow -->
  <div id="carouselExampleIndicators" class="carousel slide rounded-4 shadow-lg custom-intro-slide-height" data-bs-ride="carousel">
    <div class="carousel-indicators">
      <%
        int index = 0;
        for (IntroSlide introSlide : introSlides) {
          String uniqueId = introSlide.getId() + "";
          // Set the first indicator as active
      %>
      <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="<%= index %>"
              class="<%= index == 0 ? "active" : "" %>"
              aria-current="<%= index == 0 ? "true" : "false" %>" aria-label="Slide <%= index + 1 %>"></button>
      <%
          index++;
        }
      %>
    </div>
    <div class="carousel-inner">
      <%
        index = 0;
        for (IntroSlide introSlide : introSlides) {
          String uniqueId = introSlide.getId() + "";
          // Set the first carousel item as active
      %>
      <div class="carousel-item <%= index == 0 ? "active" : "" %>">
        <img src="<%= request.getContextPath() + introSlide.getImageBasePath() + introSlide.getImageName() %>"
             class="d-block w-100 rounded-4 img-fluid" alt="<%= introSlide.getImageName() %>">
      </div>
      <%
          index++;
        }
      %>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>


  <!-- How It Works -->
  <div id="howItWorks" class="container p-0 my-2">
    <h3 class="text-primary mb-4 fw-bolder">How It Works?</h3>
    <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 g-4">

      <% for (HowItWork howItWork : howItWorks) {
        String uniqueId = howItWork.getId() + ""; %>
      <div class="col">
        <div class="card rounded-4 shadow-lg">

          <img src="<%= request.getContextPath() + howItWork.getImageBasePath() + howItWork.getImageName() %>"
               class="card-img-top custom-card-img-height img-fluid rounded-top-4" alt="<%= howItWork.getImageName() %>">
          <div class="card-body">
            <div class="d-flex justify-content-between mb-4">
              <h5 class="card-title fw-bold"><%= howItWork.getCaption() %> </h5>
              <span class="px-4 rounded-pill border border-1 border-primary d-flex justify-content-center align-items-center fw-bolder"><%= uniqueId %></span>
            </div>
            <ul class="nav nav-pills mb-3" id="pills-tab-<%= uniqueId %>" role="tablist">
              <li class="nav-item" role="presentation">
                <button class="nav-link active" id="pills-description-tab-<%= uniqueId %>"
                        data-bs-toggle="pill" data-bs-target="#pills-description-<%= uniqueId %>"
                        type="button" role="tab" aria-controls="pills-description-<%= uniqueId %>" aria-selected="true">
                  Description
                </button>
              </li>
              <li class="nav-item" role="presentation">
                <button class="nav-link " id="pills-user-action-tab-<%= uniqueId %>"
                        data-bs-toggle="pill" data-bs-target="#pills-user-action-<%= uniqueId %>"
                        type="button" role="tab" aria-controls="pills-user-action-<%= uniqueId %>" aria-selected="false">
                  User Action
                </button>
              </li>
              <li class="nav-item" role="presentation">
                <button class="nav-link " id="pills-additional-info-tab-<%= uniqueId %>"
                        data-bs-toggle="pill" data-bs-target="#pills-additional-info-<%= uniqueId %>"
                        type="button" role="tab" aria-controls="pills-additional-info-<%= uniqueId %>" aria-selected="false">
                  Additional Info
                </button>
              </li>
              <li class="nav-item" role="presentation">
                <button class="nav-link " id="pills-tip-tab-<%= uniqueId %>"
                        data-bs-toggle="pill" data-bs-target="#pills-tip-<%= uniqueId %>"
                        type="button" role="tab" aria-controls="pills-tip-<%= uniqueId %>" aria-selected="false">
                  Tip
                </button>
              </li>
            </ul>
            <div class="tab-content" id="pills-tabContent-<%= uniqueId %>">
              <div class="tab-pane fade show active" id="pills-description-<%= uniqueId %>" role="tabpanel"
                   aria-labelledby="pills-description-tab-<%= uniqueId %>">
                <%= howItWork.getDescription() %>
              </div>
              <div class="tab-pane fade" id="pills-user-action-<%= uniqueId %>" role="tabpanel"
                   aria-labelledby="pills-user-action-tab-<%= uniqueId %>">
                <%= howItWork.getUserAction() %>
              </div>
              <div class="tab-pane fade" id="pills-additional-info-<%= uniqueId %>" role="tabpanel"
                   aria-labelledby="pills-additional-info-tab-<%= uniqueId %>">
                <%= howItWork.getAdditionalInfo() %>
              </div>
              <div class="tab-pane fade" id="pills-tip-<%= uniqueId %>" role="tabpanel"
                   aria-labelledby="pills-tip-tab-<%= uniqueId %>">
                <%= howItWork.getTip() %>
              </div>
            </div>
          </div>
        </div>
      </div>
      <% } %>
    </div>
  </div>

</main>

<!-- Footer -->
<footer class="bg-dark text-white py-5">
  <div class="container">
    <div class="row">
      <div class="col-md-3">
        <h5>BiteBuddy</h5>
        <p>Delivering your favorite food, hot and fresh, at your doorstep.</p>
      </div>
      <div class="col-md-3">
        <h5>Quick Links</h5>
        <ul class="list-unstyled">
          <li><a href="#" class="text-white">About Us</a></li>
          <li><a href="#" class="text-white">Contact</a></li>
          <li><a href="#" class="text-white">FAQs</a></li>
          <li><a href="#" class="text-white">Privacy Policy</a></li>
        </ul>
      </div>
      <div class="col-md-3">
        <h5>Follow Us</h5>
        <ul class="list-unstyled d-flex">
          <li><a href="#" class="text-white fs-3 me-3"><i class="bi bi-facebook"></i></a></li>
          <li><a href="#" class="text-white fs-3 me-3"><i class="bi bi-twitter"></i></a></li>
          <li><a href="#" class="text-white fs-3 me-3"><i class="bi bi-instagram"></i></a></li>
          <li><a href="#" class="text-white fs-3"><i class="bi bi-linkedin"></i></a></li>
        </ul>
      </div>
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
<script src="bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
