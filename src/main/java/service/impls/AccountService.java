package service.impls;

import javax.inject.Inject;

import dao.IAccountDAO;
import model.AccountModel;
import service.IAccountService;

public class AccountService implements IAccountService {
@Inject
private IAccountDAO accountDAO;
	@Override
	public AccountModel loginAccount(String email, String pass) {
		// TODO Auto-generated method stub
		return accountDAO.loginAccount(email, pass);
	}

	@Override
	public AccountModel checkAccountExist(String email) {
		return accountDAO.checkAccountExist(email);
	}

	@Override
	public void registerAccount(String email, String password) {
		accountDAO.registerAccount(email, password);
	}

	@Override
	public void sendMailResgiter(String email, int code) {
		accountDAO.sendMailResgiter(email, code);
	}

}
