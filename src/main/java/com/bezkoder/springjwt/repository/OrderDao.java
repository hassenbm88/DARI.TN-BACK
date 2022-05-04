package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Order;

//import com.ecommerce.modal.Order;

public interface OrderDao extends JpaRepository<Order, Long> {

}
