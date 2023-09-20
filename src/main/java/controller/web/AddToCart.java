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
import model.ProductModel;
import service.IProductService;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    private IProductService productSV;
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		  AccountModel account = (AccountModel)session.getAttribute("account");
		  if(account != null) {
		  Cart cart = new Cart();
		  Object o = session.getAttribute("cart");
		  if(o != null) {
			  cart = (Cart) o;
		  }else {
			   cart = new Cart();
		  }
		  int id = Integer.parseInt(request.getParameter("idProduct"));
		  int quantity = Integer.parseInt(request.getParameter("quantity"));
		  ProductModel product = productSV.getProductById(id);
		  int price = product.getPrice(); 
		  Item item = new Item(product, quantity,price);
		  cart.AddItem(item);
		  List<Item> list = cart.getItems();
		  session.setAttribute("listItem", list);
	      session.setAttribute("size", list.size());
		  session.setAttribute("cart", cart);
		  RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		  rd.forward(request, response);
			response.sendRedirect("web-home");
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
