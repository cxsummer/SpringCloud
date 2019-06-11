package com.cjc.spring.cloud.user.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.cjc.spring.cloud.user",excludeName = "com.cjc.spring.cloud.user.service.feign")
@EnableFeignClients(basePackages = "com.cjc.spring.cloud.user.service.feign")
@EnableEurekaClient
@EnableHystrixDashboard
@EnableCircuitBreaker
public class ApplicationMain {
    public static void  main(String arg[]){
        SpringApplication.run(ApplicationMain.class);
    }
}
