<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGINPAGE</title>
<!-- To Access the Bootstrap link -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
<link href="./resources/css/loginpage.css" rel="stylesheet" type="text/css"/>
<style type="text/css">
  .backgroundclr
  { 
    background-color: #1a0000;
  }
</style>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<!-- LoginPage coding started -->
<!--<div class="container">
 
    <div class="row">
    
        <div class="col-md-offset-5 col-md-3">
           
            <div class="form-login">
            <h4 style="font-family: monospace;font-style: italic;"><b>WELCOME TO ONLINE BOOK STORE</h4></b>
            <input type="text" id="userName" class="form-control input-sm chat-input" placeholder="username" />
            </br>
            <input type="text" id="userPassword" class="form-control input-sm chat-input" placeholder="password" />
            </br>
            <div class="wrapper">
            <span class="group-btn">     
                <a href="./test" class="btn btn-primary btn-md">LOGIN <i class="fa fa-sign-in"></i></a>
                <a href="./index" class="btn btn-primary btn-md">BACK <i class="fa fa-sign-in"></i></a>
            </span>
           
            </div>
            
            </div>
         
        </div>
         
    </div>-->
    
    <!-- Loginpage coding finshed here -->
    <center>
    <div class="container" style="padding:50px 0">
	<div class="row"><h4 style="font-family: Engravers MT;font-family: monospace;color: gray;"><img src="${pageContext.request.contextPath}/resources/images/loginlogo.png"/></h4></div>
	<!-- Main Form -->
	<div class="l">
	<c:url var="loginUrl" value="/j_spring_security_check" />
	
		<form id="login-form" name="formLogin" action="${loginUrl}"  method="post" class="text-left">
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="lg_username" class="sr-only">Username</label>
						<input type="text" class="form-control" id="lg_username" name="j_username" placeholder="username" required>
					</div>
					<div class="form-group">
						<label for="lg_password" class="sr-only">Password</label>
						<input type="password" class="form-control" id="lg_password" name="j_password" placeholder="password" required>
					</div>

				</div>
				<!-- <button type="submit" class="login-button">Login</button> -->
			<center>	<input type="submit" name="submit"  class="btn btn-primary"/></center>
			</div>
			 <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		</form>
		</div>
		</div>

</center>
  <!-- <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">New User <a href="#">Register</a></span>
  </div> -->
    <jsp:include page="footer.jsp"></jsp:include>
</div>

</body>
</html>