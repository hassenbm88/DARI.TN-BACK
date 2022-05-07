package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartDao extends JpaRepository<Cart, Long>{
   Optional<Cart> findByName(String name);
}
