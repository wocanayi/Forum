package com.qtt.forum.article.service;

import com.qtt.forum.article.Article;
import com.qtt.forum.vo.R;

/**
 * Project name：Forum
 * Class name：ArticleService
 * description：TODO
 * date：2020/1/26 13:54
 *
 * @author ：XC
 */
public interface ArticleService {
    /**
     *全部的帖子显示，按照时间降序排列
     * @return
     */
    R articleList();

    /**
     * 新增帖子
     * @param article
     * @return
     */
    R insert(Article article);

    /**
     * 根据帖子id删除帖子
     * @param aid
     * @return
     */
    R del(int aid);

    /**
     * 根据id修改帖子内容
     * @param article
     * @return
     */
    R update(Article article);

    /**
     * 根据id查找帖子
     * @param aid
     * @return
     */
    R findById(int aid);
}
