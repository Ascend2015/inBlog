package cn.tj212.service;

import cn.tj212.dao.ArticleDao;
import cn.tj212.entity.Article;
import cn.tj212.entity.DateCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public void add(Article article) throws Exception{

    }

    public List<Article> findAll(int pageNum, int pageSize) {
        return null;
    }

    public List<Article> findAllPublish(int pageNum, int pageSize) {
        int start=pageNum-1;
        List<Article> articles=articleDao.findAllPublish(start*pageSize+1,pageSize);
        return articles;
    }

    public int getAllCount() {
        return 0;
    }

    public List<Article> findAllNew() {
        return null;
    }

    public List<DateCount> findAllPostDate() {
        List<Article> articleList=new ArrayList<Article>();//创建日期归档的数据集合
        if (null!=articleDao.getAllArticleDateCount()&&!articleDao.getAllArticleDateCount().isEmpty()){
            //由dao层获取文章日期和ID的集合不为空的话，将数据读入缓存列表中，以免多次访问数据库
            articleList.addAll(articleDao.getAllArticleDateCount());
            //创建一个日期归档的集合，其格式要符合json规范
            List<DateCount> myDateCount=new ArrayList<DateCount>();
        }
        return null;
    }
}
