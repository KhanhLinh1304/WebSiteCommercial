<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- -------------------------- Bắt Đầu Sản Phẩm Bán Chạy--------------------------- -->

	<%@include file="/common/web/slides.jsp"%>

	<section class="main-content-section">
		<div class="container">
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="all-gategory-product">
				<div class="row">
					<ul class="gategory-product">
						<!-- SINGLE ITEM START -->
						<c:forEach items="${products}" var="product">
							<li
								class="gategory-product-list col-md-4 col-sm-6 col-xs-12">
								<div class="single-product-item">
									<div class="product-image">
										<a href="/detailProduct?idProduct=${product.idP}"><img
											src="${product.urlImg}" alt="product-image" /></a> <a
											href="#" class="new-mark-box">new</a>
										<div class="overlay-content">
											<ul>
												<li><a href="#" title="Quick view"><i
														class="fa fa-search"></i></a></li>
												<li><a href="#" title="Quick view"><i
														class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title="Quick view"><i
														class="fa fa-retweet"></i></a></li>
												<li><a href="#" title="Quick view"><i
														class="fa fa-heart-o"></i></a></li>
											</ul>
										</div>
									</div>
									<div class="product-info">
										<div class="customar-comments-box">
											<div class="rating-box">
												<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star-half-empty"></i>
											</div>
											<div class="review-box">
												<span>1 Review(s)</span>
											</div>
										</div>
										<a href="/detailProduct?idProduct=${product.idP}">${product.name}</a>
										<div class="price-box">
											<span class="price">${product.price}</span>
										</div>
									</div>
								</div>
							</li>
						</c:forEach>


						<!-- SINGLE ITEM END -->
					</ul>
				</div>
			</div>
		</div>
		</div>
	</section>
	<!-- ---------------------Kết thúc tất cả sản phẩm------------------------ -->
	<!-- ---------------------------- bắt đầu brand------------------------------ -->
	<section class="brand-client-area">
		<div class="container">
			<div class="row">
				<!-- BRAND-CLIENT-ROW START -->
				<div class="brand-client-row">
					<div class="center-title-area">
						<h2 class="center-title">BRAND & CLIENTS</h2>
					</div>
					<div class="col-xs-12">
						<div class="row">
							<!-- CLIENT-CAROUSEL START -->
							<div class="client-carousel">
								<!-- CLIENT-SINGLE START -->
								<div class="item">
									<div class="single-client">
										<a href="#"> <img
											src="<c:url value='/template/web/img/brand/1.png'/>"
											alt="brand-client" />
										</a>
									</div>
								</div>

								<!-- CLIENT-SINGLE END -->
							</div>
							<!-- CLIENT-CAROUSEL END -->
						</div>
					</div>
				</div>
				<!-- BRAND-CLIENT-ROW END -->
			</div>
		</div>
	</section>
	<!-- --------------------------------kết thúc brand---------------------------- -->
</body>
</html>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- -------------------------- Bắt Đầu Sản Phẩm Bán Chạy--------------------------- -->

	<%@include file="/common/web/slides.jsp"%>

	<section class="main-content-section">
		<div class="container">
	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="all-gategory-product">
				<div class="row">
					<ul class="gategory-product">
						<!-- SINGLE ITEM START -->
						<c:forEach items="${products}" var="product">
							<li
								class="gategory-product-list col-md-4 col-sm-6 col-xs-12">
								<div class="single-product-item">
									<div class="product-image">
										<a href="/detailProduct?idProduct=${product.idP}"><img
											src="${product.urlImg}" alt="product-image" /></a> <a
											href="#" class="new-mark-box">new</a>
										<div class="overlay-content">
											<ul>
												<li><a href="#" title="Quick view"><i
														class="fa fa-search"></i></a></li>
												<li><a href="addToCart?idProduct=${product.idP}&quantity=1" title="Quick view"><i
														class="fa fa-shopping-cart"></i></a></li>
												<li><a href="#" title="Quick view"><i
														class="fa fa-retweet"></i></a></li>
												<li><a href="#" title="Quick view"><i
														class="fa fa-heart-o"></i></a></li>
											</ul>
										</div>
									</div>
									<div class="product-info">
										<div class="customar-comments-box">
											<div class="rating-box">
												<i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star"></i> <i class="fa fa-star"></i> <i
													class="fa fa-star-half-empty"></i>
											</div>
											<div class="review-box">
												<span>1 Review(s)</span>
											</div>
										</div>
										<a href="/detailProduct?idProduct=${product.idP}">${product.name}</a>
										<div class="price-box">
											<span class="price">${product.price}</span>
										</div>
										
									</div>
								</div>
							</li>
						</c:forEach>


						<!-- SINGLE ITEM END -->
					</ul>
				</div>
			</div>
		</div>
		</div>
	</section>
	<!-- ---------------------Kết thúc tất cả sản phẩm------------------------ -->
	<!-- ---------------------------- bắt đầu brand------------------------------ -->
	<section class="brand-client-area">
		<div class="container">
			<div class="row">
				<!-- BRAND-CLIENT-ROW START -->
				<div class="brand-client-row">
					<div class="center-title-area">
						<h2 class="center-title">BRAND & CLIENTS</h2>
					</div>
					<div class="col-xs-12">
						<div class="row">
							<!-- CLIENT-CAROUSEL START -->
							<div class="client-carousel">
								<!-- CLIENT-SINGLE START -->
								<div class="item">
									<div class="single-client">
										<a href="#"> <img
											src="<c:url value='/template/web/img/brand/1.png'/>"
											alt="brand-client" />
										</a>
									</div>
								</div>

								<!-- CLIENT-SINGLE END -->
							</div>
							<!-- CLIENT-CAROUSEL END -->
						</div>
					</div>
				</div>
				<!-- BRAND-CLIENT-ROW END -->
			</div>
		</div>
	</section>
	<!-- --------------------------------kết thúc brand---------------------------- -->
</body>
</html>
>>>>>>> a3af44eddd1295c4c8641cb4da7745e7aca55004
