package service.impls;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import dao.IProductDAO;
import model.ProductModel;
import service.IProductService;

public class ProductService implements IProductService {
	@Inject
	private IProductDAO product;

	@Override
	public List<ProductModel> getAllProduct() {
		// TODO Auto-generated method stub
		return product.getAllProduct();
	}

	@Override

	public List<ProductModel> searchProduct(String input) {
		return product.searchProduct(input);
	}

	@Override
	public List<ProductModel> filterProduct(int categoryId ,String s, String m, String l, String xl, String xxl) {
		return product.filterProduct(categoryId,s,m,l,xl,xxl);
	}


	public List<ProductModel> getAllProductByIdCategory(int idCategory) {
		
		return product.getProductByIdCategory(idCategory);
	}
	@Override
	public ProductModel getProductById(int idProduct) {
		// TODO Auto-generated method stub
		return product.getProductById(idProduct);
	}

	@Override
	public void addProduct(String name, int price, String urlImage, int quantity, int category, int brand) {
		product.addProduct(name, price, urlImage, quantity, category, brand);
	}

	@Override
	public void deleteProduct(int idProduct) {
		product.deleteProduct(idProduct);
	}

	@Override
	public void editProduct(int idProduct, String name, int price, String urlImage, int quantity, int category, int brand) {
		product.editProduct(idProduct, name, price, urlImage, quantity, category, brand);
	}

}
