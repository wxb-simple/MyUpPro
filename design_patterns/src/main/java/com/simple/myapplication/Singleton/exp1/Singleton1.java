package com.simple.myapplication.Singleton.exp1;

/**
 * 10.5.1 懒汉式，线程不安全
 * 是否Lazy初始化：是
 * 是否多线程安全：否
 * 实现难度：易
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁synchronized，
 * 所以严格意义上它并不算是单例模式。这种方式Lazy loading很明显，不要求线程安全，在多线程不能正常工作。
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
