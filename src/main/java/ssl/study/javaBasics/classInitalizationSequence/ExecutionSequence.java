package com.supconit.study.JavaBasics.classInitalizationSequence;

/**
 * 1.父类静态成员和静态初始化块，顺序执行
 * 2.子类静态成员和静态初始化块，顺序执行
 *
 * 3.父类实例成员和实例初始化块，顺序执行
 * 4.执行父类构造方法
 * 5.子类实例成员和实例初始化块，顺序执行
 * 6.执行子类构造方法
 *
 * 1.静态块
 * 2.构造块
 * 3.构造方法
 */
public class ExecutionSequence {

    static int cnt = 6;

    static {
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println("cnt = " + cnt);
    }

    static {
        cnt /= 3;
    }
}
