package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.bezkoder.springjwt.interfaces.*;

import com.bezkoder.springjwt.models.*;

@RestController
@RequestMapping("/Soustraitance")
@CrossOrigin("*")
public class SoustraitanceController {
	@Autowired 
	ISoustraitanceService stService ;
	// http://localhost:8085/SpringMVC/Soustraitance/retrieve-Soustraitance
	@GetMapping("/retrieve-soustraitance") // retrieve heya l get 
	@ResponseBody
	public List<SousTraitance> getSoustraitance() {
	List<SousTraitance> listSousTraitance = stService.retrieveAllSoustraitance();
	return listSousTraitance;
	}
	

	// http://localhost:8085/SpringMVC/Soustraitance/Add-Soustraitance
			@PostMapping("/Add-SousTraitance")
			@ResponseBody
			public void addSousTraitance(@RequestBody  SousTraitance s)
			{
				stService.addSoustraitance(s);
				}
			
			// http://localhost:8085/SpringMVC/Soustraitance/update-Soustraitance
						@PutMapping("/update-Soustraitance")
						@ResponseBody
						public SousTraitance updateSoustraitance(@RequestBody SousTraitance s)
						{
							return stService.updateSoustraitance(s);
							 
						}
						
						// http://localhost:8085/SpringMVC/Soustraitance/retrieve-Soustraitance/{Soustraitance-id}
						@GetMapping("/retrieve-Soustraitance/{Soustraitance-id}") // retrieve heya l get 
						@ResponseBody
						public SousTraitance getSoustraitance(@PathVariable("Soustraitance-id") Long idSoustraitance ) {
						return stService.retrieveSoustraitance(idSoustraitance);
						
						}
						
						//http://localhost:8089/SpringMVC/Abonnement/removeAbonnement/{Operateur-id}
						@DeleteMapping("/removeSoustraitance/{Soustraitance-id}")
						@ResponseBody
						public void removeSoustraitance(@PathVariable("Soustraitance-id") Long idSoustraitance)
						{
							stService.removeSoustraitance(idSoustraitance);
						}
						
}
