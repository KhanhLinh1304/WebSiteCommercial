package controller.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "form-check-code-forgot", value = "/form-check-code-forgot")
public class CheckCodeForgot extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/web/checkCodeForgot.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int code = Integer.parseInt(request.getParameter("code"));
        int code_forgot = (int) request.getSession().getAttribute("code-forgot");
        if (code != code_forgot) {
            request.setAttribute("error","<div class=\"alert alert-danger\" role=\"alert\">\n" +
                    "  Mật OTP không đúng!\n" +
                    "</div>");
            request.getRequestDispatcher("/views/web/checkCodeForgot.jsp").forward(request,response);
        } else {
            response.sendRedirect("/form-change-password-forgot");
        }
    }
}
