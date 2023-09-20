package model;

import java.sql.Date;

public class OrderModel {
	private int idUser;
	private int totalPrice;
	private int totalQuantity;
	private Date date_order;
	public OrderModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderModel(int idUser, int totalPrice, int totalQuantity,Date date_order) {
		super();
		this.idUser = idUser;
		this.totalPrice = totalPrice;
		this.totalQuantity = totalQuantity;
		this.date_order = date_order;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public Date getDate_order() {
		return date_order;
	}
	public void setDate_order(Date date_order) {
		this.date_order = date_order;
	}
	
	

}
