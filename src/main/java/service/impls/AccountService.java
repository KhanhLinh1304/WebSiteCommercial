package service.impls;

import java.util.List;

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

	@Override
	public void forgotPassword(String email, int code) {
		accountDAO.forgotPassword(email, code);
	}

	@Override
	public void changePassword(String email, String password) {
		accountDAO.changePassword(email,password);
	}

	@Override
	public List<AccountModel> getAllAccount() {
		// TODO Auto-generated method stub
		return accountDAO.getAllAccount();
	}

	@Override
	public void ChangeStatusAccount(String email, String status) {
		accountDAO.ChangeStatusAccount(email, status);
		
	}

}
