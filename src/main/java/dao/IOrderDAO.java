package dao;

import model.Cart;
import model.OrderModel;

public interface IOrderDAO {
	void AddOrder(Cart cart, OrderModel order);

}
