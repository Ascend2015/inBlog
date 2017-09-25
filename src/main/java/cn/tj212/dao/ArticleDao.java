package cn.tj212.dao;


import cn.tj212.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface ArticleDao extends BaseDao<Article> {
    int add(Article article);
    int del(Article article);
    int update(Article article);

    Article findOneById(Serializable id);
    List<Article> findAll();
    List<Article> findAllNew();

    /**
     * 分页查询
     * @param offset
     * @param limit
     * @return
     */
    List<Article> findAllPublish(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 获得总记录数
     * @return
     */
    int getAllCount();

    List<Article> getAllArticleDateCount();
}
