package com.fral.uo.data.core.api;

import java.io.Serializable;
import java.util.List;

public interface UmssOnlineDao {

    void persist(Object entity);
    void persist(Object[] entities);
    <T> List<T> find(Class<T> entityClass);
    <T> T load(Class<T> entityClass, Serializable id);
    <T> List<T> find(String jpql);
}
