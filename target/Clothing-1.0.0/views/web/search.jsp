<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
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
						<ul>
							<li>
								<label class="cheker">
									<input type="checkbox" name="Size"/>
									<span></span>
								</label>
								<a href="#">S<span> (10)</span></a>
							</li>
							<li>
								<label class="cheker">
									<input type="checkbox" name="Size"/>
									<span></span>
								</label>
								<a href="#">m<span> (10)</span></a>
							</li>
							<li>
								<label class="cheker">
									<input type="checkbox" name="Size"/>
									<span></span>
								</label>
								<a href="#">l<span> (10)</span></a>
							</li>
						</ul>
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

							<c:forEach items="${list}" var="product">
								<!-- SINGLE ITEM START -->
								<li class="gategory-product-list col-lg-3 col-md-4 col-sm-6 col-xs-12">
									<div class="single-product-item">
										<div class="product-image">
											<a href="single-product.html"><img src="${product.getUrlImg()}" alt="product-image" /></a>
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
											<a href="single-product.html">${product.getName()}</a>
											<div class="price-box">
												<span class="price">${product.getPrice()}</span>
											</div>
										</div>
									</div>
								</li>
								<!-- SINGLE ITEM END -->
							</c:forEach>
							<!-- SINGLE ITEM START -->
<%--							<li class="gategory-product-list col-lg-3 col-md-4 col-sm-6 col-xs-12">--%>
<%--								<div class="single-product-item">--%>
<%--									<div class="product-image">--%>
<%--										<a href="single-product.html"><img src="<c:url value='/template/web/img/product/sale/3.jpg'/>" alt="product-image" /></a>--%>
<%--										<a href="single-product.html" class="new-mark-box">new</a>--%>
<%--										<div class="overlay-content">--%>
<%--											<ul>--%>
<%--												<li><a href="#" title="Quick view"><i class="fa fa-search"></i></a></li>--%>
<%--												<li><a href="#" title="Quick view"><i class="fa fa-shopping-cart"></i></a></li>--%>
<%--												<li><a href="#" title="Quick view"><i class="fa fa-retweet"></i></a></li>--%>
<%--												<li><a href="#" title="Quick view"><i class="fa fa-heart-o"></i></a></li>--%>
<%--											</ul>--%>
<%--										</div>--%>
<%--									</div>--%>
<%--									<div class="product-info">--%>
<%--										<div class="customar-comments-box">--%>
<%--											<div class="rating-box">--%>
<%--												<i class="fa fa-star"></i>--%>
<%--												<i class="fa fa-star"></i>--%>
<%--												<i class="fa fa-star"></i>--%>
<%--												<i class="fa fa-star"></i>--%>
<%--												<i class="fa fa-star-half-empty"></i>--%>
<%--											</div>--%>
<%--											<div class="review-box">--%>
<%--												<span>1 Review(s)</span>--%>
<%--											</div>--%>
<%--										</div>--%>
<%--										<a href="single-product.html">Faded Short Sleeves T-shirt</a>--%>
<%--										<div class="price-box">--%>
<%--											<span class="price">$16.51</span>--%>
<%--										</div>--%>
<%--									</div>--%>
<%--								</div>--%>
<%--							</li>--%>
							<!-- SINGLE ITEM END -->
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
<!-- -------------------------- Bắt Đầu Sản Phẩm Bán Chạy--------------------------- -->
<%--<section class="main-content-section">--%>

