package com.max.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
@Transactional
public interface GenericDao<T, PK extends Serializable>{

    T get(PK id);
    T load(PK id);
    PK save(T persistentObject);
    List<T> getAll();
    void update(T persistentObject);
    void saveOrUpdate(T persistentObject);
    void delete(T persistentObject);




}
