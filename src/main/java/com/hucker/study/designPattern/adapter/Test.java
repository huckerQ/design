package com.hucker.study.designPattern.adapter;

public class Test {

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();

        Target target1 = new ObjectAdapter();
        target1.request();
    }
}
