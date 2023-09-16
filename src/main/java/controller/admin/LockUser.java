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
 * Servlet implementation class Demo
 */
@WebServlet("/admin-lockUser")
public class LockUser extends HttpServlet {
	@Inject
	private IAccountDAO accountDAO;
	private static final long serialVersionUID = 1L;

    public LockUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String status = request.getParameter("status");
		int role = Integer.parseInt(request.getParameter("roleId"));
		if(role == 1) {
			if(status.equals("enable")) {
				accountDAO.ChangeStatusAccount(email, "disable");
				response.sendRedirect("admin-account");
			}else {
				accountDAO.ChangeStatusAccount(email, "enable");
				response.sendRedirect("admin-account");
			}
			
		}else {
			request.setAttribute("notify", "<div class=\"alert alert-danger\"> \n Bạn Không Thể Khóa User thuộc admin! </div>");
			RequestDispatcher rd = request.getRequestDispatcher("views/admin/user.jsp");
			rd.forward(request, response);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
