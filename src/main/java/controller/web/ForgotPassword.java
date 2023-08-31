package controller.web;

import model.AccountModel;
import service.IAccountService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "form-forgot-password", value = "/form-forgot-password")
public class ForgotPassword extends HttpServlet {
    @Inject
    IAccountService accountService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/web/forgotPassword.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        AccountModel accountModel = accountService.checkAccountExist(email);
        int code = new Random().nextInt(8001) + 1000;
        if (accountModel == null) {
            request.setAttribute("error", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
                    "  Email không tồn tại!\n" +
                    "</div>");
            request.getRequestDispatcher("/views/web/forgotPassword.jsp").forward(request, response);
        }else  {
            accountService.forgotPassword(email, code);
            HttpSession session = request.getSession();
            session.setAttribute("email-forgot", email);
            session.setAttribute("code-forgot", code);
            response.sendRedirect("/form-check-code-forgot");
        }

    }
}
