package cn.tj212.service;

import java.util.List;

public interface BaseService<T> {
    void add (T t) throws Exception;
    List<T> findAll(int pageNum,int pageSize);

}
