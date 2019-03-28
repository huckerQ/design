package com.hucker.study.designPattern.abstractFactory.factory;

import com.hucker.study.designPattern.abstractFactory.product.DuckyKeyboard;
import com.hucker.study.designPattern.abstractFactory.product.DuckyMouse;
import com.hucker.study.designPattern.abstractFactory.product.KeyboardProduct;
import com.hucker.study.designPattern.abstractFactory.product.MouseProduct;

public class DuckyFactory implements AbstractFactory {
    @Override
    public KeyboardProduct produceKeyboard() {
        return new DuckyKeyboard();
    }

    @Override
    public MouseProduct produceMouse() {
        return new DuckyMouse();
    }
}
