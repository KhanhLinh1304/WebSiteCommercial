<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
		<section class="header-middle">
			<div class="container">
				<div class="row">
					<!-- HEADER-LEFT-MENU START -->
					<div class="col-lg-3 col-md-3 col-sm-3 ">
						<div style="margin-top: 25px;">
							<a  href="index.html"><h1 style="font-family:Impact; " >Fashion Clothing</h1> </a>
						</div>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6">
						<div class="categorys-product-search">
							<form action="/searchProduct" method="post" class="search-form-cat">
								<div class="search-product form-group" style="position: absolute;">
									<select name="catsearch" class="cat-search">
										<option value="">Categories</option>
								
									</select>
									<input type="text" class="form-control search-form" name="input" placeholder="Enter your search key ... " />
									<button class="search-button" value="Search" name="s" type="submit">
										<i class="fa fa-search"></i>
									</button>									 
								</div>
							</form>
						</div>
						</div>
					<div class="col-lg-3 col-md-3 col-sm-3 ">
								<ul class="list-inline" style="margin-top: 25px; ">
									<li><a style="color: black; font-size:20px ; font-family: 'Times New Roman';" href="cart.html"><b>Đăng Kí</b></a></li>
									<li><a style="color: black;font-size:20px ; font-family: 'Times New Roman';" href="registration.html"><b>Đăng Nhập</b></a></li>
								</ul>									
							
					
					<!-- HEADER-RIGHT-MENU END -->
				</div>
			</div>
		</section>
		<header class="main-menu-area">
			<div class="container">
				<div class="row">
					<!-- SHOPPING-CART START -->
					<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12 pull-right shopingcartarea">
						<div class="shopping-cart-out pull-right">
							<div class="shopping-cart">
								<a class="shop-link" href="cart.html" title="View my shopping cart">
									<i class="fa fa-shopping-cart cart-icon"></i>
									<b>My Cart</b>
									<span class="ajax-cart-quantity">2</span>
								</a>
								<div class="shipping-cart-overly">
									<div class="shipping-item">
										<span class="cross-icon"><i class="fa fa-times-circle"></i></span>
										<div class="shipping-item-image">
											<a href="#"><img src="img/shopping-image.jpg" alt="shopping image" /></a>
										</div>
										<div class="shipping-item-text">
											<span>2 <span class="pro-quan-x">x</span> <a href="#" class="pro-cat">Watch</a></span>
											<span class="pro-quality"><a href="#">S,Black</a></span>
											<p>$22.95</p>
										</div>
									</div>
									<div class="shipping-item">
										<span class="cross-icon"><i class="fa fa-times-circle"></i></span>
										<div class="shipping-item-image">
											<a href="#"><img src="img/shopping-image2.jpg" alt="shopping image" /></a>
										</div>
										<div class="shipping-item-text">
											<span>2 <span class="pro-quan-x">x</span> <a href="#" class="pro-cat">Women Bag</a></span>
											<span class="pro-quality"><a href="#">S,Gary</a></span>
											<p>$19.95</p>
										</div>
									</div>
									<div class="shipping-total-bill">
										<div class="cart-prices">
											<span class="shipping-cost">$2.00</span>
											<span>Shipping</span>
										</div>
										<div class="total-shipping-prices">
											<span class="shipping-total">$24.95</span>
											<span>Total</span>
										</div>										
									</div>
									<div class="shipping-checkout-btn">
										<a href="checkout.html">Check out <i class="fa fa-chevron-right"></i></a>
									</div>
								</div>
							</div>
						</div>
					</div>	
					<!-- SHOPPING-CART END -->
					<!-- MAINMENU START -->
					<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12 no-padding-right menuarea">
						<div class="mainmenu">
							<nav>
								<ul class="list-inline mega-menu">
									<li class="active"><a href="/Clothing_war/views/web/home.jsp">Trang Chủ</a>
									</li>
									<li>
										<a href="shop-gird.html">Thời Trang Nữ</a>
										<!-- DRODOWN-MEGA-MENU START -->
										<div class="drodown-mega-menu">
											<div class="left-mega col-xs-6">
												<div class="mega-menu-list">
													<a class="mega-menu-title" href="shop-gird.html">TOPS</a>
													<ul>
														<li><a href="shop-gird.html">T-shirts</a></li>
														<li><a href="shop-gird.html">clothing</a></li>
														<li><a href="shop-gird.html">Delivery</a></li>
													</ul>
												</div>
											</div>
											<div class="right-mega col-xs-6">
												<div class="mega-menu-list">
													<a class="mega-menu-title" href="shop-gird.html">Prodect</a>
													<ul>
														<li><a href="shop-gird.html">T-shirts</a></li>
														<li><a href="shop-gird.html">clothing</a></li>
														<li><a href="shop-gird.html">Watch</a></li>
														<li><a href="shop-gird.html">Delivery</a></li>
													</ul>
												</div>
											</div>
										</div>
										<!-- DRODOWN-MEGA-MENU END -->
									</li>
									<li>
										<a href="shop-gird.html">Thời Trang Nam</a>
										<!-- DRODOWN-MEGA-MENU START -->
										<div class="drodown-mega-menu">
											<div class="left-mega col-xs-6">
												<div class="mega-menu-list">
													<ul>
														<li><a href="shop-gird.html">T-shirts</a></li>
														<li><a href="shop-gird.html">clothing</a></li>
														<li><a href="shop-gird.html">Delivery</a></li>
													</ul>
												</div>
											</div>
										</div>
										<!-- DRODOWN-MEGA-MENU END -->
									</li>	
									<li><a href="#">Thương Hiệu</a></li>
								</ul>
							</nav>
						</div>
					</div>
					<!-- MAINMENU END -->
				</div>
					
			</div>
		</header>