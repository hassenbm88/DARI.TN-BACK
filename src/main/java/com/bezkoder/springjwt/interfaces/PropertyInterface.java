package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.Proprety;




public interface PropertyInterface {


	//Proprety addProprety (Proprety p);
	List<Proprety> retrieveAllProprety();
	Proprety updateProprety (Proprety p);
	Proprety retrieveProprety (Long idProprety);
	void removeProprety (Long idProprety);
	Proprety addProprety(Proprety propretys);
	//List<Proprety> getByNom(String nom);
	List<Proprety>retrievePropretysByName(String nom);


}
