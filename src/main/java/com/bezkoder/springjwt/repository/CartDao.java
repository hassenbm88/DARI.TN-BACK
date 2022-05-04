package com.bezkoder.springjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Cart;

//import com.ecommerce.modal.Cart;

public interface CartDao extends JpaRepository<Cart, Long>{
   Optional<Cart> findByName(String name);
}
