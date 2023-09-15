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
                                <h3><strong>NHẬP OTP ĐĂNG KÝ</strong></h3>
                            </div>
                            <c:if test="${error != null}">
                                <p>${error}</p>
                            </c:if>

                            <form action="/form-send-mail-register" method="post">
                                <div class="form-group first">
                                    <label for="">Nhập code ở đây</label>
                                    <input type="number" class="form-control" name="code">
                                </div>
                                <input type="submit" value="XÁC NHẬN"
                                       class="btn btn-pill text-white btn-block btn-primary">
                                <span class="d-block text-center my-4 text-muted"><a
                                        href="register"> Quay lại</a></span>
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
