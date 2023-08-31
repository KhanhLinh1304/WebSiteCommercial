package controller.web;

import service.IAccountService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "form-change-password-forgot", value = "/form-change-password-forgot")
public class ChangePasswordForgot extends HttpServlet {
    @Inject
    IAccountService accountService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/web/changePasswordForgot.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password");
        String re_password = request.getParameter("re-password");
        String email = (String) request.getSession().getAttribute("email-forgot");
        if (!password.equals(re_password)) {
            request.setAttribute("error", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
                    "  Các mật khẩu không khớp!\n" +
                    "</div>");
            request.getRequestDispatcher("/views/web/changePasswordForgot.jsp").forward(request, response);
        } else {
            accountService.changePassword(email, password);
            request.setAttribute("error", "<div class=\"alert alert-success\" role=\"alert\">\n" +
                    "  Đổi mật khẩu thành công!\n" +
                    "</div>");
            request.getRequestDispatcher("/views/web/changePasswordForgot.jsp").forward(request,response);
        }

    }
}
