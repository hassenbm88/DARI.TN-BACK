package com.bezkoder.springjwt.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.bezkoder.springjwt.models.*;
import com.bezkoder.springjwt.repository.*;
import com.bezkoder.springjwt.interfaces.IReglement;

import java.util.List;


@Component
@Service
public class  ReglementService   implements IReglement {





        @Autowired
        private ReglementRepository reglementRepository;



        @Override
        public Reglement createReglement(Reglement reglement) {

            reglementRepository.save(reglement);
            return null;

        }
        @Override
        public List<Reglement> retrieveAllReglemet() {
            return reglementRepository.findAll();
        }
        @Override
        public String deleteReglement(Long idReglemet){
            Reglement reglement = reglementRepository.findById(idReglemet).orElseThrow(() -> new RuntimeException("reglement not found"));
            reglementRepository.deleteById(reglement.getIdReglemet());
            return null;
        }
        @Override
        public Reglement updateReglement(Reglement reglement){
            return reglementRepository.save(reglement);

        }


        @Override
        public Reglement retrieveReglements(Long idReglemet) {
            return reglementRepository.findById(idReglemet).orElse(null);
        }
}
