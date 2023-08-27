package service;

import model.AccountModel;

public interface IAccountService {
	AccountModel loginAccount(String email, String pass);
}
