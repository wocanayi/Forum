package com.qtt.forum.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Project name：Forum
 * Class name：Article
 * description：TODO
 * date：2020/1/25 14:36
 *
 * @author ：XC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Integer id;
    private String title;
    private String description;
    private String author;
    private String content;
    private String contentFormat;
    private Integer readNum;
    private Integer commentNum;
    private Integer likeNum;
    private Integer coverType;
    private String cover;
    private Date createTime;
    private Date updateTime;
    private String recommend;
    private String categoryId;
    private String publish;
    private String top;
}
