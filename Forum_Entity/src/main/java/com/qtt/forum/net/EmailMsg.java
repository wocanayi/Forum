package com.qtt.forum.net;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Project name：Forum
 * Class name：EmailMsg
 * description：TODO
 * date：2020/1/25 16:38
 *
 * @author ：XC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailMsg {
    private Integer id;
    private String email;
    private String title;
    private String content;
    private Date ctime;
}
