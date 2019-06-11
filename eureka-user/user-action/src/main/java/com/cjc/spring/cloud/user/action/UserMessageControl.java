package com.cjc.spring.cloud.user.action;

import com.cjc.spring.cloud.user.service.UserMessageService;
import com.cjc.spring.cloud.user.service.feign.UserPointsFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class UserMessageControl {

    @Value("${server.port}")
    private String port;

    @Value("${base-name}")
    private String foo;

    @Autowired
    private UserPointsFeign userPoints;
    @Autowired
    private UserMessageService userMessageService;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUserMessage")
    public String getUserMessage(){
        return port+":"+userMessageService.getUserMessage();
    }

    @RequestMapping("/getConfig")
    public String getConfig(){
        return foo+"--"+userPoints.getPoints();
    }

}
