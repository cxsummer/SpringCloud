package com.cjc.spring.cloud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationMain {
    public static void  main(String arg[]){
        SpringApplication.run(ApplicationMain.class);
    }
}
