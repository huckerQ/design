package com.hucker.study.designPattern.abstractFactory.factory;

import com.hucker.study.designPattern.abstractFactory.product.CheeryKeyboard;
import com.hucker.study.designPattern.abstractFactory.product.CheeryMouse;
import com.hucker.study.designPattern.abstractFactory.product.KeyboardProduct;
import com.hucker.study.designPattern.abstractFactory.product.MouseProduct;

public class CheeryFactory implements AbstractFactory {
    @Override
    public KeyboardProduct produceKeyboard() {
        return new CheeryKeyboard();
    }

    @Override
    public MouseProduct produceMouse() {
        return new CheeryMouse();
    }
}
