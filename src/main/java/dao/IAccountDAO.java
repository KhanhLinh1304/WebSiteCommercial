package dao;

import model.AccountModel;

public interface IAccountDAO {
	AccountModel loginAccount(String email, String pass);

}
