package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Long>  {

}
