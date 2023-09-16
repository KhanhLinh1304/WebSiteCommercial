package controller.web;

import model.Cart;
import model.Item;
import model.ProductModel;
import service.IProductService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "increase-cart", value = "/increase-cart")
public class IncreaseCart extends HttpServlet {
    @Inject
    private IProductService productSV;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idP = Integer.parseInt(request.getParameter("idP"));
        Cart cart = (Cart) request.getSession().getAttribute("cart");
        for (int i = 0; i < cart.getItems().size(); i++) {
            if (cart.getItems().get(i) == cart.getItemById(idP)) {
                cart.getItems().get(i).setQuantity(cart.getItems().get(i).getQuantity() +1);
            }
        }
        List<Item> list = cart.getItems();
        HttpSession session = request.getSession();
        session.setAttribute("listItem", list);
        session.setAttribute("size", list.size());
        session.setAttribute("cart", cart);
        request.getRequestDispatcher("/views/web/cart.jsp").forward(request,response);
        response.sendRedirect("/showCart");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
