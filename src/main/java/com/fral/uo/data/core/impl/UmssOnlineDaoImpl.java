package com.fral.uo.data.core.impl;

import com.fral.uo.data.core.api.UmssOnlineDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.io.Serializable;
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
    @Override
    public void persist(Object entity) {

    }

    @Override
    public void persist(Object[] entities) {

    }

    @Override
    public <T> List<T> find(Class<T> entityClass) {
        return null;
    }

    @Override
    public <T> T load(Class<T> entityClass, Serializable id) {
        return null;
    }

    @Override
    public <T> List<T> find(String jpql) {
        return null;
    }
    //endregion
}
