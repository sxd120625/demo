package com.example.demo.service.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description redis
 */
@Service
@Order(2)
public class UpdateRedis implements ApplicationListener<MyTestEvent> {
    @Override
    public void onApplicationEvent(MyTestEvent myTestEvent) {
        System.out.println("UpdateRedis");
    }
}
