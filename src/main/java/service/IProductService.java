package service;

import java.util.List;

import model.ProductModel;

public interface IProductService {
	List<ProductModel> getAllProduct();

	List<ProductModel> searchProduct(String input);
	List<ProductModel> filterProduct(int categoryId ,String s, String m, String l, String xl, String xxl);

	List<ProductModel> getAllProductByIdCategory(int idCategory);
	ProductModel getProductById(int idProduct);
	void addProduct(String name, int price, String urlImage, int quantity, int category, int brand);
	void deleteProduct(int idProduct);
	void editProduct(int idProduct, String name, int price, String urlImage, int quantity, int category, int brand);
	
//	void AddProduct(ProductModel product);
	

}
