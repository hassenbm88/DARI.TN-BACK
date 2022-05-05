package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.*;
@Repository
public interface ReportRepository extends JpaRepository<Report ,Long> {

	@Query("Select COUNT(*) FROM Report r WHERE r.reason =:reason")
	public int getNumBadLang(@Param("reason") Reason reason);
	
	@Query("Select COUNT(*) FROM Report r WHERE r.reason =:reason")
	public int getNumDamProp(@Param("reason") Reason reason);
	
	@Query("Select COUNT(*) FROM Report ")
	public int getNumAllReport();
}