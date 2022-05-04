
package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bezkoder.springjwt.models.Tag;

//import com.ecommerce.modal.Tag;

public interface TagDao extends JpaRepository<Tag, Long>{
	
	//requete de recupértion
	
    @Query("SELECT p FROM Tag p WHERE p.name LIKE :n")
    List<Tag> findByName(@Param("n") String name);
}
