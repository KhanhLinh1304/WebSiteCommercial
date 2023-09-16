<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>

</head>
<body>
<div class="breadcome-area">
    <div class="container-fluid" style="margin-top: 40px">
        <div class="row">
            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                <div class="breadcome-list">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                            <div class="breadcomb-wp">
                                <div class="breadcomb-icon">
                                    <i class="icon nalika-home"></i>
                                </div>
                                <div class="breadcomb-ctn">
                                    <h2>Dashboard One</h2>
                                    <p>
                                        Welcome to Nalika <span class="bread-ntd">Admin
												Template</span>
                                    </p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="single-product-tab-area mg-b-30">
    <!-- Single pro tab review Start-->
    <div class="single-pro-review-area">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="review-tab-pro-inner">
                        <ul id="myTab3" class="tab-review-design">
                            <li class="active"><a href="#description"><i
                                    class="icon nalika-edit" aria-hidden="true"></i> Product Edit</a></li>

                        </ul>
                        <div id="myTabContent" class="tab-content custom-product-edit">
                            <div class="product-tab-list tab-pane fade active in"
                                 id="description">
                                ${notify}
                                <form action="admin-add-product" method="post" enctype="multipart/form-data">
                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                            <div class="review-content-section">
                                                <div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
                                                            class="icon nalika-edit" aria-hidden="true"></i></span>
                                                    <input
                                                            type="text" class="form-control"
                                                            placeholder="Product Title" name="name" required>
                                                </div>
                                                <div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i class="fa fa-usd"
                                                                                       aria-hidden="true"></i></span>
                                                    <input type="number" min="0"
                                                           class="form-control" placeholder="Regular Price" name="price" required>
                                                </div>

                                                <div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
                                                            class="icon nalika-favorites" aria-hidden="true"></i></span>
                                                    <input
                                                            type="number" min="0" class="form-control"
                                                            placeholder="Quantity" name="quantity" required>
                                                </div>
                                                <div class="input-group mg-b-pro-edt">
                                                    <c:forEach items="${listSize}" var="listSize">
                                                        <input type="checkbox" name="size-${listSize.idSize}">
                                                        <span class="name-size" style="color: white;
															  margin-right: 10px;
															  padding: 6px 12px;">${listSize.nameSize}</span>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                            <div class="review-content-section">
                                                <div class="input-group mg-b-pro-edt">
													<span class="input-group-addon"><i
                                                            class="icon nalika-favorites-button" aria-hidden="true"></i></span>
                                                    <input type="file" class="form-control"
                                                           placeholder="Product Image" name="image">
                                                </div>

                                                <div class="mg-b-pro-edt">
                                                    <select name="category"
                                                            class="form-control pro-edt-select form-control-primary">
                                                        <c:forEach items="${listCate}" var="listCate">
                                                            <option value="${listCate.idCategory}">${listCate.nameCategory}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="mg-b-pro-edt">
                                                    <select name="brand"
                                                            class="form-control pro-edt-select form-control-primary">
                                                        <c:forEach items="${listBrand}" var="listBrand">
                                                            <option value="${listBrand.idB}">${listBrand.nameB}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                                <div class="mg-b-pro-edt">
                                                    <c:forEach items="${listColor}" var="listColor">
                                                        <input type="checkbox" name="color-${listColor.idColor}">
                                                        <span class="name-size" style="color: white;
															  margin-right: 10px;
															  padding: 6px 12px;">${listColor.nameColor}</span>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="text-center custom-pro-edt-ds">
                                                <button type="submit"
                                                        class="btn btn-ctl-bt waves-effect waves-light m-r-10">Save
                                                </button>

                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>