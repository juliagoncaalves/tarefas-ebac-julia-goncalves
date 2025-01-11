package dao;

import domain.Produto;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

import static org.mockito.Mockito.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {
    public ProdutoDAO() {
    }

    public Produto cadastrar(Produto produto) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("controleEstoquePgSql");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return produto;
    }

    public void excluir(Produto produto) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("controleEstoquePgSql");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        produto = (Produto)entityManager.merge(produto);
        entityManager.remove(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public List<Produto> buscarTodos() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("controleEstoquePgSql");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Produto> query = builder.createQuery(Produto.class);
        Root<Produto> root = query.from(Produto.class);
        query.select(root);
        TypedQuery<Produto> typedQuery = entityManager.createQuery(query);
        List<Produto> produtos = typedQuery.getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return produtos;
    }
}