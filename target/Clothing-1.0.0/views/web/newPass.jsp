<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>

	<div class="container bootstrap snippets bootdey">
		<div class="row">
		<c:if test="${success != null }"><p>${success}</p></c:if>
		<c:if test="${notify != null }"><p>${notify}</p></c:if>
			<div class="profile-nav col-md-3">
				<div class="panel">
					<h1 style="text-align: center; margin-top: 20px">Quản Lí Hồ
						Sơ Của Bạn</h1>
					<ul class="nav nav-pills nav-stacked">
						<li ><a href="user"> <i class="fa fa-user"></i>
								Hồ Sơ Cá Nhân
						</a></li>
						<li><a href="#"> <i class="fa fa-list-alt"></i> Đơn Hàng
						</a></li>
						<li class="active"><a href="ChangePassword"> <i class="fa fa-edit"></i>
								Thay Đổi Mật Khẩu
						</a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-1"></div>
			<div class="profile-info col-md-6">
				<div class="panel">
					<div class="panel-body bio-graph-info">
						<h1></h1>
						<div class="row">
						
							<form action="NewPassWord" method="post">
								<div class="form-group">
									<label style="text-align: center; margin-top: 20px"
										for="exampleFormControlInput2" style="">Nhập Mật Khẩu mới</label>
									<input style="margin-top: 20px" type="password" name="matkhaumoi"
										class="form-control" id="exampleFormControlInput2">
								</div>
								<div class="form-group">
									<label style="text-align: center; margin-top: 20px"
										for="exampleFormControlInput2">Xác Nhận Lại Mật Khẩu</label>
									<input style="margin-top: 20px" type="password"  name="xacnhanMKMoi"
										class="form-control" id="exampleFormControlInput2">
								</div>
								<button style="width: 200px;" type="submit" class="btn btn-dark">Thay Đổi</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>