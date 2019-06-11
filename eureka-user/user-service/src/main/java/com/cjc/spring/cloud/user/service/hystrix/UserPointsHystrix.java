package com.cjc.spring.cloud.user.service.hystrix;

import com.cjc.spring.cloud.user.service.feign.UserPointsFeign;
import org.springframework.stereotype.Service;

@Service
public class UserPointsHystrix implements UserPointsFeign {
    @Override
    public String getPoints() {
        return "短路器熔断，请求降级";
    }
}
