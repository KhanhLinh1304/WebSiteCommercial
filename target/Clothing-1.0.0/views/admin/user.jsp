<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
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
										<h2>Dashboard One</h2>
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
							<a href="product-edit.html">Add Product</a>
						</div>
						<table>
							<tr>
								<th>Image</th>
								<th>Product Title</th>
								<th>Status</th>
								<th>Purchases</th>
								<th>Product sales</th>
								<th>Stock</th>
								<th>Price</th>
								<th>Setting</th>
							</tr>
							<tr>
								<td><img src="img/new-product/5-small.jpg" alt="" /></td>
								<td>Product Title 1</td>
								<td>
									<button class="pd-setting">Active</button>
								</td>
								<td>50</td>
								<td>$750</td>
								<td>Out Of Stock</td>
								<td>$15</td>
								<td>
									<button data-toggle="tooltip" title="Edit"
										class="pd-setting-ed">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
									<button data-toggle="tooltip" title="Trash"
										class="pd-setting-ed">
										<i class="fa fa-trash-o" aria-hidden="true"></i>
									</button>
								</td>
							</tr>
							<tr>
								<td><img src="img/new-product/7-small.jpg" alt="" /></td>
								<td>Product Title 6</td>
								<td>
									<button class="ps-setting">Paused</button>
								</td>
								<td>400</td>
								<td>$4000</td>
								<td>In Stock</td>
								<td>$10</td>
								<td>
									<button data-toggle="tooltip" title="Edit"
										class="pd-setting-ed">
										<i class="fa fa-pencil-square-o" aria-hidden="true"></i>
									</button>
									<button data-toggle="tooltip" title="Trash"
										class="pd-setting-ed">
										<i class="fa fa-trash-o" aria-hidden="true"></i>
									</button>
								</td>
							</tr>
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