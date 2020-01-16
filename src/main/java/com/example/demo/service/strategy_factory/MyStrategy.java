package com.example.demo.service.strategy_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description 策略
 */
public interface MyStrategy {

    String getType ();


    Double calcute();
}
