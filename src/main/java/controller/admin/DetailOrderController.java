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

import model.OrderDetailModel;
import service.IOrderService;

/**
 * Servlet implementation class DetailOrderController
 */
@WebServlet("/admin-detail-order")
public class DetailOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IOrderService orderSV;
    public DetailOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idOrder"));
		List<OrderDetailModel> orders = orderSV.getDetailOrderById(id);
		request.setAttribute("order", orders);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/detailOrder.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
