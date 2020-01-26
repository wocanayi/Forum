package com.qtt.forum.article;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Project name：Forum
 * Class name：ArticleApplication
 * description：TODO
 * date：2020/1/26 13:21
 *
 * @author ：XC
 */
@SpringBootApplication
@MapperScan("com.qtt.forum.article.dao")
@EnableDiscoveryClient
public class ArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
    }
}
