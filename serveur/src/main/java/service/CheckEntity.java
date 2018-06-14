package service;

import metier.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CheckEntity {

    static public SportEntity retrieveSport(Object pk) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PCerisaie");
        EntityManager entityManager = factory.createEntityManager();
        SportEntity result = entityManager.find(SportEntity.class, pk);
        entityManager.close();
        return result;
    }
}