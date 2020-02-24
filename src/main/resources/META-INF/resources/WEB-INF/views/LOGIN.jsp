<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Opti Profile login</title>
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
 <!-- Default form login -->
<form class="text-center border border-light p-5" action="/loginuser" method="POST">

  <p class="h4 mb-4">Sign in</p>

  <!-- Email -->
  <input type="email" id="email" name="email" class="form-control mb-4" placeholder="E-mail">

  <!-- Password -->
  <input type="password" id="password" name="password" class="form-control mb-4" placeholder="Password">

  <div class="d-flex justify-content-around">
      <div>
          <!-- Remember me -->
      </div>
      <div>
          <!-- Forgot password -->
          <a href="">Forgot password?</a>
      </div>
  </div>

  <!-- Sign in button -->
  <button class="btn btn-info btn-block my-4" type="submit">Log in</button>

  <!-- Register -->
  <p>Not a member?
      <a href="${pageContext.request.contextPath}/registration">Register</a>
  </p>

 
</form>
<!-- Default form login -->
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
