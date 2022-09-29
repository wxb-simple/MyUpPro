package com.simple.myapplication.template_method.exp1;

import com.simple.myapplication.JLog;
/**
 * 由应用程序开发人员编写，属于变化类
 * 在 Application中实现 step2(),step4()
 */
public class Application extends Lib {
    @Override
    protected void step2() {// 变化
        JLog.e(this.getClass().toString(),"step2");
    }

    @Override
    protected void step4() {// 变化
        JLog.e(this.getClass().toString(),"step4");
    }
}
