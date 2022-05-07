package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order, Long> {

}
