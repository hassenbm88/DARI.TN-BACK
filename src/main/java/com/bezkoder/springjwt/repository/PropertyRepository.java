package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.Proprety;





@Repository
public interface PropertyRepository extends JpaRepository<Proprety ,Long> {

}