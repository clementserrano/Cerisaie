package service;

import utils.MonException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

public class EnregistreEntity {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public void insert(Object entity) throws Exception, MonException {

        factory = Persistence.createEntityManagerFactory("PCerisaie");
        entityManager = factory.createEntityManager();

        try {
            if (!entityManager.contains(entity)) {
                entityManager.getTransaction().begin();
                entityManager.persist(entity);
                entityManager.flush();
                entityManager.getTransaction().commit();
            }
            entityManager.close();
        } catch (EntityNotFoundException h) {
            new MonException("Erreur d'insertion", h.getMessage());
        } catch (Exception e) {
            new MonException("Erreur d'insertion", e.getMessage());
        }
    }
}
