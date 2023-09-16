package controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cart;



/**
 * Servlet implementation class RemoveCart
 */
@WebServlet("/removeCart")
public class RemoveCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCart() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idItem = Integer.parseInt(request.getParameter("idItem"));
		HttpSession session = request.getSession();
		Cart cart = (Cart)session.getAttribute("cart");
		cart.DeleteItem(idItem);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/cart.jsp");
		rd.forward(request, response);
		response.sendRedirect("showCart");
	}

	

}
