package com.qtt.forum.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Project name：Forum
 * Class name：ServerApplication
 * description：TODO
 * date：2020/1/25 15:44
 *
 * @author ：XC
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        System.out.println("Server………………");
    }
}
