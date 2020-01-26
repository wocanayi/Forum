package com.qtt.forum.net;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Project name：Forum
 * Class name：Sms
 * description：TODO
 * date：2020/1/25 16:36
 *
 * @author ：XC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sms {
    private Integer id;
    private String phone;
    private String tempName;
    private String content;
    private Integer type;
    private Date ctime;
}
