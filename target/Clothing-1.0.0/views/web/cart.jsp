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
<section class="main-content-section">
			<div class="container">
				
				<div class="row">
					
					
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<!-- SHOPING-CART-MENU START -->
						
						<!-- SHOPING-CART-MENU END -->
						<!-- CART TABLE_BLOCK START -->
						<div class="table-responsive">
							<!-- TABLE START -->
							<table class="table table-bordered" id="cart-summary">
								<!-- TABLE HEADER START -->
								<thead>
									<tr>
										<th class="cart-product">Product</th>
										<th class="cart-description">Description</th>
										<th class="cart-unit text-right">Unit price</th>
										<th class="cart_quantity text-center">Qty</th>
										<th class="cart-delete">&nbsp;</th>
										<th class="cart-total text-right">Total</th>
									</tr>
								</thead>
								<!-- TABLE HEADER END -->
								<!-- TABLE BODY START -->
								<tbody>	
									<!-- SINGLE CART_ITEM START -->
									<tr>
										<td class="cart-product">
											<a href="#"><img src="<c:url value='/template/web/img/product/sale/8.jpg'/>"/></a>
										</td>
										<td class="cart-description">
											<p class="product-name"><a href="#">Faded Short Sleeves T-shirt</a></p>
											<small>SKU : demo_1</small>
											<small><a href="#">Size : S, Color : Orange</a></small>
										</td>
										
										<td class="cart-unit">
											<ul class="price text-right">
												<li class="price">$16.51</li>
											</ul>
										</td>
										<td class="cart_quantity text-center">
											<div class="cart-plus-minus-button">
												<input class="cart-plus-minus" type="text" name="qtybutton" value="0">
											</div>
										</td>
										<td class="cart-delete text-center">
											<span>
												<a href="#" class="cart_quantity_delete" title="Delete"><i class="fa fa-trash-o"></i></a>
											</span>
										</td>
										<td class="cart-total">
											<span class="price">$16.51</span>
										</td>
									</tr>
									<!-- SINGLE CART_ITEM END -->
									<!-- SINGLE CART_ITEM START -->
									
									<!-- SINGLE CART_ITEM END -->
									<!-- SINGLE CART_ITEM START -->
									<tr>
										<td class="cart-product">
											<a href="#"><img src="<c:url value='/template/web/img/product/sale/8.jpg'/>"/></a>
										</td>
										<td class="cart-description">
											<p class="product-name"><a href="#">Printed Summer Dress</a></p>
											<small>SKU : demo_5</small>
											<small><a href="#">Size : M, Color : Blue</a></small>
										</td>
									
										<td class="cart-unit">
											<ul class="price text-right">
												<li class="price special-price">$30.45</li>
												<li class="price-percent-reduction small">&nbsp;-7.05%&nbsp;</li>
												<li class="old-price">$37.50</li>
											</ul>
										</td>
										<td class="cart_quantity text-center">
											<div class="cart-plus-minus-button">
												<input class="cart-plus-minus" type="text" name="qtybutton" value="0">
											</div>
										</td>
										<td class="cart-delete text-center">
											<a href="#" class="cart_quantity_delete" title="Delete"><i class="fa fa-trash-o"></i></a>
										</td>
										<td class="cart-total">
											<span class="price">$30.45</span>
										</td>
									</tr>
									<!-- SINGLE CART_ITEM END -->
								</tbody>
								<!-- TABLE BODY END -->
								<!-- TABLE FOOTER START -->
								<tfoot>										
									<tr class="cart-total-price">
										<td class="cart_voucher" colspan="3" rowspan="4"></td>
										<td class="text-right" colspan="3">Total products (tax excl.)</td>
										<td id="total_product" class="price" colspan="1">$76.46</td>
									</tr>
									<tr>
										<td class="text-right" colspan="3">Total shipping</td>
										<td id="total_shipping" class="price" colspan="1">$5.00</td>
									</tr>
									<tr>
										<td class="text-right" colspan="3">Total vouchers (tax excl.)</td>
										<td class="price" colspan="1">$0.00</td>
									</tr>
									<tr>
										<td class="total-price-container text-right" colspan="3">
											<span>Total</span>
										</td>
										<td id="total-price-container" class="price" colspan="1">
											<span id="total-price">$76.46</span>
										</td>
									</tr>
								</tfoot>		
								<!-- TABLE FOOTER END -->									
							</table>
							<!-- TABLE END -->
						</div>
						<!-- CART TABLE_BLOCK END -->
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="first_item primari-box mycartaddress-info">
							<!-- SINGLE ADDRESS START -->
							<ul class="address">
								<li>
									<h3 class="page-subheading box-subheading">
										Delivery address (BootExperts Office)
									</h3>
								</li>
								<li><span class="address_name">BootExperts</span></li>
								<li><span class="address_company">Web development Company</span></li>
								<li><span class="address_address1">Bonossri</span></li>
								<li><span class="address_address2">D-Block</span></li>
								<li><span class="">Rampura</span></li>
								<li><span class="">Dhaka</span></li>
								<li><span class="address_phone">+880 1735161598</span></li>
								<li><span class="address_phone_mobile">+880 1975161598</span></li>
							</ul>	
							<!-- SINGLE ADDRESS END -->
						</div>						
					</div>
					<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
						<div class="second_item primari-box mycartaddress-info">
							<!-- SINGLE ADDRESS START -->
							<ul class="address">
								<li>
									<h3 class="page-subheading box-subheading">
										Invoice address (BootExperts Home)
									</h3>
								</li>
								<li><span class="address_name">BootExperts</span></li>
								<li><span class="address_company">Web development Company</span></li>
								<li><span class="address_address1">Dhaka</span></li>
								<li><span class="address_address2">Bonossri</span></li>
								<li><span class="">Dhaka-1205</span></li>
								<li><span class="">Rampura</span></li>
								<li><span class="address_phone">+880 1735161598</span></li>
								<li><span class="address_phone_mobile">+880 1975161598</span></li>
							</ul>	
							<!-- SINGLE ADDRESS END -->
						</div>
					</div>
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<!-- RETURNE-CONTINUE-SHOP START -->
						<div class="returne-continue-shop">
							<a href="index.html" class="continueshoping"><i class="fa fa-chevron-left"></i>Continue shopping</a>
							<a href="checkout-signin.html" class="procedtocheckout">Proceed to checkout<i class="fa fa-chevron-right"></i></a>
						</div>	
						<!-- RETURNE-CONTINUE-SHOP END -->						
					</div>
				</div>
			</div>
		</section>
</body>
</html>