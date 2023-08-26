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

import model.ProductModel;
import service.IBrandService;
import service.IProductService;

/**
 * Servlet implementation class BrandCategory
 */
@WebServlet("/BrandController")
public class BrandController extends HttpServlet {
	@Inject
	private IProductService productSv;
	private static final long serialVersionUID = 1L;
       
    public BrandController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("brandId"));
		List<ProductModel> products = productSv.getAllProductByIdCategory(id);
		request.setAttribute("products", products);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/brand.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
