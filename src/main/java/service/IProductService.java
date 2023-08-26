package service;

import java.util.List;

import model.ProductModel;

public interface IProductService {
	List<ProductModel> getAllProduct();
	List<ProductModel> getAllProductByIdCategory(int idCategory);
	
}
