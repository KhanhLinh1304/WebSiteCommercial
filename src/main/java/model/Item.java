package model;

public class Item {
	private ProductModel product;
	private int quantity;
	private int size;
	private int color;
	private int price;

	public Item(ProductModel product, int quantity, int size, int color, int price) {
		this.product = product;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item{" +
				"product=" + product +
				", quantity=" + quantity +
				", size=" + size +
				", color=" + color +
				", price=" + price +
				'}';
	}
}
