package controller.web;

import model.AccountModel;
import service.IAccountService;

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


/**
 * Servlet implementation class UserController
 */
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @Inject
	IAccountService accountService;
    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/user.jsp");
		HttpSession session = request.getSession();
		AccountModel accountModel = (AccountModel) session.getAttribute("account");
		request.setAttribute("information", accountModel);
		if (accountModel==null) {
			response.sendRedirect("/login");
		} else {
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String address = request.getParameter("address");
		String password =  request.getParameter("password");
		accountService.updateInformation(email,phone,address);
		HttpSession session = request.getSession();
		AccountModel accountModel = accountService.loginAccount(email, password);
		session.setAttribute("account", accountModel);
		request.setAttribute("information", accountModel);
		request.setAttribute("notify", "<div class=\"alert alert-success\" role=\"alert\">\n" +
				"  Thay đổi thông tin thành công!\n" +
				"</div>");
		request.getRequestDispatcher("/views/web/user.jsp").forward(request,response);
	}

}
