package com.example.demo.service.testObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxiaodong
 * @date 2019/6/27
 * @description 主题
 */
public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
