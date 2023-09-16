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
import model.OrderModel;

public class OrderDAO implements IOrderDAO{
	

	@Override
	public void AddOrder(Cart cart, OrderModel order) {
		String query = "insert into `order`(date_created,status,total_quantity,total_price,user_id) values(?,'chưa thanh toán',?,?,?)";
		try {
			Connection conn = DBConnect.getInstall().get().getConnection();
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

}
