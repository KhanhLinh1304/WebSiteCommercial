package service;

import model.AccountModel;

public interface IAccountService {
	AccountModel loginAccount(String email, String pass);
	AccountModel checkAccountExist(String email);
	void registerAccount(String email, String password);
	void sendMailResgiter(String email, int code);
}
