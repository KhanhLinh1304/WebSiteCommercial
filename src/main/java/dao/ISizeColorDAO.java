package dao;

import java.util.List;

import model.SizeColorModel;
import model.SizeModel;

public interface ISizeColorDAO {
	List<SizeModel> getAllSize();
	List<SizeColorModel> getSizeByIdProduct(int idProduct);
	

}
