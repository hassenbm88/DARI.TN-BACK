package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.*;
@Repository
public interface AideRepository extends JpaRepository<Aide ,Long> {
	@Query("Select a FROM Aide a ORDER BY a.monatnt DESC")
	public List<Aide> getAllAideClasseByMontant();
}