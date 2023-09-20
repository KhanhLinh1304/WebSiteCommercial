<%@page import="model.BrandModel"%>
<%@page import="dao.impls.BrandDAO"%>
<%@page import="dao.impls.CategoryDAO"%>
<%@page import="model.CategoryModel"%>
<%@page import="java.util.List"%>
<%@page import="service.impls.CategoryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

<section class="header-middle">
	<div class="container">
	<%CategoryDAO categorySV = new CategoryDAO();
	List<CategoryModel> categories = categorySV.getCategory(); %>
		<div class="row">
			<!-- HEADER-LEFT-MENU START -->
			<div class="col-lg-2 col-md-2 col-sm-2 ">
				<div style="margin-top: 25px;">
<<<<<<< HEAD
					<a href="index.html"><h1 style="font-family: Impact;">Fashion
							</h1> </a>
=======
					<a href="index.html"><h1 style="font-family: Impact;">Fashion</h1> </a>
>>>>>>> a3af44eddd1295c4c8641cb4da7745e7aca55004
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6">
				<div class="categorys-product-search" style="width: 500px;">
					<form action="/searchProduct" method="post" class="search-form-cat">
						<div class="search-product form-group" style="position: absolute;">
							<select name="catsearch" class="cat-search">
							 <option value=""> categories</option>
							<% 
							for (CategoryModel category : categories) {
							%> 
								<option value="<%=category.getNameCategory()%>"><%=category.getNameCategory() %></option>
								<%} %>

							</select> <input type="text" class="form-control search-form" name="input"
								placeholder="Enter your search key ... " />
							<button class="search-button" value="Search" name="s"
								type="submit">
								<i class="fa fa-search"></i>
							</button>
						</div>
					</form>
				</div>
			</div>
			<c:set var="account" value="${sessionScope.account}"></c:set>
			<c:choose>
			<c:when test="${account != null}">
			<div class="col-lg-4 col-md-4 col-sm-4 ">
				<ul class="list-inline" style="margin-top: 25px;">
					<li><a
						style="color: black; font-size: 20px; font-family: 'Times New Roman';"
						href="user"><b>${account.getEmail()}</b></a></li>
						<li><a
						style="color: black; font-size: 20px; font-family: 'Times New Roman';"
						href="logout"><b>Đăng Xuất</b></a></li>
				</ul>
			</div>
			</c:when>
			<c:when test="${account == null}">
			<div class="col-lg-3 col-md-3 col-sm-3 ">
				<ul class="list-inline" style="margin-top: 25px;">
					<li><a
						style="color: black; font-size: 20px; font-family: 'Times New Roman';"
						href="register"><b>Đăng Kí</b></a></li>
					<li><a
						style="color: black; font-size: 20px; font-family: 'Times New Roman';"
						href="login"><b>Đăng Nhập</b></a></li>
				</ul>
			</div>
			</c:when>
			</c:choose>
		</div>
		</div>
</section>
<header class="main-menu-area">
	<div class="container">
		<div class="row">
			<!-- SHOPPING-CART START -->
			<div
				class="col-lg-3 col-md-3 col-sm-12 col-xs-12 pull-right shopingcartarea">
				<div class="shopping-cart-out pull-right">
				<c:set var="size" value="${sessionScope.size}" ></c:set>
					<div class="shopping-cart">
						<a class="shop-link" href="showCart"
							title="View my shopping cart"> <i
							class="fa fa-shopping-cart cart-icon"></i> <b>My Cart</b> <span
							class="ajax-cart-quantity">${size}</span>
						</a>
						
					</div>
				</div>
			</div>
			<!-- SHOPPING-CART END -->
			<!-- MAINMENU START -->
			<div
				class="col-lg-9 col-md-9 col-sm-12 col-xs-12 no-padding-right menuarea">
				<div class="mainmenu">
					<nav>
						<ul class="list-inline mega-menu">
							<li class="active"><a href="web-home">Trang Chủ</a></li>
							<li><a href="shop-gird.html">Thời Trang Áo </a> <!-- DRODOWN-MEGA-MENU START -->
								<div class="drodown-mega-menu">
									<%
									
									for (CategoryModel category : categories) {
									%>
									<div class="left-mega col-xs-6">
										<div class="mega-menu-list">

											<ul>
												<li><a
													href="CategoryController?categoryId=<%=category.getIdCategory()%>&ad=category"><%=category.getNameCategory()%></a></li>
											</ul>
										</div>
									</div>
									<%
									}
									%>
								</div> <!-- DRODOWN-MEGA-MENU END --></li>

							<li><a href="#">Thương Hiệu</a>
								<div class="drodown-mega-menu">
								<% BrandDAO brandDAO = new BrandDAO();
								   List<BrandModel> brands = brandDAO.getAllBrand();
								   for(BrandModel brand: brands)
								   { %>
									<div class="left-mega col-xs-6">
										<div class="mega-menu-list">
											<ul>
												<li><a href="BrandController?brandId=<%= brand.getIdB() %>"><%= brand.getNameB() %></a></li>
											
											</ul>
										</div>
									</div>
									<%} %>
								</div></li>
						</ul>
					</nav>
				</div>
			</div>
			<!-- MAINMENU END -->
		</div>

	</div>
</header>
