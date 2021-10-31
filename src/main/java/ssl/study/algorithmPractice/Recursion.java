package com.supconit.study.algorithmPractice;

public class Recursion {
    public static int i = 1;
    public static void main(String[] args) {
        int result = foo(6);
        System.out.println("最终结果是" + result);
    }
    static int foo(int n) {
        System.out.println(i++);
        if (n<2) return n;
        return foo(n-1)+foo(n-2);
    }
}
