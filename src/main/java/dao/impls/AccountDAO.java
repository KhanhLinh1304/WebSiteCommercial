package dao.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dao.IAccountDAO;
import database.DBConnect;
import model.AccountModel;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class AccountDAO implements IAccountDAO{
	Connection conn = null;
	PreparedStatement preparedStatement = null;
	ResultSet results = null;

	@Override
	public AccountModel loginAccount(String email, String pass) {
		AccountModel account = null;
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
				String status = results.getString(7);
				account = new AccountModel(userId, emailUser, password, phone, address, roleId,status);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return account;
	}

	@Override
	public AccountModel checkAccountExist(String email) {
		String query = "select * from user where email = ?";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, email);
			results = preparedStatement.executeQuery();
			while(results.next()) {
				return new AccountModel(results.getInt(1),
						results.getString(2),
						results.getString(3),
						results.getString(4),
						results.getString(5),
						results.getInt(6), 
						results.getString(7));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void registerAccount(String email, String password) {
		String query = "INSERT INTO user (email, password, phone, address, roles_id) VALUES\n" +
				"(?, ?, 0000, '', 2)";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void sendMailResgiter(String email, int code) {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.name", "Blog Web");

		String subject = "Mã OTP đăng ký Fashion Clothing";
		String text = "<h1 style=\"padding: 0; font-size: 25px;color: #2dd100;font-family:sans-serif\">Mã đăng ký Fashion Clothing</h1>" +
				"<p style=\"padding: 0;font-size: 14px;color: #000000;font-family:sans-serif\">Mã OTP của bạn, hãy nhập OTP: <strong style=\"font-size: 18px; color: #2dd100; font-family:sans-serif\">" + code + "</strong></p>" +
				"<p style=\"padding: 0;font-size: 14px;color: #000000;font-family:sans-serif\">Cảm ơn bạn,</p><p style=\"padding: 0;font-size: 14px;font-family:sans-serif\">Fashion Clothing.</p>";
		String account = "hthclone01@gmail.com";
		String pass = "dphhbiseazpxircy";

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(account,pass);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(account));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setHeader("Content-Type", "text/html; charset=UTF-8");
			message.setSubject(subject);
			message.setContent(text, "text/html; charset=UTF-8");
			Transport.send(message);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void forgotPassword(String email, int code) {
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.name", "Blog Web");

		String subject = "Quên mật khẩu Fashion Clothing";
		String text = "<h1 style=\"padding: 0; font-size: 25px;color: #2dd100;font-family:sans-serif\">Mã OTP quên mật khẩu</h1>" +
				"<p style=\"padding: 0;font-size: 14px;color: #000000;font-family:sans-serif\">Mã OTP của bạn, hãy nhập OTP: <strong style=\"font-size: 18px; color: #2dd100; font-family:sans-serif\">" + code + "</strong></p>" +
				"<p style=\"padding: 0;font-size: 14px;color: #000000;font-family:sans-serif\">Cảm ơn bạn,</p><p style=\"padding: 0;font-size: 14px;font-family:sans-serif\">Fashion Clothing.</p>";
		String account = "hthclone01@gmail.com";
		String pass = "dphhbiseazpxircy";

		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(account,pass);
			}
		});
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(account));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
			message.setHeader("Content-Type", "text/html; charset=UTF-8");
			message.setSubject(subject);
			message.setContent(text, "text/html; charset=UTF-8");
			Transport.send(message);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void changePassword(String email, String password) {
		String query = "UPDATE user SET password = ? WHERE email = ?";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, password);
			preparedStatement.setString(2, email);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateInformation(String email, int phone, String address) {
		String query = "UPDATE `user` SET phone = ?, address = ? WHERE email = ?";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, phone);
			preparedStatement.setString(2, address);
			preparedStatement.setString(3, email);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<AccountModel> getAllAccount() {
		List<AccountModel> accounts = new ArrayList<>();
		String query = "select * from user";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			results = preparedStatement.executeQuery();
			while(results.next()) {
				int userId = results.getInt(1);
				String emailUser = results.getString(2);
				String password = results.getString(3);
				String phone = results.getString(4);
				String address = results.getString(5);
				int roleId = results.getInt(6);
				String status = results.getString(7);
				AccountModel account = new AccountModel(userId, emailUser, password, phone, address, roleId, status);
				accounts.add(account);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accounts;
	}

	@Override
	public void ChangeStatusAccount(String email, String status) {
		String query = "update user set status = ? where email = ? ";
		try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1, status);
			preparedStatement.setString(2, email);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
