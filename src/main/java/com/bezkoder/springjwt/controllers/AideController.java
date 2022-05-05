
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


import com.bezkoder.springjwt.models.*;
import com.bezkoder.springjwt.interfaces.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Aide")
public class AideController {
	@Autowired 
	IAideservice opService ;  //expose the service 
	// http://localhost:8085/SpringMVC/Aide/retrieve-Aide
		@GetMapping("/retrieve-aide") // retrieve heya l get 
		@ResponseBody
		public List<Aide> getAide() {
			System.out.println("hhh");
		List<Aide> listAide = opService.retrieveAllAide();
		return listAide;
		}
		// http://localhost:8085/SpringMVC/Aide/Add-Aide
		@PostMapping("/Add-Aide")
		@ResponseBody
		public void addAide(@RequestBody  Aide o)
			{
			opService.addAide(o);
			}
		// http://localhost:8085/SpringMVC/Aide/update-Aide
				@PutMapping("/update-Aide")
				@ResponseBody
				public Aide updateAide(@RequestBody Aide o)
				{
					return opService.updateAide( o);
					 
				}
				
				// http://localhost:8085/SpringMVC/Aide/update-Aidee
				@PutMapping("/update-Aidee/{id}")
				@ResponseBody
				public void updateAidee(@RequestBody Aide o ,@PathVariable("id") Long id)
				{
					 opService.updateAidee(o, id);
					 
				}
				
				// http://localhost:8085/SpringMVC/Aide/retrieve-Aide/{Aide-id}
				@GetMapping("/retrieve-Aide/{Aide-id}") // retrieve heya l get 
				@ResponseBody
				public Aide getAide(@PathVariable("Aide-id") Long idAide ) {
				return opService.retrieveAide(idAide);
				
				}
				//http://localhost:8089/SpringMVC/Aide/removeAide/{Aide-id}
				@DeleteMapping("/removeAide/{Aide-id}")
				@ResponseBody
				public void removeAide(@PathVariable("Aide-id") Long idAide)
				{
					opService.removeAide(idAide);
				}
				
				@GetMapping("/getAllAideClasse")
				@ResponseBody
				public List<Aide> getAllAideClasse(){
					return opService.getAllAideClasse();
				}

}