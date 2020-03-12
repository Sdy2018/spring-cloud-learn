package com.adeng1024.cloud.eureka.client.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/")
    public String test(){
        return "test8001";
    }
    @GetMapping("/test/{num}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public String test2(@PathVariable("num") Integer num){
        if(num==2){
            throw  new RuntimeException("ok");
        }
        return num+"正常";
    }
    //熔断的方法
    public String hystrixGet(@PathVariable("num") Integer num){
        return num+"不存在";
    }

}
