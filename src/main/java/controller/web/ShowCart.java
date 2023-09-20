package controller.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.AccountModel;
import model.Cart;
import model.Item;

/**
 * Servlet implementation class ShowCart
 */
@WebServlet("/showCart")
public class ShowCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	    AccountModel account = (AccountModel)session.getAttribute("account");
	    if(account != null) {
		Cart cart = (Cart)session.getAttribute("cart");
		List<Item> items = (List<Item>)session.getAttribute("listItem");
		if(cart == null) {
			request.setAttribute("alert", "<div class=\" alert alert-success\" role=\"alert\">\n"+
                                 "không có sản phẩm nào trong giỏ hàng!\n" + "<div>");
			
		}else {
			request.setAttribute("listItem", items);
			request.setAttribute("totalPrice",  cart.getPriceItem());
			request.setAttribute("totalQuantity", cart.getTotalQuantity());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/cart.jsp");
		rd.forward(request, response);
	    }else {
	    	  response.sendRedirect("login");
	    }
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
