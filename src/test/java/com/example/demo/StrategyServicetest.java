package com.example.demo;

import com.example.demo.service.strategy_factory.StrategyService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description 访问接口
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyServicetest {
    @Autowired
    StrategyService strategyService;

    @Test
    public void calcute() {
        strategyService.calcute();
    }

}
