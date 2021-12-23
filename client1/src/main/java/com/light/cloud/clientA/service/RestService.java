package com.light.cloud.clientA.service;


import com.light.cloud.api.service.SimpleDubboService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * <h3>demo1</h3>
 *
 * @author : ck
 * @date : 2021-12-23 16:58
 **/
@DubboService
public class RestService implements SimpleDubboService {
    @Value("${spring.application.name}")
    private String app;
    @Override
    public String simpleRest(String name) {
        return name+"--------->"+app;
    }
}
