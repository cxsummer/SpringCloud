package com.cjc.spring.cloud.points.service.hystrix;

import com.cjc.spring.cloud.points.service.feign.UserMessageFeign;
import org.springframework.stereotype.Service;

@Service
public class UserMessageHystrix implements UserMessageFeign {
    @Override
    public String getUserMessage() {
        return "断路器熔断1";
    }
}
