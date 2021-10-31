package com.supconit.study.JavaBasics;

public class Compute {
    public static void main(String[] args) {
        int i = -5;
        //++或--里面的内容只能是变量，不能是表达式
        i = ++(i);
//        i = ++(i++);
        System.out.println(i);
    }
}
