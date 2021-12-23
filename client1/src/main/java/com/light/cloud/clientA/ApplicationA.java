package com.light.cloud.clientA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <h3>demo1</h3>
 *
 * @author : ck
 * @date : 2021-12-23 16:55
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationA {
    public static void main(String[] args) {
        new SpringApplication(ApplicationA.class).run(args);
    }
}
