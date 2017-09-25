package cn.tj212.service;

import cn.tj212.entity.Article;
import cn.tj212.entity.DateCount;

import java.util.List;

public interface ArticleService extends BaseService<Article>{
       void add(Article article) throws Exception;

    List<Article> findAll(int pageNum, int pageSize);

    List<Article> findAllPublish(int pageNum, int pageSize);

    /**
     * 获得总记录条数
     * @return
     */
    int getAllCount();

    List<Article> findAllNew();

    /**
     * 查询所有日期的归档
     * @return
     */
    List<DateCount> findAllPostDate();
}
