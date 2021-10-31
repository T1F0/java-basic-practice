package com.supconit.study.interfaceTest;


/**
 * interface中有效的方法声明形式，
 * 1.public；
 * 2.缺省；
 * 3.default（java8之后加入default可以写方法体）；
 */
public interface MethodInInterface {

    //private直接报错
    //private void method();

    void method1();

    public void method2();

    //default方法不用重写，它的实现类可以直接使用
    default void method3() {
        System.out.println("可以写方法体");
    }
}
