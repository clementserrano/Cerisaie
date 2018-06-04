package com.epul.cerisaie.demo.service.impl;

import com.epul.cerisaie.demo.dto.ISportProjection;
import com.epul.cerisaie.demo.dto.SportDTO;
import com.epul.cerisaie.demo.model.Activite;
import com.epul.cerisaie.demo.model.Sport;
import com.epul.cerisaie.demo.service.ISportServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SportService extends Services implements ISportServices {

    @Override
    public List<ISportProjection> getSports() {
        List<Activite> activites = activiteDAO.findAll();

        List<ISportProjection> res = new ArrayList<>();

        for(Activite activite : activites){
            Optional<Sport> sport = sportDAO.findById(activite.getSport());
            SportDTO dto = new SportDTO(activite.getSport(), sport.get().getLibelleSport());
            if(!res.contains(dto)){
                res.add(dto);
            }
        }
        return res;
    }
}
