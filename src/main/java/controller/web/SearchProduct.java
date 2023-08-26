package controller.web;

import model.ProductModel;
import service.IProductService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "searchProduct", value = "/searchProduct")
public class SearchProduct extends HttpServlet {
    @Inject
    private IProductService productService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("input");
        List<ProductModel> list = productService.searchProduct(input);
        request.setAttribute("list", list);
        request.getRequestDispatcher("/views/web/search.jsp").forward(request,response);
    }
}
