package com.bezkoder.springjwt.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bezkoder.springjwt.models.Agent;


@Repository
public interface AgentRepository extends JpaRepository <Agent, Long > {
}
