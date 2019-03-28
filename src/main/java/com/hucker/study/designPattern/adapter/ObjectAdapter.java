package com.hucker.study.designPattern.adapter;

public class ObjectAdapter implements Target {

    private Adaptee adaptee;
    ObjectAdapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.oldMethod();
    }
}
