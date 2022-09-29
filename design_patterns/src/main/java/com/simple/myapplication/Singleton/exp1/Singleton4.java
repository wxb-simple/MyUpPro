package com.simple.myapplication.Singleton.exp1;

/**
 * 10.5.2 懒汉式、线程安全
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 * 描述：这种方式具备很好的lazy loading，能够在多线程中很好的工作，但是效率很低，99%的情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁synchronized才能保证单例，但加锁会影响效率。
 */
public class Singleton4 {

    private static Singleton4 instance;

    private void Singleton4(){}

    public static synchronized Singleton4 getInstance(){
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
