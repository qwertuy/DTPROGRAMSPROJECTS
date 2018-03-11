<!DOCTYPE html>
<!-- <html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"> -->
	<html>
	 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<head>
	<meta charset="utf-8" />
	<title>PRODUCTLIST</title>
	
<!-- datatable -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	
<link rel="stylesheet" type="text/css" href="../resources/css/dataTables.bootstrap.min.css"/>


<link rel="stylesheet" type="text/css" href="../resources/css/datatables.css"/>


<link rel="stylesheet" type="text/css" href="../resources/css/datatables.min.css"/>

<!-- end -->

 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 

</head>

<body>

<br/>
<jsp:include page="header.jsp"></jsp:include>
<br><br>
	<table class="table table-striped table-bordered dt-responsive nowrap">

		<thead>
			<tr>

				<th>ID</th>
				<th>ProdutName</th>
				<th>Price</th>

				<th>Action</th>
				<th>Image</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${slist}" var="p">
				<tr>
					<td>${p.productid}</td>
					<td>${p.productname}</td>
					<td>${p.productprice}</td>
					<td><a class="fa fa-pencil-square-o" href="./product_edit?id=${p.productid}">
							</a> 
							<a class="fa fa-trash-o"	href="./product_delete?id=${p.productid}"></a></td>
					<td><img
						src="${pageContext.request.contextPath}/resources/images/${p.p_image}"
						class="img-rounded" alt="" width="75px" height="50px" /></td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
	<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
  <script type="text/javascript" src="../resources/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="../resources/js/dataTables.bootstrap.min.css"></script>

<script type="text/javascript">
$(document).ready(function(){
    $('.table').DataTable();
});
</script>
                 
</body>
</html>