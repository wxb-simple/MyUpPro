package com.simple.myapplication.Singleton.exp1;

import com.simple.myapplication.JLog;

/**
 * JDK版本：JDK1.5起
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种实现方式还没有被完全广泛采用，但是这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次
 * 实例化。
 * 这种方式是Effective Java作者Josh Bloch提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化
 * 重新创建新的对象，绝对防止多次实例化。不过，由于JDK1.5之后才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，
 * 也很少用。不能通过reflection attack来调用私有构造方法。
 */
public enum Singleton6 {
    INSTANCE;
    Singleton6() {
        JLog.e("INSTANCE will be initialized immediately");
    }
    public static void whateverMethod(){
        JLog.e("调用该方法主动使用单例");
    }
    public static Singleton6 getInstance() {
        return INSTANCE;
    }
}
