<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>

	<div class="container bootstrap snippets bootdey">
		<div class="row">
			<div class="profile-nav col-md-3">
				<div class="panel">
					<h1 style="text-align: center">Quản Lí Hồ Sơ Của Bạn</h1>
					<ul class="nav nav-pills nav-stacked">
						<li class="active"><a href="#"> <i class="fa fa-user"></i>
								Hồ Sơ Cá Nhân
						</a></li>
						<li><a href="#"> <i class="fa fa-list-alt"></i> Đơn Hàng</a></li>
						<li><a href="#"> <i class="fa fa-edit"></i> Thay Đổi Mật Khẩu
						</a></li>
					</ul>
				</div>
			</div>
			<div class="profile-info col-md-9">
				<div class="panel">
					
					<div class="panel-body bio-graph-info">
						<h1></h1>
						<div class="row">
							<form>
								<div class="form-group">
									<label for="exampleFormControlInput1">Email address</label> <input
										type="email" class="form-control"
										id="exampleFormControlInput1" placeholder="name@example.com">
								</div>
								<div class="form-group">
									<label for="exampleFormControlInput2">Password</label> <input
										type="password" class="form-control"
										id="exampleFormControlInput2" >
										</div>
								
								<div class="form-group">
									<label for="exampleFormControlInput3">Phone</label> <input
										type="text" class="form-control"
										id="exampleFormControlInput3">
								</div>
								<div class="form-group">
									<label for="exampleFormControlInput">Địa Chỉ</label> <input
										type="text" class="form-control"
										id="exampleFormControlInput" >
								</div>

								<button style="width: 200px;"type="submit" class="btn btn-dark">Sửa</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>