package com.supconit.study.overload;

/**
 * 重载:
 * 1.在同一个类中，允许存在一个以上的同名方法;
 * 2.两个同名方法的参数列表（参数个数或者参数类型）不同即可；
 * 注意：
 * 与返回值类型无关
 * 调用时，根据方法参数列表的不同来区别。
 */
public class Overload {

    public void test(String name) {};
    //可以进行重载
    public void test(StringBuffer name) {};
    //方法名不一样，根本不算重载
    public void Test(String name) {};
}
