package controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.IAccountDAO;
import model.AccountModel;

/**
 * Servlet implementation class UserController
 */
@WebServlet(name = "admin-account", urlPatterns = { "/admin-account" })
public class UserController extends HttpServlet {
	@Inject 
	private IAccountDAO accountDAO;
	private static final long serialVersionUID = 1L;
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   HttpSession session = request.getSession();
		   AccountModel account = (AccountModel)session.getAttribute("account");
		   if(account != null) {
			   List<AccountModel> accounts = accountDAO.getAllAccount();
			      request.setAttribute("accounts", accounts);
		          RequestDispatcher rd = request.getRequestDispatcher("/views/admin/user.jsp");
		          rd.forward(request, response);
		   }else {
			   response.sendRedirect("login");
		   }
		     
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
