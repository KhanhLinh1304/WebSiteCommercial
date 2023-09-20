package dao.impls;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.IOrderDAO;
import database.DBConnect;
import model.Cart;
import model.Item;
import model.OrderDetailModel;
import model.OrderModel;

public class OrderDAO implements IOrderDAO{
	Connection conn = null;
	PreparedStatement preparedStatement4 = null;
	ResultSet resultSet4 = null;
    
	@Override
	public void AddOrder(Cart cart, OrderModel order) {
		String query = "insert into `order`(date_created,status,total_quantity,total_price,user_id) values(?,'chưa thanh toán',?,?,?)";
		try {
			 conn = DBConnect.getInstall().get().getConnection();
			PreparedStatement prepStatement = conn.prepareStatement(query);
			Date currentDate = new Date();
			prepStatement.setDate(1, new java.sql.Date(currentDate.getTime()));
			prepStatement.setInt(2, order.getTotalQuantity());
			prepStatement.setInt(3, order.getTotalPrice());
			prepStatement.setInt(4, order.getIdUser());
			prepStatement.executeUpdate();
			String query2="select `order_id` from `order` order by `order_id` desc limit 1";
			PreparedStatement preStatement2 = conn.prepareStatement(query2);
			ResultSet result = preStatement2.executeQuery();
			if(result.next()) {
				int id = result.getInt(1);
				for(Item item: cart.getItems()) {
					String query3 = "insert into order_item(price, quantity, order_id, product_id) value(?,?,?,?)";
					PreparedStatement preStatement3 = conn.prepareStatement(query3);
					preStatement3.setInt(1, item.getQuantity() * item.getProduct().getPrice());
					preStatement3.setInt(2,item.getQuantity());
					preStatement3.setInt(3, id);
					preStatement3.setInt(4, item.getProduct().getIdP());
					preStatement3.executeUpdate();
					String updateProductQuantityQuery = "UPDATE product SET quantity = quantity - ? WHERE product_id = ?";
					PreparedStatement updateQuantityStatement = conn.prepareStatement(updateProductQuantityQuery);
					updateQuantityStatement.setInt(1, item.getQuantity());
					updateQuantityStatement.setInt(2, item.getProduct().getIdP());
					updateQuantityStatement.executeUpdate();
				}

			}


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




	}

	@Override
	public List<OrderModel> getAllOrder() {
		List<OrderModel> orders = new ArrayList<>();
		String query = "SELECT * FROM `order`";
		try {
			Connection conn = DBConnect.getInstall().get().getConnection();
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int idOrder = resultSet.getInt("order_id");
				int idUser = resultSet.getInt("user_id");
				int totalPrice = resultSet.getInt("total_price");
				int totalQuantity = resultSet.getInt("total_quantity");
				Date date = resultSet.getDate("date_created");
				String status = resultSet.getString("status");
				OrderModel order = new OrderModel(idOrder,idUser, totalPrice, totalQuantity, date, status);
				orders.add(order);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return orders;
	}

	@Override
	public List<OrderDetailModel> getDetailOrderById(int idOrder) {
		List<OrderDetailModel> detailOrders = new ArrayList<>();
		String query = "SELECT * FROM order_item";
		try {
			 conn = DBConnect.getInstall().get().getConnection();
			 preparedStatement4 = conn.prepareStatement(query);
			 resultSet4 = preparedStatement4.executeQuery();
			while(resultSet4.next()) {
				int orderId = resultSet4.getInt("order_id");
				int totalPrice = resultSet4.getInt("price");
				int totalQuantity = resultSet4.getInt("quantity");
				int productId = resultSet4.getInt("product_id");
				OrderDetailModel detail = new OrderDetailModel(totalPrice, totalQuantity, orderId, productId);
				detailOrders.add(detail);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return detailOrders;
	}

	@Override
	public void DeleteOrder(int orderId) {
		 String disableForeign = "SET FOREIGN_KEY_CHECKS=0;";
		String query = "delete `order`, `order_item`  from `order` left join `order_item` on `order`.order_id = order_item.order_id where `order`.order_id = ?";
		 String enableForeign =  "SET FOREIGN_KEY_CHECKS=1;";
		try {
			Connection conn = DBConnect.getInstall().get().getConnection();
			 preparedStatement4 = conn.prepareStatement(disableForeign);
			 preparedStatement4.executeUpdate();
			 preparedStatement4.close();
			
		     preparedStatement4 = conn.prepareStatement(query);
			 preparedStatement4.setInt(1, orderId);
			 preparedStatement4.executeUpdate();
			 preparedStatement4.close();
			 
			 preparedStatement4 = conn.prepareStatement(enableForeign);
			 preparedStatement4.executeUpdate();
			 preparedStatement4.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
