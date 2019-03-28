package com.hucker.study.designPattern.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonTL tl = SingletonTL.getInstance();
        SingletonTL tl2 = SingletonTL.getInstance();
        System.out.println(tl == tl2);
    }
}
