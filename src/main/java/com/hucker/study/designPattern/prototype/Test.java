package com.hucker.study.designPattern.prototype;

public class Test {
    public static void main(String[] args) {
        Prototype p1 = new Prototype();
        try {
            Prototype p2 = p1.clone();
            p2.a="bbb";
            System.out.println(p1.a);
            System.out.println(p1.a.hashCode());
            System.out.println(p2.a);
            System.out.println(p2.a.hashCode());
            System.out.println(p1==p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
