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

import model.BrandModel;
import model.ProductModel;
import service.IBrandService;
import service.IProductService;


/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/CategoryController")
public class CategoryController extends HttpServlet {
	@Inject
	private IProductService productSv;
	@Inject
	private IBrandService brandSV;

	private static final long serialVersionUID = 1L;
  
    public CategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("categoryId"));
		List<ProductModel> products = productSv.getAllProductByIdCategory(id);
		List<BrandModel> brands = brandSV.getAllBrand();
		request.setAttribute("products", products);
		request.setAttribute("brands", brands);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/category.jsp");
		rd.forward(request, response);
	         
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
