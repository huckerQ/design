package com.hucker.study.designPattern.prototype;

public class Prototype implements Cloneable {
    public String a ="aaa";
    public Prototype() {
        System.out.println("burn~");
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }
}
