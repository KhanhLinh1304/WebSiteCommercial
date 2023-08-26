<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<section class="main-content-section" style="margin-top: 20px">
			<div class="container">

				<div class="row">
					<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
						<!-- PRODUCT-LEFT-SIDEBAR START -->
						<div class="product-left-sidebar">
							<h2 class="left-title pro-g-page-title">Catalog</h2>
							<div class="product-single-sidebar">
								<span class="sidebar-title">Brand</span>
								<form action="" class="size">
									<ul>
										<li>
											<label class="cheker">
												<input type="checkbox" name="s" class="checkbox"/>
												<span></span>
											</label>
											<a href="#">S<span> (10)</span></a>
										</li>
										<li>
											<label class="cheker">
												<input type="checkbox" name="m" class="checkbox"/>
												<span></span>
											</label>
											<a href="#">m<span> (10)</span></a>
										</li>
										<li>
											<label class="cheker">
												<input type="checkbox" name="l" class="checkbox"/>
												<span></span>
											</label>
											<a href="#">l<span> (10)</span></a>
										</li>
										<li>
											<label class="cheker">
												<input type="checkbox" name="xl" class="checkbox"/>
												<span></span>
											</label>
											<a href="#">xl<span> (10)</span></a>
										</li>
										<li>
											<label class="cheker">
												<input type="checkbox" name="xxl" class="checkbox"/>
												<span></span>
											</label>
											<a href="#">xxl<span> (10)</span></a>
										</li>
									</ul>
								</form>


							</div>

							<div class="product-single-sidebar">
								<span class="sidebar-title">Price</span>
								<ul>
									<li>
										<label><strong>Range:</strong><input type="text" id="slidevalue" /></label>
									</li>
									<li>
										<div id="price-range"></div>
									</li>
								</ul>
							</div>

						</div>

						<!-- SINGLE SIDEBAR TAG END -->
					</div>
					<div class="col-lg-9 col-md-9 col-sm-9 col-xs-12">
						<div class="right-all-product">
							<div class="product-category-title">
								<!-- PRODUCT-CATEGORY-TITLE START -->
								<h1>
									<span class="cat-name">Women</span>
									<span class="count-product">There are 13 products.</span>
								</h1>
								<!-- PRODUCT-CATEGORY-TITLE END -->
							</div>
							<div class="product-shooting-area">
								<div class="product-shooting-bar">
									<!-- SHOORT-BY START -->
									<div class="shoort-by">
										<label for="productShort">Sort by</label>
										<div class="short-select-option">
											<select name="sortby" id="productShort">
												<option value="">--</option>
												<option value="">Price: Lowest first</option>
												<option value="">Price: Highest first</option>
												<option value="">Product Name: A to Z</option>
												<option value="">Product Name: Z to A</option>
												<option value="">In stock</option>
												<option value="">Reference: Lowest first</option>
												<option value="">Reference: Highest first</option>
											</select>
										</div>
									</div>
									<!-- SHOORT-BY END -->
									<!-- SHOW-PAGE START -->
									<div class="show-page">
										<label for="perPage">Show</label>
										<div class="s-page-select-option">
											<select name="show" id="perPage">
												<option value="">11</option>
												<option value="">12</option>
											</select>
										</div>
										<span>per page</span>
									</div>
									<!-- SHOW-PAGE END -->
									<!-- VIEW-SYSTEAM START -->

									<!-- VIEW-SYSTEAM END -->
								</div>
								<!-- PRODUCT-SHOOTING-RESULT START -->
								<div class="product-shooting-result">
									<form action="#">
										<button class="btn compare-button">
											Compare (<span class="compare-value">1</span>)
											<i class="fa fa-chevron-right"></i>
										</button>
									</form>
									<div class="showing-item">
										<span>Showing 1 - 12 of 13 items</span>
									</div>
									<div class="showing-next-prev">
										<ul class="pagination-bar">
											<li class="disabled">
												<a href="#" ><i class="fa fa-chevron-left"></i>Previous</a>
											</li>
											<li class="active">
												<span><a class="pagi-num" href="#">1</a></span>
											</li>
											<li>
												<span><a class="pagi-num" href="#">2</a></span>
											</li>
											<li>
												<a href="#" >Next<i class="fa fa-chevron-right"></i></a>
											</li>
										</ul>
										<form action="#">
											<button class="btn showall-button">Show all</button>
										</form>
									</div>
								</div>
								<!-- PRODUCT-SHOOTING-RESULT END -->
							</div>
						</div>
						<!-- ALL GATEGORY-PRODUCT START -->
						<div class="all-gategory-product">
							<div class="row">
								<ul class="gategory-product">
									<!-- SINGLE ITEM START -->
									<c:forEach items="${products}" var="product">
									<li class="gategory-product-list col-lg-3 col-md-4 col-sm-6 col-xs-12">
										<div class="single-product-item">
											<div class="product-image">
												<a href="single-product.html"><img src="${product.urlImg}" alt="product-image" /></a>
												<a href="single-product.html" class="new-mark-box">new</a>
												<div class="overlay-content">
													<ul>
														<li><a href="#" title="Quick view"><i class="fa fa-search"></i></a></li>
														<li><a href="#" title="Quick view"><i class="fa fa-shopping-cart"></i></a></li>
														<li><a href="#" title="Quick view"><i class="fa fa-retweet"></i></a></li>
														<li><a href="#" title="Quick view"><i class="fa fa-heart-o"></i></a></li>
													</ul>
												</div>
											</div>
											<div class="product-info">
												<div class="customar-comments-box">
													<div class="rating-box">
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star"></i>
														<i class="fa fa-star-half-empty"></i>
													</div>
													<div class="review-box">
														<span>1 Review(s)</span>
													</div>
												</div>
												<a href="single-product.html">${product.name}</a>
												<div class="price-box">
													<span class="price"><p>${product.price}</p></span>
												</div>
											</div>
										</div>
									</li>
									<!-- SINGLE ITEM END -->

									</c:forEach>

								</ul>
							</div>
						</div>
						<!-- ALL GATEGORY-PRODUCT END -->
						<!-- PRODUCT-SHOOTING-RESULT START -->
						<div class="product-shooting-result product-shooting-result-border">
							<form action="#">
								<button class="btn compare-button">
									Compare (<strong class="compare-value">1</strong>)
									<i class="fa fa-chevron-right"></i>
								</button>
							</form>
							<div class="showing-item">
								<span>Showing 1 - 12 of 13 items</span>
							</div>
							<div class="showing-next-prev">
								<ul class="pagination-bar">
									<li class="disabled">
										<a href="#" ><i class="fa fa-chevron-left"></i>Previous</a>
									</li>
									<li class="active">
										<span><a class="pagi-num" href="#">1</a></span>
									</li>
									<li>
										<span><a class="pagi-num" href="#">2</a></span>
									</li>
									<li>
										<a href="#" >Next<i class="fa fa-chevron-right"></i></a>
									</li>
								</ul>
								<form action="#">
									<button class="btn showall-button">Show all</button>
								</form>
							</div>
						</div>
						<!-- PRODUCT-SHOOTING-RESULT END -->
					</div>
				</div>
			</div>
		</section>
<script src="<c:url value='/template/web/js/jquery-3.6.1.min.js'/>"/></script>
<script>
	$('.checkbox').click(function () {
		let data = $('.size').serialize();
		$.ajax({
			url: '/filterProduct',
			type: 'post',
			data: {
				data : data
			},
			success: function (response) {
				$('.gategory-product').html(response)
			},
			error: function () {
				alert("Error")
			}
		})
	})
</script>
</body>
</html>