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
    	ProductModel product = new ProductModel();
    	String query = "select * from product where product_id = ?";
    	try {
			conn = DBConnect.getInstall().get().getConnection();
			preparedStatement = conn.prepareStatement(query);
			preparedStatement.setInt(1, idProduct);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int id = resultSet.getInt(1);
	               String name =  resultSet.getString(2);
	               int price = resultSet.getInt(3);
	               String image = resultSet.getString(4);
	               int quantity = resultSet.getInt(5);
	               int categoryId = resultSet.getInt(6);
	               int brandId = resultSet.getInt(7);
	                product = new ProductModel(id,name,price,image,quantity,categoryId,brandId);
	               
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return product;
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
    public List<ProductModel> filterProduct(int categoryId,String s, String m, String l, String xl, String xxl) {
        List<ProductModel> list = new ArrayList<>();
        String sql = "SELECT product.*\n" +
                "FROM product_color_size JOIN product ON product.product_id = product_color_size.product_id JOIN size ON product_color_size.size_id = size.size_id\n" +
                "WHERE product.category_id = ? AND (size_name = ? OR size_name = ? OR size_name = ? OR size_name = ? OR size_name = ?)\n" +
                "GROUP BY product.product_id\n";
        try {
            conn = DBConnect.getInstall().get().getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,categoryId);
            preparedStatement.setString(2, s);
            preparedStatement.setString(3, m);
            preparedStatement.setString(4, l);
            preparedStatement.setString(5, xl);
            preparedStatement.setString(6, xxl);
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

    @Override
    public void addProduct(String name, int price, String urlImage, int quantity, int category, int brand) {
        String query = "INSERT INTO product (name, price, image, quantity, category_id, brand_id) VALUES (?,?,?,?,?,?)";
        try {
            conn = DBConnect.getInstall().get().getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2, price);
            preparedStatement.setString(3, urlImage);
            preparedStatement.setInt(4,quantity);
            preparedStatement.setInt(5,category);
            preparedStatement.setInt(6,brand);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteProduct(int idProduct) {
        String disableForeign = "SET FOREIGN_KEY_CHECKS=0;";
        String query = "DELETE product_color_size, product\n" +
                "FROM product_color_size LEFT JOIN product ON product_color_size.product_id = product.product_id\n" +
                "WHERE product.product_id = ?;";
        String enableForeign =  "SET FOREIGN_KEY_CHECKS=1;";


        try {
            conn = DBConnect.getInstall().get().getConnection();
            preparedStatement = conn.prepareStatement(disableForeign);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, idProduct);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            preparedStatement = conn.prepareStatement(enableForeign);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editProduct(int idProduct, String name, int price, String urlImage, int quantity, int category, int brand) {
        String query = "UPDATE product\n" +
                "SET `name` = ?, price= ?, image =?, quantity =?,category_id =?, brand_id =?\n" +
                "WHERE product_id = ?";
        try {
            conn = DBConnect.getInstall().get().getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, price);
            preparedStatement.setString(3, urlImage);
            preparedStatement.setInt(4, quantity);
            preparedStatement.setInt(5,category);
            preparedStatement.setInt(6,brand);
            preparedStatement.setInt(7, idProduct);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
