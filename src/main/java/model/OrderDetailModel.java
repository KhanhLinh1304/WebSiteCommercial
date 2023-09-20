package model;

public class OrderDetailModel {
	private int price;
	private int quantity;
	private int orderId;
	private int productId;
	public OrderDetailModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDetailModel(int price, int quantity, int orderId, int productId) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.orderId = orderId;
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	

}
