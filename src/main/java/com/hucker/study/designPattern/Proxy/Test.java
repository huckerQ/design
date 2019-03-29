package com.hucker.study.designPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        SubjectInterface subjectInterface = new SubjectImpl();
        InvocationHandler handler = new DynamicProxy(subjectInterface);
        SubjectInterface subject = (SubjectInterface) Proxy.newProxyInstance(subjectInterface.getClass().getClassLoader(),
                subjectInterface.getClass().getInterfaces(),
                handler);
        subject.print();

    }
}
