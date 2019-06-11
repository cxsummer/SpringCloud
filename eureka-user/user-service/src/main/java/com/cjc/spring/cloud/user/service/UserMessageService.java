package com.cjc.spring.cloud.user.service;

import org.springframework.stereotype.Service;

@Service
public class UserMessageService {
    public String getUserMessage(){
        return "你好阳光";
    }
}
