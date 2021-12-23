package com.light.cloud.clientb.rest;

import com.light.cloud.api.service.SimpleDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * <h3>demo1</h3>
 *
 * @author : ck
 * @date : 2021-12-23 17:54
 **/
@RestController
@RequestMapping("simple")
public class SimpleRest {
    @DubboReference
    private SimpleDubboService simpleDubboService;
    @GetMapping("test")
    public Mono<String> test(@RequestParam("para") String para){
        return Mono.just(simpleDubboService.simpleRest(para));
    }
}
