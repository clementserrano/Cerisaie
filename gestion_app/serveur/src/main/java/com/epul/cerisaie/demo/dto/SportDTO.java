package com.epul.cerisaie.demo.dto;

import java.util.Objects;

public class SportDTO implements ISportProjection {

    private Integer idSport;

    private String nomSport;

    public SportDTO(Integer idSport, String nomSport){
        this.idSport = idSport;
        this.nomSport = nomSport;
    }

    @Override
    public Integer getIdSport() {
        return idSport;
    }

    @Override
    public String getNomSport() {
        return nomSport;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SportDTO sport = (SportDTO) obj;
        return Objects.equals(sport.getIdSport(), this.getIdSport());
    }

    @Override
    public int hashCode(){
        return Objects.hash(idSport);
    }
}
