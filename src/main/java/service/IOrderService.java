package service;

import java.util.List;

import model.Cart;
import model.OrderDetailModel;
import model.OrderModel;

public interface  IOrderService {
	void AddOrder(Cart cart, OrderModel order);
	List<OrderModel> getAllOrder();
	List<OrderDetailModel> getDetailOrderById(int idOrder);
	void DeleteOrder(int orderId);
}
