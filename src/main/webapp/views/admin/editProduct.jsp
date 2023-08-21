<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
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
	<div class="single-product-tab-area mg-b-30">
		<!-- Single pro tab review Start-->
		<div class="single-pro-review-area">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="review-tab-pro-inner">
							<ul id="myTab3" class="tab-review-design">
								<li class="active"><a href="#description"><i
										class="icon nalika-edit" aria-hidden="true"></i> Product Edit</a></li>

							</ul>
							<div id="myTabContent" class="tab-content custom-product-edit">
								<div class="product-tab-list tab-pane fade active in"
									id="description">
									<div class="row">
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="review-content-section">
												<div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
														class="icon nalika-edit" aria-hidden="true"></i></span> <input
														type="text" class="form-control"
														placeholder="Product Title" name="title"
														value="${product.name}">
												</div>
												<div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i class="fa fa-usd"
														aria-hidden="true"></i></span> <input type="text"
														class="form-control" placeholder="Regular Price"
														name="price" value="${product.price}">
												</div>

												<div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
														class="icon nalika-favorites" aria-hidden="true"></i></span> <input
														type="number" min="0" class="form-control" name="quantity"
														placeholder="Quantity" value="${product.quantity}">
												</div>

											</div>
										</div>
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="review-content-section">
												<div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
														class="icon nalika-favorites-button" aria-hidden="true"></i></span>
													<img src="${product.image}" alt=""
														style="max-width: 11.9%;" /> <input id="file-input"
														type="file" class="form-control" name="image"
														placeholder="Product Image">
												</div>
												<div class="mg-b-pro-edt">
													<select name="select"
														class="form-control pro-edt-select form-control-primary">
														<c:forEach var="category" items="${categories}">

															<option value="${category.idCategory }"
																${category.idCategory eq product.idCategory ? 'selected' : ''}>${category.nameCategory}</option>
														</c:forEach>


													</select>
												</div>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
											<div class="text-center custom-pro-edt-ds">
												<button type="submit"
													class="btn btn-ctl-bt waves-effect waves-light m-r-10">Save
												</button>

											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>