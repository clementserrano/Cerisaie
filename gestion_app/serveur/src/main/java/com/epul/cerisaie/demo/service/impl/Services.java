package com.epul.cerisaie.demo.service.impl;

import com.epul.cerisaie.demo.dao.IActiviteRepository;
import com.epul.cerisaie.demo.dao.IClientRepository;
import com.epul.cerisaie.demo.dao.ISejourRepository;
import com.epul.cerisaie.demo.dao.ISportRepository;
import com.epul.cerisaie.demo.dto.ActiviteDTO;
import com.epul.cerisaie.demo.dto.IActiviteProjection;
import com.epul.cerisaie.demo.dto.ISportProjection;
import com.epul.cerisaie.demo.dto.SportDTO;
import com.epul.cerisaie.demo.model.Activite;
import com.epul.cerisaie.demo.model.Client;
import com.epul.cerisaie.demo.model.Sejour;
import com.epul.cerisaie.demo.model.Sport;
import com.epul.cerisaie.demo.service.IServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Services implements IServices {

    @Autowired
    IActiviteRepository activiteDAO;

    @Autowired
    IClientRepository clientDAO;

    @Autowired
    ISportRepository sportDAO;

    @Autowired
    ISejourRepository sejourDAO;

    @Override
    public List<IActiviteProjection> getActivites() {
        List<Activite> activites = activiteDAO.findAll();

        List<IActiviteProjection> res = new ArrayList<>();

        for(Activite activite : activites){
            addDTOList(res, activite);
        }
        return res;
    }

    @Override
    public List<IActiviteProjection> getActivite(int sportId) {
        List<Activite> activites = activiteDAO.findAll();

        List<IActiviteProjection> res = new ArrayList<>();

        for(Activite activite : activites){
            if(sportId == activite.getSport()){
                addDTOList(res, activite);
            }
        }
        return res;
    }

    private void addDTOList(List<IActiviteProjection> list, Activite activite){
        Optional<Sport> sport = sportDAO.findById(activite.getSport());
        Optional<Sejour> sejour = sejourDAO.findById(activite.getNumSej());
        Optional<Client> client = clientDAO.findById(sejour.get().getNumCli());
        ActiviteDTO dto = new ActiviteDTO(client.get().getNomCli(), activite.getDateJour(), sport.get().getLibelleSport(), activite.getNbLoc());
        list.add(dto);
    }

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