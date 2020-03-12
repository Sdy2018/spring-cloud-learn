package com.adeng1024.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

//访问的格式/{application}/{profile}[/{label}]
///{application}-{profile}.yml
///{label}/{application}-{profile}.yml
///{application}-{profile}.properties
///{label}/{application}-{profile}.properties
// label 分支 application 开发环境 profile 文件名

/**
 * 可以通过
 * localhost:5001/cloud-{dev||test}.yml 访问
 * **/
public class SpringConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigApplication.class, args);
    }

}
