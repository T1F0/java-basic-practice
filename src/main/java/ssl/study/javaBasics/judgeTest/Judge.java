package com.supconit.study.JavaBasics.judgeTest;

public class Judge {

    public static void main(String[] args) {
        int x = 9;
        //自动升级精度
        System.out.println("value is " + ((x%4 > 4) ? 99.9 : 9));
    }
}
