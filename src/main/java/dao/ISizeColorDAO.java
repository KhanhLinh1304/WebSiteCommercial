package dao;

import java.util.List;

import model.ColorModel;
import model.SizeColorModel;
import model.SizeModel;

public interface ISizeColorDAO {
	List<SizeModel> getAllSize();

	List<SizeColorModel> getSizeByIdProduct(int idProduct);

	List<ColorModel> getAllColor();

	void insertProductColorSize(int idColor, int idSize);

	void deleteProductColorSizeByIdProduct(int idProduct);
	void insertProductColorSizeById(int idProduct ,int idColor, int idSize);
	List<SizeModel> getSizeById(int idP);
	List<ColorModel> getColorById(int idP);
}
