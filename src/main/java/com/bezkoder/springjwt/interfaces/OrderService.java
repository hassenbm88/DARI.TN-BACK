package com.bezkoder.springjwt.interfaces;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import com.bezkoder.springjwt.models.Order;

//import com.ecommerce.modal.Order;

@Validated
@Repository
public interface OrderService {
	@NotNull
	Iterable<Order> getAllOrders();
	
	Order create(@NotNull(message = "The order cannot be null.") @Valid Order order);
	void update (@NotNull(message = "The order cannot be null.") @Valid Order order);
}
