package com.adeng1024.cloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication8001.class, args);
    }

}
