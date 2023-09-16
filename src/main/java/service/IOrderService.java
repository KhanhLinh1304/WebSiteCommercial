package service;

import model.Cart;
import model.OrderModel;

public interface  IOrderService {
	void AddOrder(Cart cart, OrderModel order);

}
