package metier;

import java.io.Serializable;

public class Requete implements Serializable {
    private String nom;
    private Serializable dto;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Object getDto() {
        return dto;
    }

    public void setDto(Serializable dto) {
        this.dto = dto;
    }
}
