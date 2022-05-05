package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.*;

public interface IAideservice {
	List<Aide> retrieveAllAide();
	Aide addAide (Aide o);
	Aide updateAide (Aide o);
	Aide retrieveAide (Long id);
	void removeAide (Long id);
	void updateAidee(Aide a, long id);
	List<Aide> getAllAideClasse();
}
