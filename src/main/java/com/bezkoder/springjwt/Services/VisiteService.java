package com.bezkoder.springjwt.Services;

import java.util.List;

import javax.transaction.Transactional;

import com.bezkoder.springjwt.models.Proprety;
import com.bezkoder.springjwt.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.interfaces.VisiteInterface;
import com.bezkoder.springjwt.models.Visite;
import com.bezkoder.springjwt.repository.VisiteRepository;


@Service
public class VisiteService implements VisiteInterface {

	@Autowired
	VisiteRepository visiterep ;
	@Autowired
	PropertyRepository prorep ;

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
	@Override
	public void addAndassignVisitetoProperty(Visite v, String nom) {

		Proprety p =  prorep.findByNom(nom).orElse(null);
		//System.out.println(p);
		v.setProperties(p);
		//System.out.println(v);
		visiterep.save(v);
	}



}
