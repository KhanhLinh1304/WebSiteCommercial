package service.impls;

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
}
