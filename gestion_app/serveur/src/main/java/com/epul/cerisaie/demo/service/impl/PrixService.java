package com.epul.cerisaie.demo.service.impl;

import com.epul.cerisaie.demo.dto.IPrixProjection;
import com.epul.cerisaie.demo.dto.PrixDTO;
import com.epul.cerisaie.demo.model.Activite;
import com.epul.cerisaie.demo.model.Client;
import com.epul.cerisaie.demo.model.Sejour;
import com.epul.cerisaie.demo.model.Sport;
import com.epul.cerisaie.demo.service.IPrixService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PrixService extends Services implements IPrixService {

    @Override
    public List<IPrixProjection> getPrix() {
        List<Sejour> sejours = sejourDAO.findAll();

        List<Activite> activites = activiteDAO.findAll();

        List<IPrixProjection> res = new ArrayList<>();

        for(Sejour sejour : sejours){
            System.out.println(sejour.getNumSej());
            Integer nbActivites = 0;
            Double prixTot = 0.0;
            Optional<Client> client = clientDAO.findById(sejour.getNumCli());

            for(Activite activite : activites){
                if(activite.getNumSej() == sejour.getNumSej()){

                    Optional<Sport> sport = sportDAO.findById(activite.getSport());
                    nbActivites += 1;
                    prixTot += sport.get().getTarifUnite();
                }
            }
            if(prixTot > 0){
                PrixDTO dto = new PrixDTO(client.get().getNomCli(), nbActivites, prixTot);
                res.add(dto);
            }
        }
        Collections.sort(res);
        return res;
    }
}
