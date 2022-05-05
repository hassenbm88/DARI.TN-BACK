package com.bezkoder.springjwt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.interfaces.*;
import com.bezkoder.springjwt.repository.*;
import com.bezkoder.springjwt.models.*;
@Service
public class AbonnementService implements  IAbonnementService {
	@Autowired
	IAbonnementRepo AbRepository ;

	@Override
	public List<Abonnement> retrieveAllAbonnements() {
		return AbRepository.findAll();		
	}

	@Override
	public Abonnement addAbonnement(Abonnement a) {
		return AbRepository.save(a);
		
	}

	@Override
	public Abonnement updateAbonnement(Abonnement a) {
		return AbRepository.save(a);
		
	}

	@Override
	public void removeAbonnement(Long id) {
		AbRepository.deleteById(id);
	}

	@Override
	public Abonnement retrieveAbonnement(Long id) {
		return AbRepository.findById(id).orElse(null);
		
	}
	

}
