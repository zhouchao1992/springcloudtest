package com.zc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class User2Application {
    public static void main(String[] args) {
        SpringApplication.run(User2Application.class, args);
    }

}
