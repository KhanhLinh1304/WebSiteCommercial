package dao;

import model.ProductModel;

import java.util.List;

public interface IProductDAO {
    List<ProductModel> getAllProduct();
    ProductModel getProductById(int idProduct);

    List<ProductModel> searchProduct(String input);
    List<ProductModel> filterProduct(String s, String m, String l, String xl, String xxl);

    List<ProductModel> getProductByIdCategory(int idCategory);
    List<ProductModel> getProductByIdBrand(int idBrand);

}
