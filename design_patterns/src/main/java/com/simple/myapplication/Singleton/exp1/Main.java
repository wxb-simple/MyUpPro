package com.simple.myapplication.Singleton.exp1;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton4 singleton4 = Singleton4.getInstance();
        Singleton5 singleton5 = Singleton5.getInstance();
        //枚举类单例
        Singleton6.whateverMethod();
        Singleton6 singleton6 = Singleton6.getInstance();
    }
}
