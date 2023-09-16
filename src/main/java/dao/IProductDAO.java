package dao;

import model.ProductModel;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {
    List<ProductModel> getAllProduct();
    ProductModel getProductById(int idProduct);

    List<ProductModel> searchProduct(String input);
    List<ProductModel> filterProduct(int categoryId,String s, String m, String l, String xl, String xxl);

    List<ProductModel> getProductByIdCategory(int idCategory);
    List<ProductModel> getProductByIdBrand(int idBrand);
    void addProduct(String name, int price, String urlImage, int quantity, int category, int brand);
    void deleteProduct(int idProduct);
    void editProduct(int idProduct, String name, int price, String urlImage, int quantity, int category, int brand);

}
