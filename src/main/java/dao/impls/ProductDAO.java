package dao.impls;

import dao.IProductDAO;
import database.DBConnect;
import model.CategoryModel;
import model.ProductModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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
               int id = resultSet.getInt(1);
               String name =  resultSet.getString(2);
               int price = resultSet.getInt(3);
               String image = resultSet.getString(4);
               int quantity = resultSet.getInt(5);
               int categoryId = resultSet.getInt(6);
               int brandId = resultSet.getInt(7);
               ProductModel product = new ProductModel(id,name,price,image,quantity,categoryId,brandId);
               products.add(product);
            }
            return products;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public ProductModel getProductById(int idProduct) {
    	
        return null;
    }


    @Override
    public List<ProductModel> searchProduct(String input) {
        List<ProductModel> list = new ArrayList<>();
        String sql = "SELECT *\n" +
                "FROM product\n" +
                "WHERE product.`name` like ?";
        try {
            conn = DBConnect.getInstall().get().getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, "%"+input+"%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new ProductModel(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public List<ProductModel> filterProduct(String s, String m, String l, String xl, String xxl) {
        List<ProductModel> list = new ArrayList<>();
        String sql = "SELECT product.*\n" +
                "FROM product_color_size JOIN product ON product.product_id = product_color_size.product_id JOIN size ON product_color_size.size_id = size.size_id\n" +
                "WHERE size_name = ? OR size_name = ? OR size_name = ? OR size_name = ? OR size_name = ?\n" +
                "GROUP BY product.product_id\n";
        try {
            conn = DBConnect.getInstall().get().getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, s);
            preparedStatement.setString(2, m);
            preparedStatement.setString(3, l);
            preparedStatement.setString(4, xl);
            preparedStatement.setString(5, xxl);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                list.add(new ProductModel(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getInt(6),
                        resultSet.getInt(7)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

	@Override
	public  List<ProductModel> getProductByIdCategory(int idCategory) {
		 List<ProductModel> products = new ArrayList<>();
		 String sql = "select * from product where category_id = ?";
		 try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(sql);
		    preparedStatement.setInt(1, idCategory);
			resultSet = preparedStatement.executeQuery();
			 while (resultSet.next()){
	               int id = resultSet.getInt(1);
	               String name =  resultSet.getString(2);
	               int price = resultSet.getInt(3);
	               String image = resultSet.getString(4);
	               int quantity = resultSet.getInt(5);
	               int categoryId = resultSet.getInt(6);
	               int brandId = resultSet.getInt(7);
	               ProductModel product = new ProductModel(id,name,price,image,quantity,categoryId,brandId);
	               products.add(product);
	            }
	            return products;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return products;
	}
	

	@Override
	public List<ProductModel> getProductByIdBrand(int idBrand) {
		List<ProductModel> products = new ArrayList<>();
		 String sql = "select * from product where brand_id = ?";
		 try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(sql);
		    preparedStatement.setInt(1, idBrand);
			resultSet = preparedStatement.executeQuery();
			 while (resultSet.next()){
	               int id = resultSet.getInt(1);
	               String name =  resultSet.getString(2);
	               int price = resultSet.getInt(3);
	               String image = resultSet.getString(4);
	               int quantity = resultSet.getInt(5);
	               int categoryId = resultSet.getInt(6);
	               int brandId = resultSet.getInt(7);
	               ProductModel product = new ProductModel(id,name,price,image,quantity,categoryId,brandId);
	               products.add(product);
	            }
	            return products;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return products;
	}
	 public static void main(String[] args) {
	    	CategoryDAO dao = new CategoryDAO();
			   List<CategoryModel> categories = dao.getCategory();
			   for(CategoryModel cat: categories ) {
				   System.out.println(cat.getNameCategory());
			   }
		}


}
