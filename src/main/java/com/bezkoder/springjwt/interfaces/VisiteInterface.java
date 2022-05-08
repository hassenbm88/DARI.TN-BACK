package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.Visite;





public interface VisiteInterface {
	List<Visite> retrieveAllVisite();
	Visite addVisite (Visite v);
	Visite updateVisite (Visite v);
	Visite retrieveVisite (Long id);
	void removeVisite (Long id);
	void addAndassignVisitetoProperty(Visite v, String nom ) ;
	
	

}
	




