package com.hucker.study.designPattern.factoryMethod.product;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send mail");
    }
}
