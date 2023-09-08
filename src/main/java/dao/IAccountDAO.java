package dao;

import java.util.List;

import model.AccountModel;

public interface IAccountDAO {
	AccountModel loginAccount(String email, String pass);
	AccountModel checkAccountExist(String email);
	void registerAccount(String email, String password);
	void sendMailResgiter(String email, int code);
	void forgotPassword(String email, int code);
	void changePassword(String email, String password);
	List<AccountModel> getAllAccount();
	void ChangeStatusAccount(String email, String status);

}
