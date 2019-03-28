package com.hucker.study.designPattern.factoryMethod.factory;

import com.hucker.study.designPattern.factoryMethod.product.MailSender;
import com.hucker.study.designPattern.factoryMethod.product.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
