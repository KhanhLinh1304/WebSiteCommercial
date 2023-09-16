<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
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
	<div class="product-status mg-b-30">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="product-status-wrap">
						<h4>Products List</h4>
						<div class="add-product">
							<a href="product-edit.html">Add Product</a>
						</div>
						<table>
							<tr>
								<th>email</th>
								<th>password</th>
								<th>phone</th>
								<th>address</th>
								<th>role</th>
								<th>status</th>
								
							</tr>
							<c:forEach var="account" items="${accounts}">
							<tr>
								<td>${account.email}</td>
								<td>${account.pass}</td>
								<td>${account.phone}</td>
								<td>${account.address}</td>
								<td>${account.roleId}</td>
								<td>
								 <c:choose>
								   <c:when test="${account.status eq 'enable'}">  
									<a href="admin-lockUser?email=${account.email}&status=${account.status}" style="color: white" data-toggle="tooltip" title="unlock-user"
										class="pd-setting-ed">
										<i class="fa fa-unlock"></i>
									</a>
									</c:when>
									<c:otherwise>
									<a href="admin-lockUser?email=${account.email}&status=${account.status}&roleId=${account.roleId}" style="color: white" data-toggle="tooltip" title="lock-user"
										class="pd-setting-ed">
										<i class="fa fa-lock" aria-hidden="true"></i>
									</a>
									</c:otherwise>
									</c:choose>
								</td>
							</tr>
							</c:forEach>
							
						</table>
						<div class="custom-pagination">
							<ul class="pagination">
								<li class="page-item"><a class="page-link" href="#">Previous</a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item"><a class="page-link" href="#">2</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#">Next</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>