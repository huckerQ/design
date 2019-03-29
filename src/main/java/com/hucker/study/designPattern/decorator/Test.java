package com.hucker.study.designPattern.decorator;

public class Test {
    public static void main(String[] args) {

        OldInterface oldInterface = new Decorator(new OldInterfaceImpl());
        oldInterface.old();
    }
}
