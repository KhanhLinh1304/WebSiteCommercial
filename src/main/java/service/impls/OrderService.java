package service.impls;

import java.util.List;

import javax.inject.Inject;

import dao.IOrderDAO;
import model.Cart;
import model.OrderDetailModel;
import model.OrderModel;
import service.IOrderService;

public class OrderService implements IOrderService {
	@Inject
	private IOrderDAO orderDAO;

	@Override
	public void AddOrder(Cart cart, OrderModel order) {
		orderDAO.AddOrder(cart, order);
	}

	@Override
	public List<OrderModel> getAllOrder() {
		// TODO Auto-generated method stub
		return orderDAO.getAllOrder();
	}

	@Override
	public List<OrderDetailModel> getDetailOrderById(int idOrder) {
		// TODO Auto-generated method stub
		return orderDAO.getDetailOrderById(idOrder);
	}

	@Override
	public void DeleteOrder(int orderId) {
		orderDAO.DeleteOrder(orderId);
		
	}

}
