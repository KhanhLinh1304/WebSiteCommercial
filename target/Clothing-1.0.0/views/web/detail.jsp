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
	<section class="main-content-section " style="margin-top: 20px">
			<div class="container">
							
				<div class="row">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<!-- SINGLE-PRODUCT-DESCRIPTION START -->
						<div class="row">
							<div class="col-lg-5 col-md-5 col-sm-4 col-xs-12">
								<div class="single-product-view">
									  <!-- Tab panes -->
									<div class="tab-content">
										<div class="tab-pane active" id="thumbnail_1">
											<div class="single-product-image">
												<a href="#"><img src="${product.urlImg }"/></a>
												<a class="new-mark-box" href="#">new</a>
											
											</div>	
										</div>
									
									</div>										
								</div>
								
							</div>
							<div class="col-lg-7 col-md-7 col-sm-8 col-xs-12">
								<div class="single-product-descirption">
									<h2>${product.name}</h2>
									
									<div class="single-product-review-box">
										<div class="rating-box">
											<i class="fa fa-star"></i>
											<i class="fa fa-star"></i>
											<i class="fa fa-star"></i>
											<i class="fa fa-star"></i>
											<i class="fa fa-star-half-empty"></i>
										</div>
										<div class="read-reviews">
											<a href="#">Read reviews (1)</a>
										</div>
										<div class="write-review">
											<a href="#">Write a review</a>
										</div>		
									</div>
								
									<div class="single-product-price">
										<h2><p>${product.price}đ</p></h2>
									</div>
									
									<div class="single-product-quantity">
										<p class="small-title">Quantity</p> 
										<div class="cart-quantity">
											<div class="cart-plus-minus-button single-qty-btn">
												<input class="cart-plus-minus sing-pro-qty" type="text" name="qtybutton" value="0">
											</div>
										</div>
									</div>
									<div class="single-product-size">
										<p class="small-title">Size </p> 
										<c:forEach items = "${lists}" var="size">
											<input type="radio" id="html" name="size" value="${size.nameSize}">
                                          <label for="html">${size.nameSize}</label>
												</c:forEach>
										</select>
									
									</div>
									<div class="single-product-color">
										<p class="small-title">Color </p> 
										<c:forEach items="${lists}" var="color">
										
										<input type="radio" id="html" name="color" value="${color.nameColor}">
                                          <label for="html">${color.nameColor}</label>
                                          </c:forEach>
                                       
									</div>
									<div class="single-product-add-cart">
										<a class="add-cart-text" title="Add to cart" href="#">Add to cart</a>
									</div>
								</div>
							</div>
						</div>
					
						<div class="row">
							<div class="col-sm-12">
								<div class="left-title-area">
									<h2 class="left-title">related products</h2>
								</div>	
							</div>
							<div class="related-product-area featured-products-area">
								<div class="col-sm-12">
									<div class=" row">
										<!-- RELATED-CAROUSEL START -->
										<div class="related-product">
											<!-- SINGLE-PRODUCT-ITEM START -->
											<div class="item">
												<div class="single-product-item">
													<div class="product-image">
														<a href="#"><img src="<c:url value='/template/web/img/product/sale/8.jpg'/>"/></a>
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
														<a href="#">Faded Short T-sh...</a>
														<div class="price-box">
															<span class="price">$16.51</span>
														</div>
													</div>
												</div>							
											</div>
														
										</div>
										<!-- RELATED-CAROUSEL END -->
									</div>	
								</div>
							</div>	
						</div>
						<!-- RELATED-PRODUCTS-AREA END -->
					</div>
					<!-- RIGHT SIDE BAR START -->
					
					<!-- SINGLE SIDE BAR END -->				
				</div>
			</div>
		</section>
</body>
</html>