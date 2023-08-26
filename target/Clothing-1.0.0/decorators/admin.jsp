<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value='/template/admin/img/favicon.ico'/>"/>
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/bootstrap.min.css'/>"/>
    <!-- nalika Icon CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/nalika-icon.css'/>"/>
    <!-- owl.carousel CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/owl.carousel.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/owl.theme.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/owl.transitions.css'/>"/>
    <!-- animate CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/animate.css'/>"/>
    <!-- normalize CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/normalize.css'/>"/>
    <!-- meanmenu icon CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/meanmenu.min.css'/>"/>
    <!-- main CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/main.css'/>"/>
    <!-- morrisjs CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/morrisjs/morris.css'/>"/>
    <!-- mCustomScrollbar CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/scrollbar/jquery.mCustomScrollbar.min.css'/>"/>
    <!-- metisMenu CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/metisMenu/metisMenu.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/metisMenu/metisMenu-vertical.css'/>"/>
    <!-- calendar CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/calendar/fullcalendar.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/template/admin/css/calendar/fullcalendar.print.min.css'/>"/>
    <!-- style CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/style.css'/>"/>
    <!-- responsive CSS -->
    <link rel="stylesheet" href="<c:url value='/template/admin/css/responsive.css'/>"/>
    <!-- modernizr JS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="<c:url value='/template/admin/js/vendor/modernizr-2.8.3.min.js'/>"></script>
</head>
<body>
     <%@ include file="/common/admin/leftBar.jsp" %>
        <div class="all-content-wrapper">
            <%@ include file="/common/admin/header.jsp" %>
            <div id="content">
                <dec:body />
            </div>
        </div>

    <!-- jquery -->
    <script src="<c:url value='/template/admin/js/vendor/jquery-1.12.4.min.js'/>"></script>
    <script src="<c:url value='/template/admin/js/bootstrap.min.js'/>"></script>
    <!-- wow JS -->
    <script src="<c:url value='/template/admin/js/wow.min.js'/>"></script>
    <!-- price-slider JS -->
    <script src="<c:url value='/template/admin/js/jquery-price-slider.js'/>"></script>
    <!-- meanmenu JS -->
    <script src="<c:url value='/template/admin/js/jquery.meanmenu.js'/>"></script>
    <!-- owl.carousel JS -->
    <script src="<c:url value='/template/admin/js/owl.carousel.min.js'/>"></script>
    <!-- sticky JS -->
    <script src="<c:url value='/template/admin/js/jquery.sticky.js'/>"></script>
    <!-- scrollUp JS -->
    <script src="<c:url value='/template/admin/js/jquery.scrollUp.min.js'/>"></script>
    <!-- mCustomScrollbar JS -->
    <script src="<c:url value='/template/admin/js/scrollbar/jquery.mCustomScrollbar.concat.min.js'/>"></script>
    <script src="<c:url value='/template/admin/js/scrollbar/mCustomScrollbar-active.js'/>"></script>
    <!-- metisMenu JS -->
    <script src="<c:url value='/template/admin/js/metisMenu/metisMenu.min.js'/>"></script>
    <script src="<c:url value='/template/admin/js/metisMenu/metisMenu-active.js'/>"></script>
    <!-- sparkline JS -->
    <script src="<c:url value='/template/admin/js/sparkline/jquery.sparkline.min.js'/>"></script>
    <script src="<c:url value='/template/admin/js/sparkline/jquery.charts-sparkline.js'/>"></script>
    <!-- calendar JS -->
    <script src="<c:url value='/template/admin/js/calendar/moment.min.js'/>"></script>
    <script src="<c:url value='/template/admin/js/calendar/fullcalendar.min.js'/>"></script>
    <script src="<c:url value='/template/admin/js/calendar/fullcalendar-active.js'/>"></script>
    <!-- float JS -->
    <script src="<c:url value='/template/admin/js/flot/jquery.flot.js'/>"></script>
    <script src="<c:url value='/template/admin/js/flot/jquery.flot.resize.js'/>"></script>
    <script src="<c:url value='/template/admin/js/flot/curvedLines.js'/>"></script>
    <script src="<c:url value='/template/admin/js/flot/flot-active.js'/>"></script>
    <!-- plugins JS -->
    <script src="<c:url value='/template/admin/js/plugins.js'/>"></script>
    <!-- main JS -->
    <script src="<c:url value='/template/admin/js/main.js'/>"></script>
</body>
</html>
