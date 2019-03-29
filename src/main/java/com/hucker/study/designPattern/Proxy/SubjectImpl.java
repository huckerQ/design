package com.hucker.study.designPattern.Proxy;

public class SubjectImpl implements SubjectInterface {
    @Override
    public void print() {
        System.out.println("this is subject print method");
    }
}
