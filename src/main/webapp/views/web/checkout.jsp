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
			 <c:if test="${orderMessage != null }"><div><p>${orderMessage }</p></div></c:if>
			
				<form action="checkout" method="post">
				<div class="row">
				<input type="hidden" value="${totalQuantity}" name="totalQuantity">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<!-- SHOPING-CART-MENU START -->
						
						<!-- SHOPING-CART-MENU END -->
						<!-- CART TABLE_BLOCK START -->
						<div class="table-responsive">
							<!-- TABLE START -->
						
							<table class="table table-bordered" id="cart-summary">
								<!-- TABLE HEADER START -->
								<thead>
									<tr >
										<th style="text-align: center" class="cart-product">Hình Ảnh</th>
										<th style="text-align: center" class="cart-description">Tên Sản Phẩm</th>
										<th style="text-align: center" class="cart_quantity text-center">Số lượng</th>
										<th style="text-align: center" class="cart-total text-right">Total</th>
									</tr>
								</thead>
								<!-- TABLE HEADER END -->
								<!-- TABLE BODY START -->
								<tbody>	
									<!-- SINGLE CART_ITEM START -->
										<c:forEach var="list" items="${listItem}">
									<tr>
								
										<td class="cart-product">
											<a href="#"><img src="<c:url value='${list.product.urlImg}'/>"/></a>
										</td>
										<td class="cart-description">
											<p class="product-name"  style="text-align: center"><a href="#">${list.product.name}</a></p>
										</td>
										
									
										<td class="cart_quantity text-center">
											<div >
												<input readonly style="border:none;outline: none; text-align:center" type="text" name="quantity" value="${list.quantity}">
											</div>
										</td>
										
										<td class="cart-total">
											<span><input name="totalPriceItem"readonly style="border:none;outline: none; text-align:-webkit-left" type="text" value="<fmt:formatNumber value="${list.price * list.quantity}" pattern="#,###"/>"></span>
										
										</td>
									</tr>
									</c:forEach>
								</tbody>
								<tfoot>										
									
									<tr>
										<td class="total-price-container text-right" colspan="3">
											<span>Total</span>
										</td>
										<td id="total-price-container" class="price" colspan="3">
											<span id="total-price"><input name="totalPriceCart" readonly style="border:none; outline: none;text-align:center" type="text" value="<fmt:formatNumber value="${totalPrice}" pattern="#,###"/>"></span>
										</td>
									</tr>
								</tfoot>		
								<!-- TABLE FOOTER END -->									
							</table>
							<!-- TABLE END -->
							
						</div>
						<!-- CART TABLE_BLOCK END -->
					</div>
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<!-- RETURNE-CONTINUE-SHOP START -->
						<div class="returne-continue-shop">
							<button type="submit">Thanh Toán<i class="fa fa-chevron-right"></i></button>
						</div>	
						<!-- RETURNE-CONTINUE-SHOP END -->						
					</div>
				</div>
				</form>
			</div>
		</section>
</body>
</html>