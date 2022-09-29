package com.simple.myapplication.Singleton.exp1;

/**
 * 10.5.3 饿汉式、线程安全
 * 是否Lazy初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式比较常用，但容易产生垃圾对象
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载时就初始化，浪费内存
 * 它基于classloader机制避免了多线程的同步问题，不过instance在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 但在单例模式大多数都是调用getInstance()方法，但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这
 * 时候初始化instance显然没有达到lazy loading的效果。
 */
public class Singleton2 {

    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}
