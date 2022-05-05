package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.Proprety;




public interface PropertyInterface {
	
	//Proprety addProprety (Proprety p);
	List<Proprety> retrieveAllProprety();
	Proprety updateProprety (Proprety p);
	Proprety retrieveProprety (Long idProprety);
	void removeProprety (Long idProprety);
	void addAndassignVisitetoProperty(Proprety p ,Long idProprety, Long idVisite);
	Proprety addProprety(Proprety propretys);

}
