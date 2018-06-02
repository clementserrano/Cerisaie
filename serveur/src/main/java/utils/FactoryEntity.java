package utils;

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

    public static ClientEntity createClient(Client client) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setAdrRueCli(client.getAdrRueCli());
        clientEntity.setCpCli(client.getCpCli());
        clientEntity.setNomCli(client.getNomCli());
        clientEntity.setNumCli(client.getNumCli());
        clientEntity.setNumPieceCli(client.getNumPieceCli());
        clientEntity.setPieceCli(client.getPieceCli());
        clientEntity.setVilleCli(client.getVilleCli());
        return clientEntity;
    }

    public static EmplacementEntity createEmplacement(Emplacement emplacement) {
        EmplacementEntity emplacementEntity = new EmplacementEntity();
        emplacementEntity.setNbPersMaxEmpl(emplacement.getNbPersMaxEmpl());
        emplacementEntity.setNumEmpl(emplacement.getNumEmpl());
        emplacementEntity.setSurfaceEmpl(emplacement.getSurfaceEmpl());
        return emplacementEntity;
    }

    public static SejourEntity createSejour(Sejour sejour) {
        SejourEntity sejourEntity = new SejourEntity();
        sejourEntity.setDatedebSej(sejour.getDatedebSej());
        sejourEntity.setDateFinSej(sejour.getDateFinSej());
        sejourEntity.setNbPersonnes(sejour.getNbPersonnes());
        sejourEntity.setNumSej(sejour.getNumSej());
        return sejourEntity;
    }

    public static SportEntity createSport(Sport sport) {
        SportEntity sportEntity = new SportEntity();
        sportEntity.setCodeSport(sport.getCodeSport());
        sportEntity.setLibelleSport(sport.getLibelleSport());
        sportEntity.setTarifUnite(sport.getTarifUnite());
        sportEntity.setUniteTpsSport(sport.getUniteTpsSport());
        return sportEntity;
    }

    public static TypeEmplacementEntity createTypeEmplacement(TypeEmplacement typeEmplacement) {
        TypeEmplacementEntity typeEmplacementEntity = new TypeEmplacementEntity();
        typeEmplacementEntity.setCodeTypeE(typeEmplacement.getCodeTypeE());
        typeEmplacementEntity.setLibtypepl(typeEmplacement.getLibtypepl());
        typeEmplacementEntity.setTariftypepl(typeEmplacement.getTariftypepl());
        return typeEmplacementEntity;
    }

}
