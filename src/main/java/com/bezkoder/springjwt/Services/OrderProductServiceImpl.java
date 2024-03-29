package com.bezkoder.springjwt.Services;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.bezkoder.springjwt.repository.OrderProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.interfaces.OrderProductService;
import com.bezkoder.springjwt.models.OrderProduct;

//import com.ecommerce.dao.OrderProductDao;
//import com.ecommerce.modal.OrderProduct;
//import com.ecommerce.service.OrderProductService;

@Transactional
@Component
public class OrderProductServiceImpl implements OrderProductService {
	
	@Autowired
	private OrderProductDao orderProductDao;

	@Override
	public OrderProduct create(
			@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct) {
		return this.orderProductDao.save(orderProduct);
	}

}
