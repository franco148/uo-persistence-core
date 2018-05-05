package com.fral.uo.data.core.impl;

import com.fral.uo.data.core.api.UmssOnlineDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Repository
public class UmssOnlineDaoImpl implements UmssOnlineDao {

    //region Properties
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private EntityManager entityManager;

    //endregion

    //region Constructors
    @Autowired
    public UmssOnlineDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    //endregion

    //region UmssOnlineDao Members
    @Transactional
    @Override
    public <T> T  persist(T entity) {
        entityManager.persist(entity);

        return entity;
    }

    @Transactional
    @Override
    public <T> Collection<T> persist(T[] entities) {
        for (Object entity : entities) {
            entityManager.persist(entity);
        }

        return Arrays.asList(entities);
    }

    @Transactional(readOnly = true)
    @Override
    public <T> List<T> load(Class<T> entityClass) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public <T> T find(Class<T> entityClass, Serializable id) {
        return entityManager.find(entityClass, id);
    }

    @Transactional(readOnly = true)
    @Override
    public <T> List<T> load(String jpql) {
        return null;
    }

    @Override
    public <T> Boolean delete(T entity) {
        return null;
    }
    //endregion
}
