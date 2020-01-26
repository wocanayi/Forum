package com.qtt.forum.net;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Project name：Forum
 * Class name：NetApplication
 * description：TODO
 * date：2020/1/25 16:22
 *
 * @author ：XC
 */
@SpringBootApplication
@MapperScan("com.qtt.forum.net.dao")
@EnableDiscoveryClient
public class NetApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetApplication.class, args);
    }
}
