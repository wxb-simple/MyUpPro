package com.simple.myapplication;

public final class JLog {

    private JLog() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isDebug = true;// 是否需要打印bug，可以在application的onCreate函数里面初始化
    private static final String TAG = "TTTTTTTT";
    private static final String PRE = "========";

    // 下面四个是默认tag的函数
    public static void i(String msg) {
        if (isDebug)
            System.out.print(TAG + PRE + msg);
    }

    public static void d(String msg) {
        if (isDebug)
            System.out.print(TAG + PRE + msg);
    }

    public static void e(String msg) {
        if (isDebug)
            System.out.print(TAG + PRE + msg + "\n");
    }

    public static void v(String msg) {
        if (isDebug)
            System.out.print(TAG + PRE + msg);
    }

    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg) {
        if (isDebug)
            System.out.print(tag + PRE + msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug)
            System.out.print(tag + PRE + msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug)
            System.out.print(tag + PRE + msg + "\n");
    }

    public static void v(String tag, String msg) {
        if (isDebug)
            System.out.print(tag + PRE + msg);
    }
}
