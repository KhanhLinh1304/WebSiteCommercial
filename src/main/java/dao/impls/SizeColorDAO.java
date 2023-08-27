package dao.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ISizeColorDAO;
import database.DBConnect;
import model.SizeColorModel;
import model.SizeModel;

public class SizeColorDAO implements ISizeColorDAO {
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet results = null;
	@Override
	public List<SizeModel> getAllSize() {
		List<SizeModel> sizes = new ArrayList<SizeModel>();
		String query = "select * from size";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			results = preparedStatement.executeQuery();
			while(results.next()) {
				int idSize = results.getInt(1);
				String nameSize = results.getString(2);
				SizeModel size = new SizeModel(idSize, nameSize);
				sizes.add(size);
			}
			return sizes;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sizes;
	}
	@Override
	public List<SizeColorModel> getSizeByIdProduct(int idProduct) {
		List<SizeColorModel> models = new ArrayList<>();
		String query = "select product_color_size.*, size.size_name AS nameSize, color.color_name AS colorName from product_color_size inner join size on product_color_size.size_id = size.size_id inner join color on product_color_size.color_id = color.color_id where product_id =?";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, idProduct);
			results = preparedStatement.executeQuery();
			while(results.next()) {
				int idSize = results.getInt("size_id");
				String nameSize = results.getString("nameSize");
				int idColor = results.getInt("color_id");
				String nameColor = results.getString("colorName");
				int productId = results.getInt("product_id");
				SizeColorModel model = new SizeColorModel(idSize, nameSize, idColor, nameColor, productId);
			    models.add(model);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return models;
	}
	
}
