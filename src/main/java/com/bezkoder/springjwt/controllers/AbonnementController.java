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
@RequestMapping("/Abonnement")
@CrossOrigin("*")

public class AbonnementController {
	@Autowired 
	
	IAbonnementService abService ;
	// http://localhost:8085/SpringMVC/Abonnement/retrieve-abonnement
	@GetMapping("/retrieve-abonnement") // retrieve heya l get 
	@ResponseBody
	public List<Abonnement> getAbonnement() {
	List<Abonnement> listAbonnement = abService.retrieveAllAbonnements();
	return listAbonnement;
	}
	
	// http://localhost:8085/SpringMVC/Abonnement/Add-Abonnement
			@PostMapping("/Add-Abonnement")
			@ResponseBody
			public void addAbonnement(@RequestBody  Abonnement a)
			{
				abService.addAbonnement(a);
				
				}
			
			// http://localhost:8085/SpringMVC/Abonnement/update-Abonnement
			@PutMapping("/update-Abonnement")
			@ResponseBody
			public Abonnement updateAbonnement(@RequestBody Abonnement a)
			{
				return abService.updateAbonnement(a);
				 
			}
			
			// http://localhost:8085/SpringMVC/Operateur/retrieve-Operateur/{Operateur-id}
			@GetMapping("/retrieve-abonnement/{idabonnement}") // retrieve heya l get 
			@ResponseBody
			public Abonnement getAbonnement(@PathVariable("idabonnement") Long idAbonnement ) {
				return abService.retrieveAbonnement(idAbonnement);
			}
			
			
			//http://localhost:8089/SpringMVC/Abonnement/removeAbonnement/{Operateur-id}
			@DeleteMapping("/removeAbonnement/{AbonnementId}")
			@ResponseBody
			public void removeAbonnement(@PathVariable("AbonnementId") Long idAbonnement)
			{
				abService.removeAbonnement(idAbonnement);
			}
			
			
			}
	

