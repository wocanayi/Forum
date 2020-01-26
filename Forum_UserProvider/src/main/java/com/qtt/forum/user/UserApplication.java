package com.qtt.forum.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Project name：Forum
 * Class name：UserApplication
 * description：TODO
 * date：2020/1/25 15:32
 *
 * @author ：XC
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.qtt.forum.user.dao")
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
