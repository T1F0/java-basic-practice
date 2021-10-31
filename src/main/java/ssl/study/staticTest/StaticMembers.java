package com.supconit.study.staticTest;

/**
 * 静态方法里面只能调用静态变量和方法,
 * 但是非静态方法可以使用静态变量和方法
 */
public class StaticMembers {
    public static int x;

    static void compute(){
        x = 5;
    }
    public static void main(String[] args) {
//        System.out.println("helloWorld" + x);
    }

    public void test(){
        compute();
    }

}
