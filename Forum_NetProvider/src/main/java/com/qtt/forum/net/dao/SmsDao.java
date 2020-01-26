package com.qtt.forum.net.dao;

import com.qtt.forum.net.Sms;
import org.apache.ibatis.annotations.Insert;

/**
 * Project name：Forum
 * Class name：SmsDao
 * description：TODO
 * date：2020/1/26 12:53
 *
 * @author ：XC
 */
public interface SmsDao {
    /**
     * 插入手机号，获取短信
     *
     * @param sms
     * @return
     */
    @Insert("insert into sms(phone, tempName, content, type, ctime) VALUES (#{phone}, #{tempName}, #{content}, #{type}, now())")
    int insert(Sms sms);
}
