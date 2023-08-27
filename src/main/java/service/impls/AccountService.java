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

}
