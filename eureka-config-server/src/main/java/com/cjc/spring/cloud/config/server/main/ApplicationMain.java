package com.cjc.spring.cloud.config.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ApplicationMain {
    public  static void main(String arg[]){
        SpringApplication.run(ApplicationMain.class);
    }
}
