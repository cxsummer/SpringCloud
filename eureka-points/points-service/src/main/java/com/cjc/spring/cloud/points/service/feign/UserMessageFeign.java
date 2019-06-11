package com.cjc.spring.cloud.points.service.feign;

import com.cjc.spring.cloud.points.service.hystrix.UserMessageHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-user",fallback = UserMessageHystrix.class)
public interface UserMessageFeign {
    @RequestMapping("/getUserMessage")
    public String getUserMessage();

}
