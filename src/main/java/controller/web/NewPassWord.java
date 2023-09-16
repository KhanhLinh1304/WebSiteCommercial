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

@WebServlet("/NewPassWord")
public class NewPassWord extends HttpServlet {
	@Inject
	private IAccountService accountSV;
	private static final long serialVersionUID = 1L;
    public NewPassWord() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AccountModel account = (AccountModel)session.getAttribute("account");
		if(account != null) {
			RequestDispatcher rd = request.getRequestDispatcher("/views/web/newPass.jsp");
			rd.forward(request, response);
		}else {
			response.sendRedirect("login");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 AccountModel account = (AccountModel)session.getAttribute("account");
		 String pass = request.getParameter("matkhaumoi");
		 String xnPass = request.getParameter("xacnhanMKMoi");
		 if(pass.equals(xnPass)) {
			 if(pass.equals(account.getPass())) {
				 request.setAttribute("notify", "<div class=\"alert alert-danger\">Mật Khẩu Trùng Với Mât Khẩu Hiện Tại! Vui Lòng Nhập Mật Khẩu Khác Mật Khẩu Hiện Tại</div>");
				 request.getRequestDispatcher("/views/web/newPass.jsp").forward(request, response);		 
			 }else {
				 accountSV.changePassword(account.getEmail(), xnPass);
				 request.setAttribute("success", "Thay Đổi Mật Khẩu Thành Công!");
				 request.getRequestDispatcher("/views/web/newPass.jsp").forward(request, response);
			 }
		 }
		 else {
			 request.setAttribute("notify", "<div class=\"alert alert-danger\">Mật Khẩu Không Khớp!\n Vui Lòng Nhập Lại</div>");
			 request.getRequestDispatcher("/views/web/newPass.jsp").forward(request, response);
		 }
		
	}

}
