package ejb;

import dto.*;
import metier.*;

public class FactoryEntity {

    public static ActiviteEntity createActivite(Activite activite) {
        ActiviteEntity activiteEntity = new ActiviteEntity();
        activiteEntity.setCodeSport(activite.getCodeSport());
        activiteEntity.setDateJour(activite.getDateJour());
        activiteEntity.setNbLoc(activite.getNbLoc());
        activiteEntity.setNumSej(activite.getNumSej());
        return activiteEntity;
    }

    public static SejourEntity createSejour(Sejour sejour) {
        SejourEntity sejourEntity = new SejourEntity();
        sejourEntity.setDatedebSej(sejour.getDatedebSej());
        sejourEntity.setDateFinSej(sejour.getDateFinSej());
        sejourEntity.setNbPersonnes(sejour.getNbPersonnes());
        sejourEntity.setNumSej(sejour.getNumSej());
        return sejourEntity;
    }
}
