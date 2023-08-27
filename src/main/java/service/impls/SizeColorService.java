package service.impls;

import java.util.List;

import javax.inject.Inject;

import dao.ISizeColorDAO;
import model.SizeColorModel;
import model.SizeModel;
import service.ISizeColorService;

public class SizeColorService implements ISizeColorService {
	@Inject
	private ISizeColorDAO sizeColorDAO;
	@Override
	public List<SizeModel> getAllSize() {
	
		return sizeColorDAO.getAllSize();
	}
	@Override
	public List<SizeColorModel> getSizeByIdProduct(int idProduct) {
		// TODO Auto-generated method stub
		return sizeColorDAO.getSizeByIdProduct(idProduct);
	}

}
