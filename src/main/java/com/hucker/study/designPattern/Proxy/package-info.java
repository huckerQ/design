package com.hucker.study.designPattern.Proxy;

/**
 *
 * 普通代理模式：
 *     角色：老接口，老实现类，代理类
 *     逻辑：代理类实现老接口，并持有老实现类实例，在实现老接口的方法内调用老实现类的实现方法（其前后可额外处理业务），客户端调用时声明代理类实例
 *     缺点：需要和老实现类一一对应
 * 动态代理模式：
 *     核心：InvocationHandle & Proxy
 *     逻辑：动态代理类需要实现InvocationHandle，并持有一个Object的实例，在重写InvocationHandle的invoke方法时 调用method的invoke方法
 *     有点：被代理类不需要事先创建。
 * */