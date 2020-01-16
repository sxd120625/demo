package com.example.demo.service.strategy_factory;

import org.springframework.stereotype.Service;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description redis
 */
@Service
public class Strategy2 implements MyStrategy {
    int sdf = 200;
    @Override
    public String getType() {
        return "2";
    }

    @Override
    public Double calcute() {
        return 200.0;
    }
}
