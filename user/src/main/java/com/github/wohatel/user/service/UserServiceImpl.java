package com.github.wohatel.user.service;


import com.github.wohatel.common.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Component
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "this is userService";
    }


    public static void main(String[] args) {
        String a = "1";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
               String ab = "2"+a;
            }
        });
    }
}
