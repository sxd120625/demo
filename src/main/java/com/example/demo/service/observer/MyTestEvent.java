package com.example.demo.service.observer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description 观察者模式测试
 */
public class MyTestEvent extends ContextRefreshedEvent {
    public MyTestEvent(ApplicationContext source) {
        super(source);
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
