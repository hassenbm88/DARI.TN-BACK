package com.bezkoder.springjwt.interfaces;

import com.bezkoder.springjwt.models.Reglement;

import java.util.List;

public interface IReglement {

    public Reglement retrieveReglements(Long idReglemet);
    public Reglement updateReglement(Reglement reglement);
    public String deleteReglement(Long idReglemet);
    public List<Reglement> retrieveAllReglemet();
    public Reglement createReglement(Reglement reglement);

}
