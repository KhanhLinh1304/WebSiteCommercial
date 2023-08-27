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

import dao.ISizeColorDAO;
import model.ProductModel;
import model.SizeColorModel;
import service.IProductService;
import service.ISizeColorService;

/**
 * Servlet implementation class DetailProductController
 */
@WebServlet("/detailProduct")
public class DetailProductController extends HttpServlet {
	@Inject
	private IProductService productSV;
	@Inject
	private ISizeColorService scService;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("idProduct"));
		ProductModel product = productSV.getProductById(productId);
		List<SizeColorModel> lists = scService.getSizeByIdProduct(productId);
		request.setAttribute("lists", lists);
		request.setAttribute("product", product);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/detail.jsp");
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
