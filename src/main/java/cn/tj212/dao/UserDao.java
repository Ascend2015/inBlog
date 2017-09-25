package cn.tj212.dao;

import cn.tj212.entity.User;

import java.io.Serializable;
import java.util.List;

public interface UserDao extends BaseDao<User> {
    int add(User user);

    int del(User user);

    int update(User user);

    User findOneById(Serializable id);

    List<User> findAll();

    void updateLoginSession(String sessionId,String loginId);

    void addSessionId(String id);
}
