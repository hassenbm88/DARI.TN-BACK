package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.OrderProduct;

//import com.ecommerce.modal.OrderProduct;

public interface OrderProductDao extends JpaRepository<OrderProduct, Long> {

}
