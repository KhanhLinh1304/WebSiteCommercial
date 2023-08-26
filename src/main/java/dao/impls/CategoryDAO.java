package dao.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ICategoryDAO;
import database.DBConnect;
import model.CategoryModel;

public class CategoryDAO implements ICategoryDAO{
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet results = null;
	@Override
	public List<CategoryModel> getCategory() {
		List<CategoryModel> categories = new ArrayList<>();
		String query = "select * from category ";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			results = preparedStatement.executeQuery();
			while(results.next()) {
				int idC = results.getInt(1);
				String nameC = results.getString(2);
				CategoryModel category = new CategoryModel(idC, nameC);
				categories.add(category);
			}
			return categories;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
	}
	

}
