package com.jhorwitz.trivia.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDao {

    @Autowired
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PlayerServiceImpl");

 
    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
 
    public void persist(Object entity) {
        getEntityManager().persist(entity);
    }
 
    public void delete(Object entity) {
        getEntityManager().remove(entity);
    }
}