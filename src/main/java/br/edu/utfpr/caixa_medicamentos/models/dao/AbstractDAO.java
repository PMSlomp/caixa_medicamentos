package br.edu.utfpr.caixa_medicamentos.models.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.edu.utfpr.caixa_medicamentos.util.JPAUtil;

@SuppressWarnings("unchecked")
public class AbstractDAO<PK, T>  {

    protected EntityManager entityManager;

    public AbstractDAO() {
        this.entityManager = JPAUtil.getEntityManager();
    }

    public void save(T entity) {
        this.entityManager = JPAUtil.getEntityManager();
        entityManager.persist(entity);
    }

    public List<T> findAll() {
        this.entityManager = JPAUtil.getEntityManager();
        return entityManager.createQuery(("FROM " + getTypeClass().getName()))
                .getResultList();
    }

    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().
                getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }

    public Long count() {
        String queryString = "SELECT COUNT(o) FROM " + getTypeClass().getName() + " o";

        Query query = entityManager.createQuery(queryString);

        Long queryResult = (Long) query.getSingleResult();

        return queryResult;
    }
}
