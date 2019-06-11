package com.cjc.spring.cloud.user.service.feign;

import com.cjc.spring.cloud.user.service.hystrix.UserPointsHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-points",fallback = UserPointsHystrix.class)
public interface UserPointsFeign {
    @RequestMapping("/getPoints")
    public  String getPoints();
}
