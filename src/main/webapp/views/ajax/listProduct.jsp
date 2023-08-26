
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<c:forEach items="${products}" var="product">
    <li
            class="gategory-product-list col-lg-3 col-md-4 col-sm-6 col-xs-12">
        <div class="single-product-item">
            <div class="product-image">
                <a href="single-product.html"><img
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
                <a href="single-product.html">${product.name}</a>
                <div class="price-box">
                    <span class="price">${product.price}</span>
                </div>
            </div>
        </div>
    </li>
</c:forEach>

