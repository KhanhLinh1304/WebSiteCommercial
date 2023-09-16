<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
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
                        <tbody class="tbody-cart">
                        <!-- SINGLE CART_ITEM START -->
                        <c:forEach var="list" items="${listItem}">
                            <tr>

                                <td class="cart-product">
                                    <a href="#"><img src="<c:url value='${list.product.urlImg}'/>"/></a>
                                </td>
                                <td class="cart-description">
                                    <p class="product-name"><a href="#">${list.product.name}</a></p>
                                    <!-- <small>SKU : demo_1</small>
                                    <small><a href="#">Size : S, Color : Orange</a></small> -->
                                </td>

                                <td class="cart-unit">
                                    <ul class="price text-right">
                                        <li class="price"><fmt:formatNumber value="${list.price}" pattern="#,###"/></li>
                                    </ul>
                                </td>
                                <td class="cart_quantity text-center">
                                    <div class="cart-plus-minus-button">
                                        <input class="cart-plus-minus" type="text" name="qtybutton"
                                               value="${list.quantity}">
                                        <a style="margin-right: 5px; padding: 0 5px"
                                                href="decrease-cart?idP=${list.product.idP}">-</a>
                                        <a href="increase-cart?idP=${list.product.idP}">+</a>
                                    </div>
                                </td>
                                <td class="cart-delete text-center">
											<span>
												<a href="removeCart?idItem=${list.product.idP}"
                                                   class="cart_quantity_delete" title="Delete"><i
                                                        class="fa fa-trash-o"></i></a>
											</span>
                                </td>
                                <td class="cart-total">
                                    <span class="price"><fmt:formatNumber value="${list.price * list.quantity}"
                                                                          pattern="#,###"/></span>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                        <tfoot>

                        <tr>
                            <td class="total-price-container text-right" colspan="3">
                                <span>Total</span>
                            </td>
                            <td id="total-price-container" class="price" colspan="1">
                                <span id="total-price"><fmt:formatNumber value="${totalPrice}" pattern="#,###"/></span>

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
                    <a href="index.html" class="continueshoping"><i class="fa fa-chevron-left"></i>Continue shopping</a>
                    <a href="checkout-signin.html" class="procedtocheckout">Proceed to checkout<i
                            class="fa fa-chevron-right"></i></a>
                </div>
                <!-- RETURNE-CONTINUE-SHOP END -->
            </div>
        </div>
    </div>
</section>

</body>
</html>