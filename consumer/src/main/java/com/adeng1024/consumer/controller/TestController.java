package com.adeng1024.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASIC_URL_PREFIX = "http://eurekaClient/";

    @RequestMapping("/consumer")
    public  String test(){
        return restTemplate.getForObject(BASIC_URL_PREFIX, String.class);
    }
}
