package com.hucker.study.designPattern.adapter;

public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void request() {
        super.oldMethod();
    }
}
