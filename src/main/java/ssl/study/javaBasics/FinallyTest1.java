package com.supconit.study.JavaBasics;

/**
 * 考察的是try中的return和finally中的程序执行的顺序:
 * 先输出，再return
 */
public class FinallyTest1 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int a = 20;
        try {
            return a + 25;
        }catch (Exception e) {
            System.out.println("test catch Exception");
        }finally {
            System.out.println(a + "");
            a = a + 10;
        }
        return a;
    }
}
