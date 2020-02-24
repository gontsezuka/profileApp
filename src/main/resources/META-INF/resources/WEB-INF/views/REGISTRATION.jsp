<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Opti Profile Registration</title>
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

<!-- Default form login -->
<form class="text-center border border-light p-5" action="/registeruser" method="POST">

    <p class="h4 mb-4">Create Profile</p>

    <!--  <input type="hidden" value="${USER.id}" id="id" class="form-control mb-4" > -->
    <!-- Email -->
    <input type="email" value="${USER.email}" id="email" name="email"class="form-control mb-4" placeholder="E-mail e.g yourname@optiflex.co.za">

    <input type="text" value="${USER.nickname}" id="nickname" name="nickname" class="form-control mb-4" placeholder="Nick Name">

    <input type="password" value="${USER.pass}" id="pass" name="pass" class="form-control mb-4" placeholder="Password">

    <input type="text" value="${USER.role}" id="role" name="role" class="form-control mb-4" placeholder="Description e.g DevOps Intern">

    <input type="text" value="${USER.surname}" id="surname" name="surname" class="form-control mb-4" placeholder="surname">

    <input type="text" value="${USER.username}" id="username" name="username" class="form-control mb-4" placeholder="Name">

    <select class="mdb-select md-form" searchable="Search here.." name="groups" id="groups">
        <option value="" disabled selected>Choose your Divisison</option>
       <c:forEach items="${ALLGROUPS}" var="group">
            
            <option value="${group.id}"><c:out value="${group.groupname}"></c:out></option>
           
    </c:forEach> 
      </select>    
    <!-- Password -->

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
    <button class="btn btn-info btn-block my-4" type="submit">Register...</button>

    <!-- Register -->
    <p>Already a member?
        <a href="${pageContext.request.contextPath}/login">Login</a>
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
  <script type="text/javascript" src="../../staticjs/mdb.min.js"></script>
  <!-- Your custom scripts (optional) -->
  <script type="text/javascript"></script>

</body>
</html>