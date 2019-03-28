package com.hucker.study.designPattern.factoryMethod;

import com.hucker.study.designPattern.factoryMethod.factory.Provider;
import com.hucker.study.designPattern.factoryMethod.factory.SendMailFactory;
import com.hucker.study.designPattern.factoryMethod.product.Sender;

public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
