package com.hucker.study.designPattern.abstractFactory.factory;

import com.hucker.study.designPattern.abstractFactory.product.KeyboardProduct;
import com.hucker.study.designPattern.abstractFactory.product.MouseProduct;

public interface AbstractFactory {

    KeyboardProduct produceKeyboard();
    MouseProduct produceMouse();
}
