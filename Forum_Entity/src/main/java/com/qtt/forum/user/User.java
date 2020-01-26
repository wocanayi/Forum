package com.qtt.forum.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project name：Forum
 * Class name：User
 * description：TODO
 * date：2020/1/25 14:31
 *
 * @author ：XC
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String email;
    private String salt;
    private String createUserId;
    private String createTime;
    private String status;
}
