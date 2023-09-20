package service.impls;

import javax.inject.Inject;

import dao.IOrderDAO;
import model.Cart;
import model.OrderModel;
import service.IOrderService;

public class OrderService implements IOrderService {
	@Inject
	private IOrderDAO orderDAO;

	@Override
	public void AddOrder(Cart cart, OrderModel order) {
		orderDAO.AddOrder(cart, order);
	}

}
