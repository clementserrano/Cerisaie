package com.epul.cerisaie.demo.dto;

public class PrixDTO implements IPrixProjection {

    private String nomClient;

    private Integer nbIncriptions;

    private Double prix;

    public PrixDTO(String nomClient, Integer nbIncriptions, Double prix){
        this.nomClient = nomClient;
        this.nbIncriptions = nbIncriptions;
        this.prix = prix;
    }

    @Override
    public String getClient() {
        return nomClient;
    }

    @Override
    public Integer getNbInscriptions() {
        return nbIncriptions;
    }

    @Override
    public Double getPrix() {
        return prix;
    }

    @Override
    public int compareTo(Object o) {
        PrixDTO prixDTO = (PrixDTO)o;
        if(this.prix > prixDTO.prix)
            return  1;
        if(this.prix < prixDTO.prix)
            return  -1;
        if(this.prix.equals(prixDTO.prix))
            return  0;

        return 0;
    }
}
