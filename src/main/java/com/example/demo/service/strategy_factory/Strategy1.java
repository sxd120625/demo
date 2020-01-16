package com.example.demo.service.strategy_factory;

import org.springframework.stereotype.Service;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description dscd
 */
@Service
public class Strategy1 implements MyStrategy {
    private int sds = 100;

    @Override
    public String getType() {
        return "1";
    }

    @Override
    public Double calcute() {
        return 100.0;
    }
}
