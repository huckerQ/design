package com.hucker.study.designPattern.abstractFactory.product;

public class DuckyMouse implements MouseProduct {
    @Override
    public void product() {
        System.out.println("get Ducky mouse~!");
    }
}
