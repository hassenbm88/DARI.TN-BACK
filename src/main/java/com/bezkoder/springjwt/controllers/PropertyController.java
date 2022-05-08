package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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


	//http://localhost:8087/SpringMVC/Proprety/Add-Proprety
	@PostMapping("/Add-Property")
	@ResponseBody
	public void addProperty(@RequestBody  Proprety p)
	{
		pService.addProprety(p);
	}

		/*@PostMapping("/Add-Property")
		@ResponseBody
		public void addProperty(@RequestBody  Proprety p,@RequestPart("file") MultipartFile file) throws JsonParseException ,JsonMappingException , Exception,URISyntaxException
		{
			Proprety pub = new ObjectMapper().readValue(c, Proprety.class);

			System.out.println("Ok ............."+ c);

			boolean isExit = new File(context.getRealPath("/Images/")).exists();
	        if (!isExit)
	        {
	        	new File (context.getRealPath("/Images/")).mkdir();
	        	System.out.println("mk dir.............");
	        }
	        String filename = file.getOriginalFilename();
	        String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
	        File serverFile = new File (context.getRealPath("/Images/"+File.separator+newFileName));
	        try
	        {
	        	System.out.println("Image"+ newFileName);
	        	 FileUtils.writeByteArrayToFile(serverFile,file.getBytes());

	        }catch(Exception ex) {
	        	ex.printStackTrace();
	        }
	        pub.setFilename(newFileName);
			return paservice.addPublication(pub);
		}
		Publication_repository oPublication ;

		 @GetMapping(path="/ImgPub/{id}")
		 public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
			 Publication pub   = oPublication.findById(id).get();
			 return Files.readAllBytes(Paths.get(context.getRealPath("/Images/")+pub.getFilename()));
		 }*/

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

	@GetMapping("/retrieve-PropretyByNom/{Proprety-nom}")
	public List <Proprety> retrievePropretysByName(@PathVariable("Proprety-nom") String nom) {
		return pService.retrievePropretysByName(nom);
	}




}
