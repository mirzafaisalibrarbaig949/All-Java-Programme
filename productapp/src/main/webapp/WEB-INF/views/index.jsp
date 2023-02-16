<html>
<head>
<%@include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class=container mt-3>
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center ">Welcome to Product App</h1>
			</div>
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">S.No.</th>
						<th scope="col">Product Name</th>
						<th scope="col">Description</th>
						<th scope="col">Price</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${product}" var="p">
						<tr>
							<th scope="row">${p.id}</th>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td>${p.price }</td>
						</tr>
					</c:forEach>
			</table>

			<div class="container text-center">

				<a href="add-product" class="btn btn-outline-info">Add Product</a>
			</div>

		</div>

	</div>
</body>
</html>
