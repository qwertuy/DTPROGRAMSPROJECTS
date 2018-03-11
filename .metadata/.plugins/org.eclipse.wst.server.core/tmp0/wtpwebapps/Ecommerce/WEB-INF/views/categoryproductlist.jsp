<!DOCTYPE html>
<!-- <html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"> -->
	<html>
	 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="utf-8" />
	<title>PRODUCTLIST</title>
	<!-- Latest compiled and minified CSS -->

</head>

<body>

<br/>
<jsp:include page="header.jsp"></jsp:include><br><br>

<table class="table table-striped table-bordered dt-responsive nowrap">
                
                   <thead>
            <tr>
            <th class="hidden-xs">ID</th>
                        <th>Name</th>
                       <th>Category</th>
                       <th>Price</th>
                       <th>Image</th>           
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="p">
            <tr>
                
                       <td class="hidden-xs">${p.productid}</td>
                           <td >${p.productname}</td>
                          <td>${p.categoryid.categoryname}</td>  
                           <td>${p.productprice}</td> 
                           <td><a href="user/product?id=${p.productid}"><img src="./resources/images/${p.p_image}"  class="img-rounded" alt="" width="75px" height="50px"/></a></td>       
               
            </tr>
             </c:forEach>
              
                 </table>
                 
</body>
</html>