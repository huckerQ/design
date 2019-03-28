package com.hucker.study.designPattern.factoryMethod.factory;

import com.hucker.study.designPattern.factoryMethod.product.Sender;

public interface Provider {
    Sender produce();
}
