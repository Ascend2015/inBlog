package cn.tj212.dao;

import java.io.Serializable;
import java.util.List;

public  interface BaseDao<T> {
    int add(T t);
    int del(T t);
    int update(T t);
    T findOneById(Serializable id);
    List<T> findAll();
}
