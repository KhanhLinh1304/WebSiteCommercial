package model;

public class AccountModel {
	private int userId;
	private String email;
	private String pass;
	private String phone;
	private String address;
	private int roleId;
	public AccountModel() {}
	public AccountModel(int userId, String email, String pass, String phone, String address, int roleId) {
		super();
		this.userId = userId;
		this.email = email;
		this.pass = pass;
		this.phone = phone;
		this.address = address;
		this.roleId = roleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	

}
