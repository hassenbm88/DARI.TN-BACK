package com.bezkoder.springjwt.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.*;
import com.bezkoder.springjwt.repository.*;
import com.bezkoder.springjwt.interfaces.*;

@Service
public class ReportService implements IReportservice {
	@Autowired
	ReportRepository opRepository ;

	@Override
	public List<Report> retrieveAllReport() {
		return opRepository.findAll();
		
	}

	@Override
	public Report addReport(Report o) {
		return opRepository.save(o);
		
	}

	@Override
	public Report updateReport(Report o) {
		 return opRepository.save(o);
		
	}
	
	@Override
	public void updateReporte(Report a ,  long id){
		Report report=opRepository.findById(id).orElse(null);
		report.setDescription(a.getDescription());
		report.setReason(a.getReason());
		report.setConfirmation(true);
		opRepository.save(report);
	}

	@Override
	public Report retrieveReport(Long id) {
		 return opRepository.findById(id).orElse(null);
		
	}

	@Override
	public void removeReport(Long id) {
		opRepository.deleteById(id);
		
	}
	
	@Override
	public float pourcentageBadLanguage(){
		Reason c = null ;
		int nbBad = opRepository.getNumBadLang(c.Bad_Language);
		int nbAll = opRepository.getNumAllReport();
		float pc = (nbBad*100)/nbAll;
		return pc;
				
	}
	
	@Override
	public float pourcentageDamage(){
		Reason c = null ;
		int nbDam = opRepository.getNumDamProp(c.Proprety_Damage);
		int nbAll = opRepository.getNumAllReport();
		float pc = (nbDam*100)/nbAll;
		return pc;
				
	}
	
}