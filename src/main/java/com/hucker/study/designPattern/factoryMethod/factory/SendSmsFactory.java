package com.hucker.study.designPattern.factoryMethod.factory;

import com.hucker.study.designPattern.factoryMethod.product.Sender;
import com.hucker.study.designPattern.factoryMethod.product.SmsSender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
