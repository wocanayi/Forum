package com.qtt.forum.article;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Project name：Forum
 * Class name：Like
 * description：TODO
 * date：2020/1/25 14:49
 *
 * @author ：XC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Like {
    private Integer id;
    private Integer uid;
    private Integer aid;
    private Date ctime;
}
