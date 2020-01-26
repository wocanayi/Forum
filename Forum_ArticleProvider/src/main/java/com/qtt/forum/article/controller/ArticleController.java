package com.qtt.forum.article.controller;

import com.qtt.forum.article.Article;
import com.qtt.forum.article.service.ArticleService;
import com.qtt.forum.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Project name：Forum
 * Class name：ArticleController
 * description：TODO
 * date：2020/1/26 19:40
 *
 * @author ：XC
 */
@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article/listAll")
    public R list() {
        return R.ok(articleService.articleList());
    }

    @PostMapping("/article/listAll")
    public R insert(Article article) {
        return R.ok(articleService.insert(article));
    }

    @PutMapping("/article/listAll")
    public R update(Article article) {
        return R.ok(articleService.update(article));
    }

    @DeleteMapping("/article/listAll")
    public R delete(int aid) {
        return R.ok(articleService.del(aid));
    }
}
