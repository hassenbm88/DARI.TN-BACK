package com.bezkoder.springjwt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;



import com.bezkoder.springjwt.models.*;
import com.bezkoder.springjwt.repository.*;
import com.bezkoder.springjwt.interfaces.*;

@Service
public class AideService implements IAideservice {
	@Autowired
	AideRepository opRepository ;

	@Override
	public List<Aide> retrieveAllAide() {
		return opRepository.findAll();
		
	}

	@Override
	public Aide addAide(Aide o) {
		return opRepository.save(o);
		
	}

	@Override
	public Aide updateAide(Aide o) {
		 return opRepository.save(o);
		
	}
	
	@Override
	public void updateAidee(Aide a ,  long id){
		Aide aide=opRepository.findById(id).orElse(null);
		aide.setMonatnt(a.getMonatnt());
		aide.setPeriode(a.getPeriode());
		aide.setType_aide(a.getType_aide());
		opRepository.save(aide);
	}

	@Override
	public Aide retrieveAide(Long id) {
		 return opRepository.findById(id).orElse(null);
		
	}

	@Override
	public void removeAide(Long id) {
		opRepository.deleteById(id);
		
	}
	
	@Override
	public List<Aide> getAllAideClasse(){
		return opRepository.getAllAideClasseByMontant();
	}
}
