package com.hucker.study.designPattern.abstractFactory;

import com.hucker.study.designPattern.abstractFactory.factory.AbstractFactory;
import com.hucker.study.designPattern.abstractFactory.factory.CheeryFactory;
import com.hucker.study.designPattern.abstractFactory.factory.DuckyFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new CheeryFactory();
        factory.produceKeyboard().product();
        factory.produceMouse().product();
        factory = new DuckyFactory();
        factory.produceMouse().product();
        factory.produceKeyboard().product();
    }
}
