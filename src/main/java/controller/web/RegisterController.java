package controller.web;

import model.AccountModel;
import service.IAccountService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "register", value = "/register")
public class RegisterController extends HttpServlet {
    @Inject
    IAccountService accountService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/views/signup.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String re_password = request.getParameter("re-password");
        int code = new Random().nextInt(8001) + 1000;
        AccountModel accountModel = accountService.checkAccountExist(email);
        if (!password.equals(re_password)) {
            request.setAttribute("error", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
                    "  Mật khẩu không trùng nhau!\n" +
                    "</div>");
            request.getRequestDispatcher("/views/signup.jsp").forward(request,response);
        } else if (accountModel != null){
            request.setAttribute("error", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
                    "  Tài khoản đã tồn tại!\n" +
                    "</div>");
            request.getRequestDispatcher("/views/signup.jsp").forward(request,response);
        } else {
//            accountService.registerAccount(email,password);
//            AccountModel account = accountService.loginAccount(email, password);
            accountService.sendMailResgiter(email, code);
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
            session.setAttribute("password", password);
            session.setAttribute("code", code);
            response.sendRedirect("/form-send-mail-register");
        }
    }
}
