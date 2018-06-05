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

    @Override
    public int compareTo(Object o) {
        ActiviteDTO activiteDTO = (ActiviteDTO)o;
        if(this.date.before(activiteDTO.date))
            return 1;
        if(this.date.after(activiteDTO.date))
            return -1;
        if(this.date.equals(activiteDTO.date))
            return 0;
        return 0;
    }
}
