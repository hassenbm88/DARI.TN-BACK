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
@RequestMapping("/Report")
public class ReportController {
	@Autowired 
	IReportservice opService ;  //expose the service 
	// http://localhost:8085/SpringMVC/Report/retrieve-report
		@GetMapping("/retrieve-report") // retrieve heya l get 
		@ResponseBody
		public List<Report> getReport() {
			System.out.println("hhh");
		List<Report> listReport = opService.retrieveAllReport();
		return listReport;
		}
		// http://localhost:8085/SpringMVC/Report/Add-Report
		@PostMapping("/Add-Report")
		@ResponseBody
		public void addReport(@RequestBody  Report o)
			{
			opService.addReport(o);
			}
		// http://localhost:8085/SpringMVC/Report/update-Report
				@PutMapping("/update-Report")
				@ResponseBody
				public Report updateReport(@RequestBody Report o)
				{
					//o.setConfirmation(true);
					return opService.updateReport( o);
					 
				}
				
				// http://localhost:8085/SpringMVC/Aide/update-Aidee
				@PutMapping("/update-Reportt/{id}")
				@ResponseBody
				public void updateReporte(@RequestBody Report o ,@PathVariable("id") Long id)
				{
					//o.setConfirmation(true);
					opService.updateReporte(o, id);
					 
				}
				
				// http://localhost:8085/SpringMVC/Report/retrieve-Report/{Report-id}
				@GetMapping("/retrieve-Report/{Report-id}") // retrieve heya l get 
				@ResponseBody
				public Report getReport(@PathVariable("Report-id") Long idReport ) {
				
					
					return opService.retrieveReport(idReport);
				
				}
				//http://localhost:8089/SpringMVC/Report/removeReport/{Report-id}
				@DeleteMapping("/removeReport/{Report-id}")
				@ResponseBody
				public void removeReport(@PathVariable("Report-id") Long idReport)
				{
					opService.removeReport(idReport);
				}
				
				@GetMapping("/pc-bad") // retrieve heya l get 
				@ResponseBody
				public float getPcBad() {
					
				
				return opService.pourcentageBadLanguage();
				}
				
				@GetMapping("/pc-dam") // retrieve heya l get 
				@ResponseBody
				public float getPcDam() {
					
				
				return opService.pourcentageDamage();
				}

}