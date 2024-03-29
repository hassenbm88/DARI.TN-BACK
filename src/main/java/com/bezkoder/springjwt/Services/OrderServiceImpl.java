package com.bezkoder.springjwt.Services;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.bezkoder.springjwt.repository.OrderDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.interfaces.OrderService;
import com.bezkoder.springjwt.models.Order;

//import com.ecommerce.dao.OrderDao;
//import com.ecommerce.modal.Order;
//import com.ecommerce.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao;
	public OrderServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public @NotNull Iterable<Order> getAllOrders() {
		return this.orderDao.findAll();
	}

	@Override
	public Order create(@NotNull(message = "The order cannot be null.") @Valid Order order) {
		return this.orderDao.save(order);
	}

	@Override
	public void update(@NotNull(message = "The order cannot be null.") @Valid Order order) {
		this.orderDao.save(order);
		
	}

}
