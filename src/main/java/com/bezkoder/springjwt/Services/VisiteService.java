package com.bezkoder.springjwt.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.interfaces.VisiteInterface;
import com.bezkoder.springjwt.models.Visite;
import com.bezkoder.springjwt.repository.VisiteRepository;


@Service
public class VisiteService implements VisiteInterface {

	@Autowired 
	VisiteRepository visiterep ;
	
	@Override
	public List<Visite> retrieveAllVisite() {
		// TODO Auto-generated method stub
		return visiterep.findAll();
	}

	@Override
	public Visite addVisite(Visite v) {
		// TODO Auto-generated method stub
		return visiterep.save(v);
	}

	@Override
	public Visite updateVisite(Visite v) {
		// TODO Auto-generated method stub
		return visiterep.save(v);
	}

	@Override
	public Visite retrieveVisite(Long idViste) {
		// TODO Auto-generated method stub
		return visiterep.findById(idViste).orElse(null);
	}

	@Override
	public void removeVisite(Long idViste) {
		// TODO Auto-generated method stub
		visiterep.deleteById(idViste);
		
	}
	

}
