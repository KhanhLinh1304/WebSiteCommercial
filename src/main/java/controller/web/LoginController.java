package controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AccountModel;
import service.IAccountService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	@Inject
	private IAccountService accountSV;
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		AccountModel account = accountSV.loginAccount(email, pass);
		if(account != null) {
			session.setAttribute("account", account);
			response.sendRedirect("web-home");
		}else {
			 request.setAttribute("notify", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
	                    "  Tài khoản hoặc mật khẩu không đúng!\n" +
	                    "</div>");
	            request.getRequestDispatcher("/views/login.jsp").forward(request,response);
		}
			
	}

}
