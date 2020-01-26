package com.qtt.forum.article.service.impl;

import com.qtt.forum.article.Article;
import com.qtt.forum.article.dao.ArticleDao;
import com.qtt.forum.article.service.ArticleService;
import com.qtt.forum.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project name：Forum
 * Class name：ArticleServiceImpl
 * description：TODO
 * date：2020/1/26 13:55
 *
 * @author ：XC
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public R articleList() {
        if (null == articleDao.articleList()) {
            return R.fail("没有帖子呀。");
        } else {
            return R.ok(articleDao.articleList());
        }
    }

    @Override
    public R insert(Article article) {
        if (articleDao.insert(article) > 0) {
           return R.ok(articleDao.insert(article));
        } else {
            return R.fail("发帖失败！");
        }
    }

    @Override
    public R del(int aid) {
        if (articleDao.del(aid) > 0) {
            return R.ok("删除成功！");
        } else {
            return R.fail("删除失败！");
        }
    }

    @Override
    public R update(Article article) {
        return R.ok(articleDao.update(article));
    }

    @Override
    public R findById(int aid) {
        if (null != articleDao.findById(aid)) {
            return R.ok("未查找到该条数据！");
        } else {
            return R.ok(articleDao.findById(aid));
        }
    }
}
