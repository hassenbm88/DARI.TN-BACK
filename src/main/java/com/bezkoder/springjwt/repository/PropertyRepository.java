package com.bezkoder.springjwt.repository;


import java.util.List;
import java.util.Optional;

import com.bezkoder.springjwt.models.Proprety;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface PropertyRepository extends JpaRepository<Proprety,Long> {

    Optional<Proprety> findByNom(String nom);
    @Query("SELECT t FROM Proprety t WHERE t.nom LIKE %:nom%")
    List<Proprety> PropretyByName(@Param("nom") String nom);

}