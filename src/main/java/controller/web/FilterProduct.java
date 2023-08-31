package controller.web;

import model.ProductModel;
import service.IProductService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

@WebServlet(name = "filterProduct", value = "/filterProduct")
public class FilterProduct extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
    IProductService productService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = request.getParameter("data");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        List<String> size = Arrays.asList(data.split("&"));
        String s=null,m=null,l=null,xl=null,xxl=null;
        for (int i = 0; i < size.size(); i++) {
            if (size.get(i).equals("all=on")) {
                s="s";m="m";l="l";xl="xl";xxl="xxl";
            }
            if (size.get(i).equals("s=on"))
                s="s";
            if (size.get(i).equals("m=on"))
                m="m";
            if (size.get(i).equals("l=on"))
                l="l";
            if (size.get(i).equals("xl=on"))
                xl="xl";
            if (size.get(i).equals("xxl=on"))
                xxl="xxl";
        }
        List<ProductModel> list = productService.filterProduct( categoryId,s,m,l,xl,xxl);
//        request.setAttribute("products", list);
//        request.getRequestDispatcher("/views/ajax/listProduct.jsp").forward(request,response);
        for (int i = 0; i < list.size(); i++) {
            response.getWriter().println("<li\n" +
                    "            class=\"gategory-product-list col-lg-3 col-md-4 col-sm-6 col-xs-12\">\n" +
                    "        <div class=\"single-product-item\">\n" +
                    "            <div class=\"product-image\">\n" +
                    "                <a href=\"single-product.html\"><img\n" +
                    "                        src=\""+list.get(i).getUrlImg()+"\" alt=\"product-image\" /></a> <a\n" +
                    "                    href=\"#\" class=\"new-mark-box\">new</a>\n" +
                    "                <div class=\"overlay-content\">\n" +
                    "                    <ul>\n" +
                    "                        <li><a href=\"#\" title=\"Quick view\"><i\n" +
                    "                                class=\"fa fa-search\"></i></a></li>\n" +
                    "                        <li><a href=\"#\" title=\"Quick view\"><i\n" +
                    "                                class=\"fa fa-shopping-cart\"></i></a></li>\n" +
                    "                        <li><a href=\"#\" title=\"Quick view\"><i\n" +
                    "                                class=\"fa fa-retweet\"></i></a></li>\n" +
                    "                        <li><a href=\"#\" title=\"Quick view\"><i\n" +
                    "                                class=\"fa fa-heart-o\"></i></a></li>\n" +
                    "                    </ul>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "            <div class=\"product-info\">\n" +
                    "                <div class=\"customar-comments-box\">\n" +
                    "                    <div class=\"rating-box\">\n" +
                    "                        <i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n" +
                    "                            class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n" +
                    "                            class=\"fa fa-star-half-empty\"></i>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"review-box\">\n" +
                    "                        <span>1 Review(s)</span>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "                <a href=\"single-product.html\">"+list.get(i).getName()+"</a>\n" +
                    "                <div class=\"price-box\">\n" +
                    "                    <span class=\"price\">"+list.get(i).getPrice()+"</span>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </div>\n" +
                    "    </li>");
        }
    }
}
