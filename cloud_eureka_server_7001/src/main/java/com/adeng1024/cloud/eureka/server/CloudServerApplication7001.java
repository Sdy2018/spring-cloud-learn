package com.adeng1024.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudServerApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudServerApplication7001.class, args);
    }

}
