<!DOCTYPE html>
<!-- <html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"> -->
	<html>
	 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="utf-8" />
	<title>PRODUCTLIST</title>
	


 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 

</head>

<body>

<br/>
<jsp:include page="header.jsp"></jsp:include>
<br><br>
	<table class="table table-striped table-bordered dt-responsive nowrap">

		<thead>
			<tr>

				<th>Action</th>
				<th>ProdutName</th>
				<th>Price</th>

				<th>Quantity</th>
				<th>Image</th>
			</tr>
		</thead>
		<tbody>
			<c:set var="tot" value="0"></c:set>
			<c:forEach items="${cartlist}" var="p">
				<c:set var="t" value="${p.prices*p.quantity}"></c:set>
				<c:set var="tot" value="${tot+t }" />

				<tr>
					<td><a class="btn btn-danger"
						href="./cart_delete?id=${p.cartid}"><em class="fa fa-trash"></em></a></td>
					<td>${p.productid.productname}</td>
					<td><i class="fa fa-inr" aria-hidden="true"></i>${p.prices}</td>
					<td>${p.quantity}</td>

					<td><i class="fa fa-inr" aria-hidden="true"></i>${p.prices*p.quantity}</td>
				</tr>
			</c:forEach>
		</tbody>

                 
	</table>
	<br><br><br>
        <div class="panel-footer">
               <div class="row">
              <center> 
                 <a href="../" ><button class="btn btn-primary">CONTINUE SHOPPING</button></a>
                                
                 <a href="customerdetails"><button class="btn btn-primary">CHECK OUT</button></a> 
                 
                  <h4 style="color:green;">Grand Total = <c:out value="${tot}"/></h4> </center>
                 </div>
                 </div>      
                <jsp:include page="footer.jsp"></jsp:include>    
</body>
</html>