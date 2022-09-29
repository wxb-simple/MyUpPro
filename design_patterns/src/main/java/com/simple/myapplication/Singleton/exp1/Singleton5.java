package com.simple.myapplication.Singleton.exp1;

/**
 * 登记式/静态内部类
 * 是否Lazy初始化：是
 * 是否多线程安全：是
 * 实现难度：一般
 * 描述：这种方式能达到双检索方式一样的功效，但实现更简单，对静态域使用延迟初始化，应使用这种方式而不是双检索方式。
 * 这种方式只适用于静态域的情况，双检索方式可在实例域需要延迟初始化时使用。
 * 这种方式同样利用了classloader机制保证初始化instance时只有一个线程，它跟第二种方式不同的是：第二种方式只要Singleton
 * 类被装载了，那么instance就会被实例化（没有达到lazy loading效果），而这种方式是Singleton类被装载了，Instance不一定
 * 被初始化。因为SingletonHolder类没有被主动使用，只有通过显示调用getInstance方法时，才会显式装载SingletonHolder类，
 * 从而实例化instance。想象一下，如果实例化instance很消耗资源，所以想让他延迟加载，另一方面，又不希望在Singleton类加载
 * 时就实例化，因为不能确保Singleton类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化instance显然是不合适的，
 * 这种方式相比第二种方式就显得很合理。
 */
public class Singleton5 {

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private void Singleton5(){}

    public static Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
