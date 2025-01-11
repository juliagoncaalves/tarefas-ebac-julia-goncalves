package dao;

import domain.Acessorio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AcessorioDAO implements IAcessorioDAO {
    public AcessorioDAO() {
    }

    public Acessorio cadastrar(Acessorio acessorio) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("concessionariaMySql");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return acessorio;
    }
}