<%--			<div class="container">--%>
<%--				<div class="row">--%>
<%--					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">--%>
<%--						<div class="row">--%>
<%--							<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">--%>
<%--								<div class="new-product-area">--%>
<%--									<div class="left-title-area">--%>
<%--										<h2 class="left-title">Sản Phẩm Bán Chạy Nhất</h2>--%>
<%--									</div>						--%>
<%--									<div class="row">--%>
<%--										<div class="col-xs-12">--%>
<%--											<div class="row">--%>
<%--												<!-- HOME2-NEW-PRO-CAROUSEL START -->--%>
<%--												<div class="home2-new-pro-carousel">--%>
<%--													<!-- NEW-PRODUCT SINGLE ITEM START -->--%>
<%--													<div class="item">--%>
<%--														<div class="new-product">--%>
<%--															<div class="single-product-item">--%>
<%--																<div class="product-image">--%>
<%--																	<a href="#"><img src="<c:url value='/template/web/img/product/sale/8.jpg'/>"/></a>--%>
<%--																	<a href="#" class="new-mark-box">new</a>--%>
<%--																	<div class="overlay-content">--%>
<%--																		<ul>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-search"></i></a></li>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-shopping-cart"></i></a></li>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-retweet"></i></a></li>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-heart-o"></i></a></li>--%>
<%--																		</ul>--%>
<%--																	</div>--%>
<%--																</div>--%>
<%--																<div class="product-info">--%>
<%--																	<div class="customar-comments-box">--%>
<%--																		<div class="rating-box">--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star-half-empty"></i>--%>
<%--																		</div>--%>
<%--																		<div class="review-box">--%>
<%--																			<span>3 Review(s)</span>--%>
<%--																		</div>--%>
<%--																	</div>--%>
<%--																	<a href="single-product.html">Printed Dress</a>--%>
<%--																	<div class="price-box">--%>
<%--																		<span class="price">$26.00</span>--%>
<%--																	</div>--%>
<%--																</div>--%>
<%--															</div>--%>
<%--														</div>--%>
<%--													</div>--%>
<%--													<div class="item">--%>
<%--														<div class="new-product">--%>
<%--															<div class="single-product-item">--%>
<%--																<div class="product-image">--%>
<%--																	<a href="#"><img src="<c:url value='/template/web/img/product/sale/8.jpg'/>"/></a>--%>
<%--																	<a href="#" class="new-mark-box">new</a>--%>
<%--																	<div class="overlay-content">--%>
<%--																		<ul>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-search"></i></a></li>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-shopping-cart"></i></a></li>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-retweet"></i></a></li>--%>
<%--																			<li><a href="#" title="Quick view"><i class="fa fa-heart-o"></i></a></li>--%>
<%--																		</ul>--%>
<%--																	</div>--%>
<%--																</div>--%>
<%--																<div class="product-info">--%>
<%--																	<div class="customar-comments-box">--%>
<%--																		<div class="rating-box">--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star"></i>--%>
<%--																			<i class="fa fa-star-half-empty"></i>--%>
<%--																		</div>--%>
<%--																		<div class="review-box">--%>
<%--																			<span>3 Review(s)</span>--%>
<%--																		</div>--%>
<%--																	</div>--%>
<%--																	<a href="single-product.html">Printed Dress</a>--%>
<%--																	<div class="price-box">--%>
<%--																		<span class="price">$26.00</span>--%>
<%--																	</div>--%>
<%--																</div>--%>
<%--															</div>--%>
<%--														</div>--%>
<%--													</div>--%>
<%--													--%>
<%--													<!-- NEW-PRODUCT SINGLE ITEM END -->--%>
<%--												</div>--%>
<%--												<!-- HOME2-NEW-PRO-CAROUSEL END -->--%>
<%--											</div>--%>
<%--										</div>--%>
<%--									</div>--%>
<%--								</div>										--%>
<%--							</div>--%>
<%--							--%>
<%--							--%>
<%--							<div class="col-xs-12">--%>
<%--								<!-- SALE-PODUCT-AREA START -->--%>
<%--								<div class="sale-poduct-area new-product-area">--%>
<%--									<div class="left-title-area">--%>
<%--										<h2 class="left-title"> Sản Phẩm</h2>--%>
<%--									</div>--%>
<%--									<div class="row">--%>
<%--										<!-- HOME2-SALE-CAROUSEL START -->--%>
<%--										<div class="home2-sale-carousel">--%>
<%--											<!-- NEW-PRODUCT SINGLE ITEM START -->--%>
<%--											<div class="item">--%>
<%--												<div class="new-product">--%>
<%--													<div class="single-product-item">--%>
<%--														<div class="product-image">--%>
<%--															<a href="#"><img src="<c:url value='/template/web/img/product/sale/12.jpg'/>"/></a>--%>
<%--															<a href="#" class="new-mark-box">new</a>--%>
<%--															<div class="overlay-content">--%>
<%--																<ul>--%>
<%--																	<li><a href="#" title="Quick view"><i class="fa fa-search"></i></a></li>--%>
<%--																	<li><a href="#" title="Quick view"><i class="fa fa-shopping-cart"></i></a></li>--%>
<%--																	<li><a href="#" title="Quick view"><i class="fa fa-retweet"></i></a></li>--%>
<%--																	<li><a href="#" title="Quick view"><i class="fa fa-heart-o"></i></a></li>--%>
<%--																</ul>--%>
<%--															</div>--%>
<%--														</div>--%>
<%--														<div class="product-info">--%>
<%--															<div class="customar-comments-box">--%>
<%--																<div class="rating-box">--%>
<%--																	<i class="fa fa-star"></i>--%>
<%--																	<i class="fa fa-star"></i>--%>
<%--																	<i class="fa fa-star"></i>--%>
<%--																	<i class="fa fa-star-half-empty"></i>--%>
<%--																	<i class="fa fa-star-half-empty"></i>--%>
<%--																</div>--%>
<%--																<div class="review-box">--%>
<%--																	<span>1 Review(s)</span>--%>
<%--																</div>--%>
<%--															</div>--%>
<%--															<a href="single-product.html">Printed Summer Dress</a>--%>
<%--															<div class="price-box">--%>
<%--																<span class="price">$28.98</span>--%>
<%--																<span class="old-price">$30.51</span>--%>
<%--															</div>--%>
<%--														</div>--%>
<%--													</div>--%>
<%--												</div>--%>
<%--											</div>--%>
<%--										</div>--%>
<%--										<!-- HOME2-SALE-CAROUSEL END -->--%>
<%--									</div>--%>
<%--								</div>--%>
<%--								<!-- SALE-PODUCT-AREA end -->--%>
<%--							</div>--%>
<%--						</div>	--%>
<%--					</div>	--%>
<%--				</div>--%>
<%--			</div>--%>
<%--		</section>	--%>
<%--<!-- -------------------------------------- kết thúc sản phẩm bán chạy ---------------------- -->--%>

