package service.impls;

import java.util.List;

import javax.inject.Inject;

import dao.IBrandDAO;
import model.BrandModel;
import service.IBrandService;

public class BrandService implements IBrandService {
@Inject
private IBrandDAO brandDAO;
	@Override
	public List<BrandModel> getAllBrand() {
		// TODO Auto-generated method stub
		return brandDAO.getAllBrand();
	}

}
