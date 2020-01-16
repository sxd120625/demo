package com.example.demo.service.testObserver;

/**
 * @author sunxiaodong
 * @date 2019/6/27
 * @description
 */

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
