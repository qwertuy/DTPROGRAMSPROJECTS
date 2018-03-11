<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BOHEMEIN</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="row">
  <div class="col-sm-4">
    <div class="thumbnail">
      <img src="./resources/images/free.jpg" alt="...">
      <div class="caption">
        <h3>Tops</h3>	
        <p><a href="#" class="btn btn-primary" role="button">Buy</a> <a href="#" class="btn btn-default" role="button">Add to cart</a></p>
      </div>
    </div>
  </div>
   <div class="col-sm-4">
    <div class="thumbnail">
      <div class="caption">
        <h3>Cotton saree</h3>
        <p><a href="#" class="btn btn-primary" role="button">Buy</a> <a href="#" class="btn btn-default" role="button">Add to cart</a></p>
      </div>
    </div>
  </div>
   <div class="col-sm-4">
    <div class="thumbnail">
      <div class="caption">
        <h3>Men's T-Shirt</h3>
        <p><a href="#" class="btn btn-primary" role="button">Buy</a> <a href="#" class="btn btn-default" role="button">Add to cart</a></p>
      </div>
    </div>
  </div>
</div>
<div class="row">
  <div class="col-xs-4">
    <a href="#" class="thumbnail">
      <img src="./resources/images/tops.jpg" alt="...">
    </a>
  </div>
  <div class="col-xs-4">
    <a href="#" class="thumbnail">
      <img src="./resources/images/saree.jpg" alt="...">
    </a>
  </div>
  <div class="col-xs-4">
    <a href="#" class="thumbnail">
      <img src="./resources/images/t shirt.jpg" alt=>
    </a>
  </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>