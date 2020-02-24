<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Home</title>
  <!-- MDB icon -->
  <link rel="icon" href="img/mdb-favicon.ico" type="image/x-icon">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
  <!-- Google Fonts Roboto -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" href="../../static/css/bootstrap.min.css">
  <!-- Material Design Bootstrap -->
  <link rel="stylesheet" href="../../static/css/mdb.min.css">
  <!-- Your custom styles (optional) -->
  <link rel="stylesheet" href="../../static/css/style.css">
</head>
<body>

  <!-- Start your project here-->  
<!--Navbar-->
<nav class="navbar navbar-dark  indigo darken-2">

    <!-- Navbar brand -->
    <a class="navbar-brand" href="${pageContext.request.contextPath}/home/${USER.id}">Optiflex</a>
  
    <!-- Collapse button -->
    <button class="navbar-toggler toggler-example" type="button" data-toggle="collapse" data-target="#navbarSupportedContent1"
      aria-controls="navbarSupportedContent1" aria-expanded="false" aria-label="Toggle navigation"><span class="dark-blue-text"><i
          class="fas fa-bars fa-1x"></i></span></button>
  
    <!-- Collapsible content -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent1">
  
      <!-- Links -->
      <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
          <a class="nav-link" href="${pageContext.request.contextPath}/home/${USER.id}">Home <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/updateprofile/${USER.id}">Update Profile</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="${pageContext.request.contextPath}/logout/${USER.id}">Logout</a>
        </li>
      </ul>
      <!-- Links -->
  
    </div>
    <!-- Collapsible content -->
  
  </nav>
  <!--/.Navbar-->

   <!-- BIG CONTAINER -->
  <div class="container-fluid">
    <!-- Content here -->
    <div><a href="${pageContext.request.contextPath}/list/${USER.id}/2">CEO</a></div>
    <div><a href="${pageContext.request.contextPath}/list/${USER.id}/1">Business Development</a></div>
    <div><a href="${pageContext.request.contextPath}/list/${USER.id}/3">DMT</a></div>
    <div><a href="${pageContext.request.contextPath}/list/${USER.id}/4">Business Analysis</a></div>
    <div><a href="${pageContext.request.contextPath}/list/${USER.id}/5">Infrastructure</a></div>
    <div><a href="/list/${USER.id}/6">Dev</a></div>
    <div><a href="${pageContext.request.contextPath}/list/${USER.id}/7">Shared Services</a></div>
  </div></div>


  <!-- End your project here-->

  <!-- jQuery -->
  <script type="text/javascript" src="../../static/js/jquery.min.js"></script>
  <!-- Bootstrap tooltips -->
  <script type="text/javascript" src="../../static/js/popper.min.js"></script>
  <!-- Bootstrap core JavaScript -->
  <script type="text/javascript" src="../../static/js/bootstrap.min.js"></script>
  <!-- MDB core JavaScript -->
  <script type="text/javascript" src="../../static/js/mdb.min.js"></script>
  <!-- Your custom scripts (optional) -->
  <script type="text/javascript"></script>

</body>
</html>
