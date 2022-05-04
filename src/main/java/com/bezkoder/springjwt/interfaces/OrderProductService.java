package com.bezkoder.springjwt.interfaces;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.bezkoder.springjwt.models.OrderProduct;

//import com.ecommerce.modal.OrderProduct;

@Validated
public interface OrderProductService {
  OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
}
