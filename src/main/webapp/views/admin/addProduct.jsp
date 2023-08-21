<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
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
														placeholder="Product Title">
												</div>
												<div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i class="fa fa-usd"
														aria-hidden="true"></i></span> <input type="text"
														class="form-control" placeholder="Regular Price">
												</div>

												<div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
														class="icon nalika-favorites" aria-hidden="true"></i></span> <input
														type="number" min="0" class="form-control"
														placeholder="Quantity">
												</div>
												
											</div>
										</div>
										<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
											<div class="review-content-section">
												<div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
														class="icon nalika-favorites-button" aria-hidden="true"></i></span>
													<input type="file" class="form-control"
														placeholder="Product Image">
												</div>
												
												<div class="mg-b-pro-edt">
													<select name="select"
														class="form-control pro-edt-select form-control-primary">
														<option value="opt1">Category</option>
														<option value="opt2">2</option>
														<option value="opt3">3</option>
														<option value="opt4">4</option>
														<option value="opt5">5</option>
														<option value="opt6">6</option>
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