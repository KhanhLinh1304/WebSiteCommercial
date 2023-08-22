<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<div class="container-fluid">
	<div class="row">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
			<div class="logo-pro">
				<a href="index.html"><img class="main-logo"
					src="img/logo/logo.png" alt="" /></a>
			</div>
		</div>
	</div>
</div>
<div class="header-advance-area">
	<div class="header-top-area">
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="header-top-wraper">
						<div class="row">
							<div class="col-lg-1 col-md-0 col-sm-1 col-xs-12">
								<div class="menu-switcher-pro">
									<button type="button" id="sidebarCollapse"
										class="btn bar-button-pro header-drl-controller-btn btn-info navbar-btn">
										<i class="icon nalika-menu-task"></i>
									</button>
								</div>
							</div>
							<div class="col-lg-6 col-md-7 col-sm-6 col-xs-12">
								<div class="header-top-menu tabl-d-n hd-search-rp">
									<div class="breadcome-heading">
										<form role="search" class="">
											<input type="text" placeholder="Search..."
												class="form-control"> <a href=""><i
												class="fa fa-search"></i></a>
										</form>
									</div>
								</div>
							</div>
							<div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">
								<div class="header-right-info">
									<ul class="nav navbar-nav mai-top-nav header-right-menu">
										<!-- strat email-->
										<li class="nav-item dropdown"><a href="#"
											data-toggle="dropdown" role="button" aria-expanded="false"
											class="nav-link dropdown-toggle"><i
												class="icon nalika-mail nalika-chat-pro" aria-hidden="true"></i><span
												class="indicator-ms"></span></a>
											<div role="menu"
												class="author-message-top dropdown-menu animated zoomIn">
												<div class="message-single-top">
													<h1>Message</h1>
												</div>
												<ul class="message-menu">
													<li><a href="#">
															<div class="message-img">
																<img src="img/contact/1.jpg" alt="">
															</div>
															<div class="message-content">
																<span class="message-date">16 Sept</span>
																<h2>Advanda Cro</h2>
																<p>Please done this project as soon possible.</p>
															</div>
													</a></li>
												</ul>
												<div class="message-view">
													<a href="#">View All Messages</a>
												</div>
											</div></li>
										<!-- end email-->
										<!-- start notification-->
										<li class="nav-item"><a href="#" data-toggle="dropdown"
											role="button" aria-expanded="false"
											class="nav-link dropdown-toggle"><i
												class="icon nalika-alarm" aria-hidden="true"></i><span
												class="indicator-nt"></span></a>
											<div role="menu"
												class="notification-author dropdown-menu animated zoomIn">
												<div class="notification-single-top">
													<h1>Notifications</h1>
												</div>
												<ul class="notification-menu">
													<li><a href="#">
															<div class="notification-icon">
																<i class="icon nalika-tick" aria-hidden="true"></i>
															</div>
															<div class="notification-content">
																<span class="notification-date">16 Sept</span>
																<h2>Advanda Cro</h2>
																<p>Please done this project as soon possible.</p>
															</div>
													</a></li>
												</ul>
												<div class="notification-view">
													<a href="#">View All Notification</a>
												</div>
											</div></li>
										<!-- end notification-->
										<!-- start account-->
										<li class="nav-item"><a href="#" data-toggle="dropdown"
											role="button" aria-expanded="false"
											class="nav-link dropdown-toggle"> <i
												class="icon nalika-user nalika-user-rounded header-riht-inf"
												aria-hidden="true"></i> <c:if test="${account != null}">
													<span class="admin-name">${account.getEmail()}</span>
												</c:if> <i
												class="icon nalika-down-arrow nalika-angle-dw nalika-icon"></i>
										</a>
											<ul role="menu"
												class="dropdown-header-top author-log dropdown-menu animated zoomIn">
												<li><a href="#"><span
														class="icon nalika-user author-log-ic"></span> My Profile</a>
												</li>
												<li><a href="logout"><span
														class="icon nalika-unlocked author-log-ic"></span> Log Out</a>
												</li>
											</ul></li>
										<!-- end account-->
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Mobile Menu start -->

	<!-- Mobile Menu end -->

</div>