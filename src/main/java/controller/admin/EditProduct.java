package controller.admin;

import model.*;
import service.IBrandService;
import service.ICategoryService;
import service.IProductService;
import service.ISizeColorService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "admin-edit-product", value = "/admin-edit-product")
@MultipartConfig
public class EditProduct extends HttpServlet {
    @Inject
    ISizeColorService sizeColorService;
    @Inject
    ICategoryService categoryService;
    @Inject
    IBrandService brandService;
    @Inject
    IProductService productService;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SizeModel> listSize = sizeColorService.getAllSize();
        List<ColorModel> listColor = sizeColorService.getAllColor();
        List<CategoryModel> listCate = categoryService.getCategory();
        List<BrandModel> listBrand = brandService.getAllBrand();
        int idProduct = Integer.parseInt(request.getParameter("idProduct"));
        ProductModel productModel = productService.getProductById(idProduct);
        List<SizeColorModel> sizeColorModels = sizeColorService.getSizeByIdProduct(idProduct);
        request.setAttribute("product", productModel);
        request.setAttribute("sizeColor", sizeColorModels);
        request.setAttribute("listSize", listSize);
        request.setAttribute("listColor", listColor);
        request.setAttribute("listCate", listCate);
        request.setAttribute("listBrand", listBrand);
        request.getRequestDispatcher("/views/admin/editProduct.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Integer> size = new ArrayList<>();
        ArrayList<Integer> color = new ArrayList<>();
        for (int i = 0; i < sizeColorService.getAllSize().size(); i++) {
            if (request.getParameter("size-"+sizeColorService.getAllSize().get(i).getIdSize()) != null){
                size.add(sizeColorService.getAllSize().get(i).getIdSize());
            }
        }
        for (int i = 0; i < sizeColorService.getAllColor().size(); i++) {
            if (request.getParameter("color-"+sizeColorService.getAllColor().get(i).getIdColor()) != null) {
                color.add(sizeColorService.getAllColor().get(i).getIdColor());
            }
        }
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        // Lấy file part
        Part file = request.getPart("image");
        String oldImage = request.getParameter("imageFirst");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int category = Integer.parseInt(request.getParameter("category"));
        int brand = Integer.parseInt(request.getParameter("brand"));
        if (!file.getSubmittedFileName().equals("")) {
            String appPath = request.getServletContext().getRealPath("/image");
            String urlImage = file.getSubmittedFileName();
            // Tạo đường dẫn đến thư mục lưu trữ tệp
            String destinationPath = appPath + File.separator + urlImage;
            File destinationFile = new File(destinationPath);
            try {
                InputStream fileContent = file.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = fileContent.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
                fileContent.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            productService.editProduct(id,name,price,"/image/"+urlImage,quantity,category,brand);
        } else {
            productService.editProduct(id,name,price,oldImage,quantity,category,brand);
        }
        sizeColorService.deleteProductColorSizeByIdProduct(id);
        for (int i = 0; i < color.size(); i++) {
            for (int j = 0; j < size.size(); j++) {
                sizeColorService.insertProductColorSizeById(id,color.get(i),size.get(j));
            }
        }
        response.sendRedirect("/admin-product");

    }
}
