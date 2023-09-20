<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Order List</title>
</head>
<body>
	<div class="breadcome-area">
		<div class="container-fluid" style="margin-top: 40px">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="breadcome-list">
						<div class="row">
							<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
								<div class="breadcomb-wp">
									<div class="breadcomb-icon">
										<i class="icon nalika-home"></i>
									</div>
									<div class="breadcomb-ctn">
										<h2>${title}</h2>
										<p>
											Welcome to Nalika <span class="bread-ntd">Admin
												Template</span>
										</p>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="product-status mg-b-30">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="product-status-wrap">
						<h4>Products List</h4>
						<div class="add-product">
							<a href="admin-add-product">Add Product</a>
						</div>
						${notify}
						<table>
							<tr>
								<th>Image</th>
								<th>Product Name</th>
								<th>price</th>
								<th>Category</th>
								<th>quantity</th>
								<th>Setting</th> 
							</tr>
							<c:forEach items="${products}" var="product">
							<tr>
								<td><img src="${product.urlImg}" alt="" /></td>
								<td>${product.name}</td>
								<td>${product.price}</td>
								 <td>${product.idCategory}</td>
								<td>${product.quantity}</td>
							   
								<td>
								<a href="admin-edit-product?idProduct=${product.idP}" class="button-link">
									<button data-toggle="tooltip" title="Edit"
										class="pd-setting-ed">
									<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
									</a>
									<a href="admin-delete-product?idProduct=${product.idP}" class="button-link">
									<button data-toggle="tooltip" title="Trash"
										class="pd-setting-ed">
										<i class="fa fa-trash-o" aria-hidden="true"></i>
									</button>
									</a>
								</td>
							</tr>
						</c:forEach>
						</table>
						<div class="custom-pagination">
							<ul class="pagination">
								<li class="page-item"><a class="page-link" href="#">Previous</a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item"><a class="page-link" href="#">2</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#">Next</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>