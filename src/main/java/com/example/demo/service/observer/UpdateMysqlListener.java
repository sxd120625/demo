package com.example.demo.service.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description dscd
 */
@Service
@Order(10)
@Async
public class UpdateMysqlListener implements ApplicationListener<MyTestEvent> {
    private int sds = 120;
    @Override
    public void onApplicationEvent(MyTestEvent myTestEvent) {
        System.out.println("UpdateMysql");
    }
}
