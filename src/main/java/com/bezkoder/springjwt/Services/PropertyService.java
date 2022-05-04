package com.bezkoder.springjwt.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.interfaces.PropertyInterface;
import com.bezkoder.springjwt.models.Proprety;
import com.bezkoder.springjwt.models.Visite;
import com.bezkoder.springjwt.repository.PropertyRepository;
import com.bezkoder.springjwt.repository.VisiteRepository;



@Service
public class PropertyService implements PropertyInterface {
	@Autowired 
	PropertyRepository prorep ;
	@Autowired 
	VisiteRepository vitrep;
	@Override
	public List<Proprety> retrieveAllProprety() {
		// TODO Auto-generated method stub
		return prorep.findAll();
	}
	
	/*@Override
	public Proprety addProprety(Proprety propretys ,  Long idVisite) {
		Visite s = vitrep.findById(idVisite).orElse(null);
		propretys.setVisite(s);
		prorep.save(propretys);
		return propretys;
	}*/

	 @Override
	public Proprety addProprety(Proprety p) {
		 
		return prorep.save(p);
	}

	@Override
	public Proprety updateProprety(Proprety p) {
		
		return prorep.save(p);
	}
	
	
	//public Proprety updateProprety(Proprety propretys ,  Long idVisite) {
	//	Visite s = vitrep.findById(idVisite).orElse(null);
	//	propretys.setVisite(s);
	//	prorep.save(propretys);
	//	return propretys;
	//}

	@Override
	public Proprety retrieveProprety(Long idProprety) {
		// TODO Auto-generated method stub
		return prorep.findById(idProprety).orElse(null);
	}

	@Override
	public void removeProprety(Long idProprety) {
		// TODO Auto-generated method stub
		prorep.deleteById(idProprety);
	}
	
	/*@Transactional
	public void addAndassignVisitetoProperty(Proprety p,Long idProprety, Long idVisite) {
		prorep.save(p);
		Visite s = vitrep.findById(idVisite).orElse(null);
		Proprety p1 = prorep.findById(idProprety).orElse(null);
		p1.setVisite(s);
		prorep.save(p1);
	}*/
	
	@Override
	public void addAndassignVisitetoProperty(Proprety p,Long idProprety, Long idVisite) {
		
		prorep.save(p);
		Proprety s =  prorep.findById(idProprety).orElse(null);
		Visite v = vitrep.findById(idVisite).orElse(null);
		 v.getProperties(); 
		 vitrep.save(v);
	}  

	


}
