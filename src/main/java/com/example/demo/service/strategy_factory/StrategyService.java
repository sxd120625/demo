package com.example.demo.service.strategy_factory;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sunxiaodong
 * @date 2019/6/26
 * @description 访问接口
 */
@Service
public class StrategyService {
    Map<String,MyStrategy> myStrategyMap = new HashMap<>();
    //@Autowired
    //List<MyStrategy> myStrategyList;
    //@PostConstruct
    //public void ervice(){
    //    for (MyStrategy myStrategy:myStrategyList){
    //        myStrategyMap.put(myStrategy.getType(),myStrategy);
    //    }
    //}

    public StrategyService(List<MyStrategy> myStrategyList){
        for (MyStrategy myStrategy:myStrategyList){
            myStrategyMap.put(myStrategy.getType(),myStrategy);
        }
    }
    public void calcute(){
        System.out.println(myStrategyMap.get("1").calcute());
    }
}
