package dao.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IAccountDAO;
import database.DBConnect;
import model.AccountModel;

public class AccountDAO implements IAccountDAO{
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet results = null;

	@Override
	public AccountModel loginAccount(String email, String pass) {
		AccountModel account = new AccountModel();
		String query = "select * from user where email = ? and password = ?";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, pass);
			results = preparedStatement.executeQuery();
			while(results.next()) {
				int userId = results.getInt(1);
				String emailUser = results.getString(2);
				String password = results.getString(3);
				String phone = results.getString(4);
				String address = results.getString(5);
				int roleId = results.getInt(6);
				account = new AccountModel(userId, emailUser, password, phone, address, roleId);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return account;
	}

}