<%--<!-- -----------------------------Bắt đầu tất cả sản phẩm------------------------------------------ -->--%>
<%--<section class="main-content-section-full-column">--%>
<%--			<div class="container">--%>
<%--				--%>
<%--				<div class="row">--%>
<%--					<div class="col-xs-12">--%>
<%--						<!-- FEATURED-PRODUCTS-AREA START -->--%>
<%--						<div class="featured-products-area">--%>
<%--							<div class="left-title-area">--%>
<%--								<h2 class="left-title">Tất Cả Sản Phẩm</h2>--%>
<%--							</div>	--%>
<%--							<div class="row">--%>
<%--								<!-- FEARTURED-CAROUSEL START -->	--%>
<%--								<div class="feartured-carousel">				--%>
<%--									<div class="item">--%>
<%--										<!-- SINGLE-PRODUCT-ITEM START -->								--%>
<%--										<div class="single-product-item">--%>
<%--											<div class="product-image">--%>
<%--												<a href="#"><img src="<c:url value='/template/web/img/product/sale/4.jpg'/>"/></a>--%>
<%--												<a href="#" class="new-mark-box">new</a>--%>
<%--												<div class="overlay-content">--%>
<%--													<ul>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-search"></i></a></li>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-shopping-cart"></i></a></li>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-retweet"></i></a></li>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-heart-o"></i></a></li>--%>
<%--													</ul>--%>
<%--												</div>--%>
<%--											</div>--%>
<%--											<div class="product-info">--%>
<%--												<div class="customar-comments-box">--%>
<%--													<div class="rating-box">--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star-half-empty"></i>--%>
<%--													</div>--%>
<%--													<div class="review-box">--%>
<%--														<span>1 Review(s)</span>--%>
<%--													</div>--%>
<%--												</div>--%>
<%--												<a href="single-product.html">Faded Short Sleeves T-shirt</a>--%>
<%--												<div class="price-box">--%>
<%--													<span class="price">$16.51</span>--%>
<%--												</div>--%>
<%--											</div>--%>
<%--										</div>--%>
<%--										<!-- SINGLE-PRODUCT-ITEM END -->--%>
<%--										<!-- SINGLE-PRODUCT-ITEM START -->									--%>
<%--										<div class="single-product-item">--%>
<%--											<div class="product-image">--%>
<%--												<a href="#"><img src="<c:url value='/template/web/img/product/sale/6.jpg'/>"/></a>--%>
<%--												<a href="#" class="new-mark-box">new</a>--%>
<%--												<div class="overlay-content">--%>
<%--													<ul>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-search"></i></a></li>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-shopping-cart"></i></a></li>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-retweet"></i></a></li>--%>
<%--														<li><a href="#" title="Quick view"><i class="fa fa-heart-o"></i></a></li>--%>
<%--													</ul>--%>
<%--												</div>--%>
<%--											</div>--%>
<%--											<div class="product-info">--%>
<%--												<div class="customar-comments-box">--%>
<%--													<div class="rating-box">--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star"></i>--%>
<%--														<i class="fa fa-star"></i>--%>
<%--													</div>--%>
<%--													<div class="review-box">--%>
<%--														<span>1 Review(s)</span>--%>
<%--													</div>--%>
<%--												</div>--%>
<%--												<a href="single-product.html">Printed Chiffon Dress</a>--%>
<%--												<div class="price-box">--%>
<%--													<span class="price">$16.40</span>--%>
<%--													<span class="old-price">$20.50</span>--%>
<%--												</div>--%>
<%--											</div>--%>
<%--										</div>--%>
<%--										<!-- SINGLE-PRODUCT-ITEM END -->								--%>
<%--									</div>--%>
<%--																		--%>
<%--								</div>--%>
<%--								<!-- FEARTURED-CAROUSEL END -->--%>
<%--							</div>--%>
<%--						</div>--%>
<%--						<!-- FEATURED-PRODUCTS-AREA END -->--%>
<%--					</div>						--%>
<%--				</div>--%>
<%--				--%>
<%--			</div>--%>
<%--		</section>--%>
<%--<!-- ---------------------Kết thúc tất cả sản phẩm------------------------ -->--%>
<%--<!-- ---------------------------- bắt đầu brand------------------------------ -->--%>

<%--		<!-- --------------------------------kết thúc brand---------------------------- -->--%>
</body>
</html>