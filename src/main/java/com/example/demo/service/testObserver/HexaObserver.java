package com.example.demo.service.testObserver;

/**
 * @author sunxiaodong
 * @date 2019/6/27
 * @description
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
