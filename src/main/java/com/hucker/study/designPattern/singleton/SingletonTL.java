package com.hucker.study.designPattern.singleton;

public class SingletonTL {
    private static SingletonTL instance = null;

    private SingletonTL(){

    }
    public static SingletonTL getInstance(){
        if (instance == null){
            initInstance();
        }
        return instance;
    }

    private static synchronized void initInstance(){
        if (instance == null){
            instance = new SingletonTL();
        }
    }


}
