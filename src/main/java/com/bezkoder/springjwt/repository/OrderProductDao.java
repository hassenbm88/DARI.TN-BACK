package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductDao extends JpaRepository<OrderProduct, Long> {

}
