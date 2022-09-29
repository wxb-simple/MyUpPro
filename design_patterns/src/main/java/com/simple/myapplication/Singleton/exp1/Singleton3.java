package com.simple.myapplication.Singleton.exp1;

import com.simple.myapplication.JLog;

/**
 * 双检锁/双重校验锁（DCL 即double-checked locking）
 * JDK版本：JDK1.5起
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式才用双锁机制，安全且多线程的情况下能保证高性能
 *
 * 这种方法必须使用 volatile 关键字，保证对象创建过程指令不会reorder
 */
public class Singleton3 {

    private static volatile Singleton3 instance;

    private void Singleton3(){
    }

    public static Singleton3 getInstance(){
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
