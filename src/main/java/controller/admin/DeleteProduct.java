package controller.admin;

import model.ProductModel;
import service.IProductService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "admin-delete-product", value = "/admin-delete-product")
public class DeleteProduct extends HttpServlet {
    @Inject
    IProductService productService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        productService.deleteProduct(idProduct);
        List<ProductModel> list = productService.getAllProduct();
        request.setAttribute("products", list);
        request.setAttribute("notify","<div class=\"alert alert-success\" role=\"alert\">\n" +
                "  Đã xóa sản phẩm!\n" +
                "</div>");
        request.getRequestDispatcher("/views/admin/product.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
