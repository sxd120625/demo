package com.example.demo.service.testObserver;

/**
 * @author sunxiaodong
 * @date2019/6/27
 * @description
 */
public abstract class Observer {
    protected  Subject subject;
    public abstract void update();

}
