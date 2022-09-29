package com.simple.myapplication.template_method.exp1;

import com.simple.myapplication.JLog;

/**
 * Lib 由框架开发人员编写，属于稳定类
 * 实现了step1(),step3(),step5()
 */
public abstract class Lib {
    private void step1(){// 稳定
        //...
        JLog.e(this.getClass().toString(),"step1");
    }
    // step2、step4 类似 C++ 的虚函数，等待子类重写
    protected abstract void step2();// 变化

    private void step3(){// 稳定
        JLog.e(this.getClass().toString(),"step3");
    }
    // step2、step4 类似 C++ 的虚函数，等待子类重写
    protected abstract void step4();// 变化

    private void step5(){// 稳定
        JLog.e(this.getClass().toString(),"step5");
    }
    /**
     *  template method （run体现）
     *  揭示了绝大部分设计模式的 “稳定中有变化”的特点
     *  Template method 使用前提是 run必须稳定
     */
    public void run(){
        step1();
        step2();
        step3();
        step4();
        step5();
    }

}
