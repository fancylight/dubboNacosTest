package com.light.cloud.clientb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h3>demo1</h3>
 *
 * @author : ck
 * @date : 2021-12-23 17:52
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationB {
    public static void main(String[] args) {
        new SpringApplication(ApplicationB.class).run(args);
    }
}
