package ejb;


import metier.Activite;
import metier.ActiviteEntity;

public class FactoryEntity {

    public static ActiviteEntity createActivite(Activite activite) {
        ActiviteEntity activiteEntity = new ActiviteEntity();
        activiteEntity.setCodeSport(activite.getCodeSport());
        activiteEntity.setDateJour(activite.getDateJour());
        activiteEntity.setNbLoc(activite.getNbLoc());
        activiteEntity.setNumSej(activite.getNumSej());
        return activiteEntity;
    }
}
