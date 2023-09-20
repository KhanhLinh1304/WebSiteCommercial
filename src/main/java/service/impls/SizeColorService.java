package service.impls;

import java.util.List;

import javax.inject.Inject;

import dao.ISizeColorDAO;
import model.ColorModel;
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

	@Override
	public List<ColorModel> getAllColor() {
		return sizeColorDAO.getAllColor();
	}

	@Override
	public void insertProductColorSize(int idColor, int idSize) {
		sizeColorDAO.insertProductColorSize(idColor, idSize);
	}

	@Override
	public void deleteProductColorSizeByIdProduct(int idProduct) {
		sizeColorDAO.deleteProductColorSizeByIdProduct(idProduct);
	}

	@Override
	public void insertProductColorSizeById(int idProduct, int idColor, int idSize) {
		sizeColorDAO.insertProductColorSizeById(idProduct, idColor, idSize);

	}

	@Override
	public List<SizeModel> getSizeById(int idP) {
		return sizeColorDAO.getSizeById(idP);
	}

	@Override
	public List<ColorModel> getColorById(int idP) {
		return sizeColorDAO.getColorById(idP);
	}


}
