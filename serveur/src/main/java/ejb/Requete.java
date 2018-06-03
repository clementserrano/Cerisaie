package ejb;

import java.io.Serializable;

public class Requete implements Serializable {
    private String nom;
    private Object dto;

    public Requete(String nom, Object dto) {
        this.nom = nom;
        this.dto = dto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Object getDto() {
        return dto;
    }

    public void setDto(Object dto) {
        this.dto = dto;
    }
}
