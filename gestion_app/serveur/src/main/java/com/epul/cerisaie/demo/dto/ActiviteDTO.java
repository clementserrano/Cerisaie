package com.epul.cerisaie.demo.dto;

import java.util.Date;

public class ActiviteDTO implements IActiviteProjection {

    private String nomClient;

    private Date date;

    private String nomActivite;

    private Integer nbInscriptions;

    public ActiviteDTO(String nomClient, Date date, String nomActivite, Integer nbInscriptions){
        this.nomClient = nomClient;
        this.date = date;
        this.nomActivite = nomActivite;
        this.nbInscriptions = nbInscriptions;
    }

    @Override
    public String getNomClient() {
        return nomClient;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getNomActivite() {
        return nomActivite;
    }

    @Override
    public Integer getNbInscriptions() {
        return nbInscriptions;
    }
}
