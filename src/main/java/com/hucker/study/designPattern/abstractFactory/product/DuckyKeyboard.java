package com.hucker.study.designPattern.abstractFactory.product;

public class DuckyKeyboard implements KeyboardProduct {
    @Override
    public void product() {
        System.out.println("get Ducky keyboard");
    }
}
