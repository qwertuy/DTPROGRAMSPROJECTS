<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
  
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br><br><br>
<center>
<h4 style="font-family:Segoe Print;color:blue">THANKS FOR SHOPPING..</h4>
<h3 style="font-family:Segoe Print;color:blue">CHECK YOUR SHIPPING DETAILS</h3>
<form action="check" class="form-horizontal">

<div class="form-group">
  <label class="col-md-4 control-label" for="">SHIPPING ID</label>  
  <div class="col-md-4">
  <input id="" name="cusid" placeholder="SHIPPING ID" class="form-control input-md" required="" type="text">
    
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
  <center>  <button id="singlebutton" name="singlebutton" class="btn btn-primary">CHECK</button></center>
  </div>
  </div>

</form>
<table class="table table-striped table-bordered dt-responsive nowrap">
<thead>
   <tr>
   <th>CUSTOMER NAME</th>
   <th>EMAIL ID</th>
   <th>ADDRESS</th>
   <th>PHONE</th>
   <th>PAYMENT MODE</th>
   </tr>
</thead>
  <tr>
  
  <td>${sdetail.cusname}</td>
  <td>${sdetail.email}</td>
  <td>${sdetail.address}</td>
  <td>${sdetail.phone}</td>
  <td>${sdetail.pay}</td>
  </tr>
 
</table>
</center>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>