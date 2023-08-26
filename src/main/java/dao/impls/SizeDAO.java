package dao.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ISizeDAO;
import database.DBConnect;
import model.SizeModel;

public class SizeDAO implements ISizeDAO {
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
	
}
