package com.hucker.study.designPattern.factoryMethod.product;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send Sms");
    }
}
