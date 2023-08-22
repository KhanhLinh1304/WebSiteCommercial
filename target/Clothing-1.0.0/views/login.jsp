<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="content">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 contents">
					<div class="row justify-content-center">
						<div class="col-md-12">
							<div class="form-block">
								<c:if test="${notify != null }">
									<p>${notify}</p>
								</c:if>
								<div class="mb-4">
									<h3>
										<strong>LOGIN TO SHOP</strong>
									</h3>
								</div>
								<form action="login" method="post">
									<div class="form-group first">
										<label for="username">email</label> <input type="email"
											class="form-control" name="email">

									</div>
									<div class="form-group last mb-4">
										<label for="password">Password</label> <input type="password"
											class="form-control" name="password">

									</div>

									<div class="d-flex mb-5 align-items-center">
										<label class="control control--checkbox mb-0"><span
											class="caption">Remember me</span> <input type="checkbox"
											checked="checked" /> </label> <span class="ml-auto"><a
											href="#" class="forgot-pass">Forgot Password</a></span>
									</div>

									<input type="submit" value="Log In"
										class="btn btn-pill text-white btn-block btn-primary">

									<span class="d-block text-center my-4 text-muted"> or
										sign in with </span>

									<div class="social-login text-center">
										<a href="#" class="facebook"> <span
											class="icon-facebook mr-3"></span>
										</a> <a href="#" class="twitter"> <span
											class="icon-twitter mr-3"></span>
										</a> <a href="#" class="google"> <span
											class="icon-google mr-3"></span>
										</a>
									</div>
									<span class="d-block text-center my-4 text-muted"><a
										href="register"> SIGN UP?</a></span>

								</form>
							</div>
						</div>
					</div>

				</div>

			</div>
		</div>
	</div>
</body>
</html>