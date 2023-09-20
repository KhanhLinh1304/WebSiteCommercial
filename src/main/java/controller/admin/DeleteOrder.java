package controller.admin;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OrderModel;
import service.IOrderService;

/**
 * Servlet implementation class DeleteOrder
 */
@WebServlet("/admin-delete-order")
public class DeleteOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    private IOrderService orderSV;
    public DeleteOrder() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idOrder"));
		orderSV.DeleteOrder(id);
	    List<OrderModel> order = orderSV.getAllOrder();
	    request.setAttribute("order", order);
	    request.setAttribute("notify","<div class=\"alert alert-success\" role=\"alert\">\n" +
                "  Đã xóa đơn hàng!\n" +
                "</div>");
        request.getRequestDispatcher("/views/admin/order.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
