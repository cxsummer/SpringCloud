package com.cjc.spring.cloud.points.action;

import com.cjc.spring.cloud.points.service.feign.UserMessageFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserPointsControl {

    @Value("${base-name}")
    private String foo;

    @Autowired
    private UserMessageFeign UserMessage;

    @RequestMapping("/getUserPoints")
    public  String getUserPoints(){
        return "feign："+UserMessage.getUserMessage();
    }

    @RequestMapping("/getPoints")
    public  String getPoints(){
        return "your Points";
    }

    @RequestMapping("/getConfig")
    public String getConfig(){

        return foo+"--"/*+userPoints.getPoints()*/;
    }
}
