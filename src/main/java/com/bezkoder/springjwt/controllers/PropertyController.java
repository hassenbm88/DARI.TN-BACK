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

import com.bezkoder.springjwt.Services.PropertyService;
import com.bezkoder.springjwt.models.Proprety;




@RestController
@RequestMapping("/Proprety")
@CrossOrigin("*")
public class PropertyController {@Autowired 
	PropertyService pService ;   
	
		@GetMapping("/retrieve-property") 
		@ResponseBody
		public List<Proprety> getProprety() {
		List<Proprety> listProprety = pService.retrieveAllProprety();
		return listProprety;
		}
		
		//http://localhost:8087/SpringMVC/Proprety/Add-Proprety/{Visite-id}
			/*@PostMapping("/Add-Proprety/{Visite-id}")
			@ResponseBody
			public void AddProprety(@RequestBody Proprety Propretys ,
					@PathVariable("Visite-id")  Long idVisite )
					
			{
			pService.addProprety(Propretys );
			}*/
		//http://localhost:8087/SpringMVC/Proprety/Add-Proprety
		@PostMapping("/Add-Property")
		@ResponseBody
		public void addProperty(@RequestBody  Proprety p)
		{
			pService.addProprety(p);
		}
			
			//http://localhost:8087/SpringMVC/Proprety/update-Proprety/{Visite-id}
			@PostMapping("/update-Proprety/{Visite-id}")
			@ResponseBody
			public void updateProprety(@RequestBody Proprety P ,
					@PathVariable("Visite-id")  Long idVisite )
					
			{
				pService.updateProprety(P);
			}
			
				
				@GetMapping("/retrieve-Proprety/{idProprety}")  
				@ResponseBody
				public Proprety getProprety(@PathVariable("idProprety") Long idProprety ) {
				return pService.retrieveProprety(idProprety);
				
				}
				
				@DeleteMapping("/removeProprety/{idProprety}")
				@ResponseBody
				public void removeProprety(@PathVariable("idProprety") Long idProprety)
				{
					pService.removeProprety(idProprety);
				}
				
				//http://localhost:8085/SpringMVC/Proprety/Assgin-visite/{Proprety-id}/{visite-id}
					@PostMapping("/Assgin-visite/{Proprety-id}/{visite-id}")
					@ResponseBody
					public void addAndassignVisitetoProperty(Proprety p ,@PathVariable("Proprety-id")  Long idProprety ,
							@PathVariable("visite-id")  Long idVisite )
					{
					pService.addAndassignVisitetoProperty(p ,idProprety ,idVisite);
					}


}
