package dao.impls;

import dao.IProductDAO;
import database.DBConnect;
import model.ProductModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    @Override
    public List<ProductModel> getAllProduct() {
        List<ProductModel> products = new ArrayList<>();
        String sql ="select * from product";
        try {
            conn = DBConnect.getInstall().get().getConnection();
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
               String name =  resultSet.getString("name");
               int price = resultSet.getInt("price");
               String image = resultSet.getString("image");
               int quantity = resultSet.getInt("quantity");
               int categoryId = resultSet.getInt("category_id");
               int brandId = resultSet.getInt("brand_id");
               ProductModel product = new ProductModel(name,price,image,quantity,categoryId,brandId);
               products.add(product);
            }
            return products;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return products;
    }
    public static void main(String[] args) {
    	ProductDAO dao = new ProductDAO();
		   List<ProductModel> product = dao.getAllProduct();
		   for(ProductModel pro: product ) {
			   System.out.println(pro.getUrlImg());
		   }
	}

    @Override
    public ProductModel getProductById(int idProduct) {
        return null;
    }
}
