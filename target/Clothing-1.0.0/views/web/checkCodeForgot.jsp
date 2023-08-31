<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="content">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6 contents">
                <div class="row justify-content-center">
                    <div class="col-md-12">
                        <div class="form-block">
                            <div class="mb-4">
                                <h3><strong>OTP quên mật khẩu</strong></h3>
                            </div>
                            <c:if test="${error != null}">
                                <p>${error}</p>
                            </c:if>
                            <form action="form-check-code-forgot" method="post">
                                <div class="form-group first">
                                    <label>Nhập mã OTP của bạn</label>
                                    <input type="int" class="form-control" name="code">
                                </div>
                                <input type="submit" value="XÁC NHẬN"
                                       class="btn btn-pill text-white btn-block btn-primary">
                                <span class="d-block text-center my-4 text-muted"><a
                                        href="/login"> Quay lại</a></span>
                            </form>
                        </div>
                    </div>

                </div>

            </div>
        </div>
    </div>
</div>
<script src="<c:url value='/template/web/js/jquery-3.6.1.min.js'/>"/>

</body>
</html>
