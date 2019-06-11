package com.cjc.spring.cloud.zuul.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ApplicationMain {
    public  static void main(String arg[]){
        SpringApplication.run(ApplicationMain.class);
    }
}
