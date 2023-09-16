package model;

public class ColorModel {
	private int idColor;
	private String nameColor;
	public ColorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ColorModel(int idColor, String nameColor) {
		super();
		this.idColor = idColor;
		this.nameColor = nameColor;
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

	@Override
	public String toString() {
		return "ColorModel{" +
				"idColor=" + idColor +
				", nameColor='" + nameColor + '\'' +
				'}';
	}
}
