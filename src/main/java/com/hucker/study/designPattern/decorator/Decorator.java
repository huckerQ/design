package com.hucker.study.designPattern.decorator;

public class Decorator implements OldInterface {
    OldInterface oldInterface;

    public Decorator(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    @Override
    public void old() {
        System.out.println("this is decorate method");
        oldInterface.old();
    }
}
