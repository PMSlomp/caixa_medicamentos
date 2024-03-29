package br.edu.utfpr.caixa_medicamentos.service;

import java.util.List;
import br.edu.utfpr.caixa_medicamentos.models.dao.AbstractDAO;
import br.edu.utfpr.caixa_medicamentos.util.JPAUtil;

public class AbstractService<PK, T> {

    protected AbstractDAO<PK, T> dao;

    public boolean save(T entity) {
        boolean isSuccess = true;
        try {
            JPAUtil.beginTransaction();
            dao.save(entity);
            JPAUtil.commit();
        } catch (Exception e) {
            e.printStackTrace();
            isSuccess = false;
            JPAUtil.rollBack();
        } finally {
            JPAUtil.closeEntityManager();
        }
        return isSuccess;
    }

    public List<T> findAll() {
        List<T> entities = null;
        entities = dao.findAll();
        return entities;
    }

//    public T getById(PK pk) {
//        T entity = null;
//        entity = dao.getById(pk);
//        return entity;
//    }
//
//    public T getByProperty(String propertyName, String propertyValue) {
//        T entity = null;
//        entity = dao.getByProperty(propertyName, propertyValue);
//        return entity;
//    }



//    public boolean update(T entity) {
//        boolean isSuccess = true;
//        try {
//            JPAUtil.beginTransaction();
//            dao.update(entity);
//            JPAUtil.commit();
//        } catch (Exception e) {
//            isSuccess = false;
//            JPAUtil.rollBack();
//        }
//        return isSuccess;
//    }
//
//    public boolean delete(T entity) {
//        boolean isSuccess = true;
//        try {
//            JPAUtil.beginTransaction();
//            dao.delete(entity);
//            JPAUtil.commit();
//        } catch (Exception e) {
//            isSuccess = false;
//            JPAUtil.rollBack();
//        }
//        return isSuccess;
//    }
//
//    public boolean deleteById(PK pk) {
//        boolean isSuccess = true;
//        T entity = null;
//        try {
//            JPAUtil.beginTransaction();
//            entity = dao.getById(pk);
//
//            if(entity == null){
//                return false;
//            }
//
//            dao.delete(entity);
//            JPAUtil.commit();
//        } catch (Exception e) {
//            isSuccess = false;
//            JPAUtil.rollBack();
//        }
//        return isSuccess;
//    }

}
