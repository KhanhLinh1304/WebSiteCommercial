package model;

public class SizeColorModel {
	private int idSize;
	private String nameSize;
	private int idColor;
	private String nameColor;
	private int idProduct;
	public SizeColorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SizeColorModel(int idSize, String nameSize, int idColor, String nameColor, int idProduct) {
		super();
		this.idSize = idSize;
		this.nameSize = nameSize;
		this.idColor = idColor;
		this.nameColor = nameColor;
		this.idProduct = idProduct;
	}
	public int getIdSize() {
		return idSize;
	}
	public void setIdSize(int idSize) {
		this.idSize = idSize;
	}
	public String getNameSize() {
		return nameSize;
	}
	public void setNameSize(String nameSize) {
		this.nameSize = nameSize;
	}
	public int getIdColor() {
		return idColor;
	}
	public void setIdColor(int idColor) {
		this.idColor = idColor;
	}
	public String getNameColor() {
		return nameColor;
	}
	public void setNameColor(String nameColor) {
		this.nameColor = nameColor;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	

}
