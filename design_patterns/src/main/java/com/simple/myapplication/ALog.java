package com.simple.myapplication;

import android.util.Log;

public final class ALog {

    private ALog() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isDebug = true;// 是否需要打印bug，可以在application的onCreate函数里面初始化
    private static final String TAG = "TTTTTTTT";
    private static final String PRE = "========";

    // 下面四个是默认tag的函数
    public static void i(String msg) {
        if (isDebug)
            Log.i(TAG, PRE+msg);
    }

    public static void d(String msg) {
        if (isDebug)
            Log.d(TAG, PRE+msg);
    }

    public static void e(String msg) {
        if (isDebug)
            Log.e(TAG,PRE+ msg);
    }

    public static void v(String msg) {
        if (isDebug)
            Log.v(TAG,PRE+ msg);
    }

    // 下面是传入自定义tag的函数
    public static void i(String tag, String msg) {
        if (isDebug)
            Log.i(tag,PRE+ msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug)
            Log.i(tag,PRE+ msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug)
            Log.i(tag,PRE+ msg);
    }

    public static void v(String tag, String msg) {
        if (isDebug)
            Log.i(tag,PRE+ msg);
    }
}
