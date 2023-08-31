<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
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
                            <div class="mb-4">
                                <h3><strong>SIGN UP TO SHOP</strong></h3>
                            </div>
                            <c:if test="${error != null}">
                                <p>${error}</p>
                            </c:if>

                            <form action="register" method="post">
                                <div class="form-group first">
                                    <label for="username">email</label>
                                    <input type="email" class="form-control" name="email">

                                </div>
                                <div class="form-group last mb-4">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" name="password">
                                </div>
                                <div class="form-group last mb-4">
                                    <label for="password">Re-Password</label>
                                    <input type="password" class="form-control" name="re-password">
                                </div>

                                <input id="register" type="submit" value="SIGN UP"
                                       class="btn btn-pill text-white btn-block btn-primary">
                                <span class="d-block text-center my-4 text-muted"><a href="login"> SIGN IN?</a></span>

                            </form>
                        </div>
                    </div>

                </div>

            </div>

        </div>
    </div>
</div>
<script src="<c:url value='/template/web/js/jquery-3.6.1.min.js'/>"/>

</script>
</body>
</html>