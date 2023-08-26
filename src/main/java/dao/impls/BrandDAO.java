package dao.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.IBrandDAO;
import database.DBConnect;
import model.BrandModel;
import model.CategoryModel;

public class BrandDAO implements IBrandDAO {
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet results = null;

	@Override
	public List<BrandModel> getAllBrand() {
		List<BrandModel> brands = new ArrayList<>();
		String query = "select * from brand";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			results = preparedStatement.executeQuery();
			while(results.next()) {
				int idB = results.getInt(1);
				String nameB = results.getString(2);
				BrandModel brand = new BrandModel(idB, nameB);
				brands.add(brand);
			}
			return brands;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return brands;
	}

}
