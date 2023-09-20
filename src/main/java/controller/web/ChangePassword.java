package controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AccountModel;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AccountModel account = (AccountModel)session.getAttribute("account");
		if(account != null) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/changePass.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("login");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 AccountModel account = (AccountModel)session.getAttribute("account");
		 String pass = request.getParameter("xacnhanMK");
		 if(pass.equals(account.getPass())){
			 response.sendRedirect("NewPassWord");
		 }else {
			 request.setAttribute("notify", "<div class=\"alert alert-danger\">\n"+
		                          "Mật Khẩu không đúng!\n Vui lòng Nhập Lại"+"</div>");
			  request.getRequestDispatcher("/views/web/changePass.jsp").forward(request, response);
		 }
		
		}

}
