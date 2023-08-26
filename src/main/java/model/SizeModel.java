package model;

public class SizeModel {
	private int idSize;
	private String nameSize;
	public SizeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SizeModel(int idSize, String nameSize) {
		super();
		this.idSize = idSize;
		this.nameSize = nameSize;
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
	

}
