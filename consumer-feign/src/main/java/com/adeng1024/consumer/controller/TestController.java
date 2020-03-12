package com.adeng1024.consumer.controller;


import com.adeng1024.consumer.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @RequestMapping("/consumer")
    public  String test(){
        return testService.test();
    }
    @RequestMapping("/consumer/test/{num}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public  String test2(@PathVariable("num") Integer num)
    {
        return testService.test2(num);
    }
    //做ribbon的服务降级
    public String hystrixGet(@PathVariable("num") Integer num) {
        return "服务已经关闭";
    }
}
