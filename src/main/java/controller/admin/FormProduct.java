package controller.admin;

import model.ProductModel;
import service.IProductService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "admin-product", value = "/admin-product")
public class FormProduct extends HttpServlet {
    @Inject
    IProductService productService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductModel> list = productService.getAllProduct();
        request.setAttribute("products", list);
        request.getRequestDispatcher("/views/admin/product.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
