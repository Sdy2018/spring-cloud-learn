package com.adeng1024.cloud.eureka.client;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
//支持熔断处理
@EnableCircuitBreaker
//hystrix 熔断在服务端,意为某个服务发生异常后的中断处理。
public class EurekaClientApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication8001.class, args);
    }


}
