package dao.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
				account = new AccountModel(userId, emailUser, password, phone, address, roleId);
				
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
						results.getInt(6));

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


}
