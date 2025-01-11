package dao;

import domain.Carro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CarroDAO implements ICarroDAO {
    public CarroDAO() {
    }

    public Carro cadastrar(Carro carro) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("concessionariaMySql");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return carro;
    }
}
