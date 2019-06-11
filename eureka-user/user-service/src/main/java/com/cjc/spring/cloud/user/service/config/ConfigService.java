package com.cjc.spring.cloud.user.service.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootConfiguration
public class ConfigService {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
