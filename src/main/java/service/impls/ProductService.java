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
	public List<ProductModel> filterProduct(String s, String m, String l, String xl, String xxl) {
		return product.filterProduct(s,m,l,xl,xxl);
	}

}
