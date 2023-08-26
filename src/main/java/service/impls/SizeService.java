package service.impls;

import java.util.List;

import javax.inject.Inject;

import dao.ISizeDAO;
import model.SizeModel;
import service.ISizeService;

public class SizeService implements ISizeService {
	@Inject
	private ISizeDAO sizeDAO;
	@Override
	public List<SizeModel> getAllSize() {
	
		return sizeDAO.getAllSize();
	}

}
