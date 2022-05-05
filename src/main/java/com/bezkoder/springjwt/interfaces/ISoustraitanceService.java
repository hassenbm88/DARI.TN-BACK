package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.*;

public interface ISoustraitanceService {
	List<SousTraitance> retrieveAllSoustraitance();
	SousTraitance addSoustraitance (SousTraitance s);
	SousTraitance updateSoustraitance (SousTraitance s);
	SousTraitance retrieveSoustraitance (Long id);
	void removeSoustraitance (Long id);
}
