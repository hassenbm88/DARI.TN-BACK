package com.bezkoder.springjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bezkoder.springjwt.models.Reglement;
import com.bezkoder.springjwt.Services.ReglementService;

import java.util.List;

@RequestMapping("/Reglement")
@RestController
public class ReglementController {



    @Autowired
    ReglementService reglementService;

    @PostMapping("/getReglement/{idVisite}")
    public Reglement createReglemnt(@RequestBody Reglement reglement ) {
        return  reglementService.createReglement(reglement);

    }
    @PostMapping("/addReglement")
    public Reglement createAgent(@RequestBody Reglement reglement ) {
        return  reglementService.createReglement(reglement);

    }

    @GetMapping("/retrieve-reglements")
    @ResponseBody
    public List<Reglement> getReglement() {
        List<Reglement> listReglement = reglementService.retrieveAllReglemet();
        return listReglement;
    }

    @PutMapping("/updateReglement")
    public Reglement updatePost(@RequestBody Reglement reglement){
        return reglementService.updateReglement(reglement);
    }


    @GetMapping("/retrieve-Reglement/{Reglement-id}")
    @ResponseBody
    public Reglement getReglement(@PathVariable("Reglement-id") Long idReglement ) {
        return reglementService.retrieveReglements(idReglement);

    }

    @DeleteMapping("/deleteReglemet/{idReglemet}")
    public String deleteReglement(@PathVariable Long idReglemet){
        return reglementService.deleteReglement(idReglemet);
    }
}
