package dao;

import model.ProductModel;

import java.util.List;

public interface IProductDAO {
    List<ProductModel> getAllProduct();
    ProductModel getProductById(int idProduct);
    List<ProductModel> getProductByIdCategory(int idCategory);
    List<ProductModel> getProductByIdBrand(int idBrand);
}
