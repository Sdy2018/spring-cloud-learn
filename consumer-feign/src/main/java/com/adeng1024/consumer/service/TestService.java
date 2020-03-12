package com.adeng1024.consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "eurekaClient")
//feign底层还是Ribbon,只是自己封装了一层,看起来还是向接口编程
public interface TestService {
    @GetMapping("/")
    public String test();
    @GetMapping("/test/{num}")
    public String test2(@PathVariable("num")Integer num);
}
