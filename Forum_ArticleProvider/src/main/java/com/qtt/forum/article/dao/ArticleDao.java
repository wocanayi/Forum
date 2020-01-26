package com.qtt.forum.article.dao;

import com.qtt.forum.article.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project name：Forum
 * Class name：ArticleDao
 * description：TODO
 * date：2020/1/26 13:25
 *
 * @author ：XC
 */
@Repository
public interface ArticleDao {
    /**
     *全部的帖子显示，按照时间降序排列
     * @return
     */
    List<Article> articleList();

    /**
     * 新增帖子
     * @param article
     * @return
     */
    int insert(Article article);

    /**
     * 根据帖子id删除帖子
     * @param aid
     * @return
     */
    int del(int aid);

    /**
     * 修改帖子内容
     * @param article
     * @return
     */
    Article update(Article article);

    /**
     * 根据id查找帖子
     * @param aid
     * @return
     */
    Article findById(int aid);

}
