package service;

import java.util.List;

import model.ProductModel;

public interface IProductService {
	List<ProductModel> getAllProduct();

	List<ProductModel> searchProduct(String input);
	List<ProductModel> filterProduct(int categoryId ,String s, String m, String l, String xl, String xxl);

	List<ProductModel> getAllProductByIdCategory(int idCategory);
	

}
