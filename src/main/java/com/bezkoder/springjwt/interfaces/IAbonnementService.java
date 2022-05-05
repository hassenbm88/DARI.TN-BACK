package com.bezkoder.springjwt.interfaces;

import java.util.List;

import com.bezkoder.springjwt.models.*;

public interface IAbonnementService {
	List<Abonnement> retrieveAllAbonnements();
	Abonnement addAbonnement (Abonnement a);
	Abonnement updateAbonnement (Abonnement a);
	Abonnement retrieveAbonnement (Long id);
	void removeAbonnement (Long id);
	
}
