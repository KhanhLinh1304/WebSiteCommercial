package service.impls;

import java.util.List;

import javax.inject.Inject;

import dao.ICategoryDAO;
import model.CategoryModel;
import service.ICategoryService;
public class CategoryService implements ICategoryService {
	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> getCategory() {
		// TODO Auto-generated method stub
		return categoryDao.getCategory();
	}

}
