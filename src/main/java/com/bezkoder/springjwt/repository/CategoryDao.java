package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Category;

//import com.ecommerce.modal.Category;

public interface CategoryDao extends JpaRepository<Category, Long>  {

}
