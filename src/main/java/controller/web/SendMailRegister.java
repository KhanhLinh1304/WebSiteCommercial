package controller.web;

import model.AccountModel;
import service.IAccountService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "form-send-mail-register", value = "/form-send-mail-register")
public class SendMailRegister extends HttpServlet {
    private static final long serialVersionUID = 1L;
	@Inject
    IAccountService accountService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/web/sendCodeRegister.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = (String) request.getSession().getAttribute("email");
        String password = (String) request.getSession().getAttribute("password");
        int codeEmail = (int) request.getSession().getAttribute("code");
        int code = Integer.parseInt(request.getParameter("code"));
        if (codeEmail != code) {
            request.setAttribute("error","<div class=\"alert alert-danger\" role=\"alert\">\n" +
                    "  Mật OTP không đúng!\n" +
                    "</div>");
            request.getRequestDispatcher("/views/web/s").forward(request,response);
        } else {
            accountService.registerAccount(email,password);
            AccountModel account = accountService.loginAccount(email, password);
            HttpSession session = request.getSession();
            session.setAttribute("account", account);
            response.sendRedirect("web-home");
        }

    }
}
