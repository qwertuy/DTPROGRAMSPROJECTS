<html>
<head>

<title>HomePage</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<br><br><br>
<div class="row">
  <div class="col-md-4">
    <div class="thumbnail">
      <img src="./resources/images/saree1.jpg"" alt="...">
      <div class="caption">
        <h3>Designer saree</h3>
        <p><a href="noAccessPage" class="btn btn-primary" role="button">AddCart</a> <a href="reg" class="btn btn-default" role="button">Buy</a></p>
      </div>
    </div>
    
  </div>
  <div class="col-md-4">
    <div class="thumbnail">
      <img src="./resources/images/kurtis.jpg" alt="...">
      <div class="caption">
        <h3>Pink Fish cut Kurti</h3>
        <p><a href="noAccessPage" class="btn btn-primary" role="button">AddCart</a> <a href="reg" class="btn btn-default" role="button">Buy</a></p>
      </div>
    </div>
</div>
<div class="col-md-4">
    <div class="thumbnail">
      <img src="./resources/images/shirt.jpg"" alt="...">
      <div class="caption">
        <h3>Men's Shirt</h3>
        <p><a href="noAccessPage" class="btn btn-primary" role="button">AddCart</a> <a href="reg" class="btn btn-default" role="button">Buy</a></p>
      </div>
    </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
