<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- To Access the Bootstrap link -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">

</head>
<body>

<!-- AddProduct coding  started -->
<jsp:include page="header.jsp"></jsp:include><br><br>

<hr>

<form class="form-horizontal" action="customer">
<fieldset>

<!-- Form Name -->
<legend>SHIPPING DETAILS</legend>


<div class="form-group">
  <label class="col-md-4 control-label" for="">SHIPPING ID</label>  
  <div class="col-md-4">
  <input id="" name="cusid" placeholder="SHIPPING ID" class="form-control input-md" required="" type="text"  >
    
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_name">CUSTOMER NAME</label>  
  <div class="col-md-4">
  <input id="product_name"  placeholder="CUSTOMER NAME" class="form-control input-md" required="" type="text" name="cname" >
    
  </div>
</div>




<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_prices">EMAIL ID</label>  
  <div class="col-md-4">
  <input id="available_quantity" placeholder="EMAIL ID" class="form-control input-md" required="" type="text"  name="cemail">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_prices">SHIPPING ADDRESS</label>  
  <div class="col-md-4">
  <input id="available_quantity"  placeholder="SHIPPING ADDRESS" class="form-control input-md" required="" type="text" name="caddress">
    
  </div>
</div>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_prices">PHONE NUMBER</label>  
  <div class="col-md-4">
  <input id="available_quantity"  placeholder="PHONE NUMBER" class="form-control input-md" required="" type="text" name="cphone">
    
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="product_categorie">PAY</label>
  <div class="col-md-4">
    <select id="product_categorie" name="cpay" class="form-control">
       <option value="card">CARD</option>
        <option value="cod">COD</option>
    </select>
  </div>
</div>
<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
  <center>  <button id="singlebutton" name="singlebutton" class="btn btn-primary">SUBMIT</button></center>
  </div>
  </div>

</fieldset>
</form>
      
              <center> 
                  
                <a href="thankyoupage"><button class="btn btn-primary">CheckYourShippingDetails</button></a>
                 
                </center>
           
       
    <jsp:include page="footer.jsp"></jsp:include>


</body>
</html>