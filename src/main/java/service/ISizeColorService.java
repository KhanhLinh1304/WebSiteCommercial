package service;

import java.util.List;

import model.SizeColorModel;
import model.SizeModel;

public interface ISizeColorService {
 List<SizeModel> getAllSize();
 List<SizeColorModel> getSizeByIdProduct(int idProduct);
}
