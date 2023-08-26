package model;

public class ProductModel {
	private int idP;
    private String name;
    private int price;
    private String urlImg;
    private int quantity;
    private int idCategory;
    private int idBrand;
    public ProductModel(){}
    public ProductModel(int idP, String nameP, int price, String urlImg, int quantity, int idC, int idBrand){
        this.idP = idP;
        this.name = nameP;
        this.price = price;
        this.urlImg = urlImg;
        this.quantity = quantity;
        this.idCategory = idC;
        this.idBrand = idBrand;

    }
    
    public int getIdP() {
		return idP;
	}
	public void setIdP(int idP) {
		this.idP = idP;
	}
	public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(int idBrand) {
        this.idBrand = idBrand;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", urlImg='" + urlImg + '\'' +
                ", quantity=" + quantity +
                ", idCategory=" + idCategory +
                ", idBrand=" + idBrand +
                "}\n";
    }
}
