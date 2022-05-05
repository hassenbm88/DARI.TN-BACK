package com.bezkoder.springjwt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.interfaces.*;
import com.bezkoder.springjwt.repository.*;
import com.bezkoder.springjwt.models.*;
@Service
public class SoustraitanceService implements ISoustraitanceService{

	@Autowired
	ISoustraitanceRepo stRepo ;
	
	@Override
	public List<SousTraitance> retrieveAllSoustraitance() {
		return stRepo.findAll();
	}

	@Override
	public SousTraitance addSoustraitance(SousTraitance s) {
		return stRepo.save(s);
	}

	@Override
	public SousTraitance updateSoustraitance(SousTraitance s) {
		return stRepo.save(s);
	}

	@Override
	public SousTraitance retrieveSoustraitance(Long id) {
		return stRepo.findById(id).orElse(null);
	}

	@Override
	public void removeSoustraitance(Long id) {
		stRepo.deleteById(id);		
	}

}
