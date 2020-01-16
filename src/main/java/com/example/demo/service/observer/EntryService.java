package com.example.demo.service.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description 访问接口
 */
@Service
public class EntryService {
    @Autowired
    ApplicationContext applicationContext;
    public void test(){
        applicationContext.publishEvent(new MyTestEvent(applicationContext));
    }
}
