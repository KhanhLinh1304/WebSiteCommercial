package controller.web;

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

import model.AccountModel;
import model.Cart;
import model.Item;
import model.OrderModel;
import service.IOrderService;

/**
 * Servlet implementation class OrderControler
 */
@WebServlet("/checkout")
public class OrderControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IOrderService orderSV;
    public OrderControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AccountModel account = (AccountModel)session.getAttribute("account");
		String name = account.getEmail();
		int id = account.getUserId();
		List<Item> items = (List<Item>)session.getAttribute("listItem");
		Cart cart = (Cart)session.getAttribute("cart");
		request.setAttribute("listItem",items);
		request.setAttribute("idUser", id);
		request.setAttribute("email", name);
		request.setAttribute("totalQuantity", cart.getTotalQuantity());
		request.setAttribute("totalPrice",cart.getPriceItem());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/checkout.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		AccountModel account = (AccountModel)session.getAttribute("account");
		
		Cart cart = (Cart)session.getAttribute("cart");
		if(account != null && cart!=null && !cart.getItems().isEmpty()) {
			String totalPrice = request.getParameter("totalPriceCart");
			String cleantTotalPrice = totalPrice.replace(",", "");
			int totalP = Integer.parseInt(cleantTotalPrice);
			int id = account.getUserId();
			int totalQuantity = Integer.parseInt(request.getParameter("totalQuantity"));	
			OrderModel order = new OrderModel(id, totalP, totalQuantity, null);
			orderSV.AddOrder(cart, order);
			session.removeAttribute("cart");
			session.setAttribute("size", 0);
            request.setAttribute("orderMessage", "<div> Order placed successfully! <a href=\"web-home\" style=\"color:blue\">Tiếp Tục Mua Sắm</a></div");
            RequestDispatcher rd = request.getRequestDispatcher("views/web/checkout.jsp");
            rd.forward(request, response);
         //   response.sendRedirect("web-home");
		}else {
          //  request.setAttribute("orderMessageer", "Your cart is empty.");
			 response.sendRedirect("login");
        }
		
	}

}
