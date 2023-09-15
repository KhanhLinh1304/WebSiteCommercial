package model;

public class Item {
	private ProductModel product;
	private int quantity;;
	private int price;

	public Item(ProductModel product, int quantity, int price) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
