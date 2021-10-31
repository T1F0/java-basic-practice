package com.supconit.study.JavaBasics.basicDataType.string;

import java.util.Arrays;

public class JudgeStringHas {
    public static void main(String[] args) {
        String str = "hello.world";
        System.out.println(str.indexOf("."));
        System.out.println(str.indexOf("\\."));
        System.out.println(Arrays.toString(str.split("\\.")));
        //为什么不行呢
        System.out.println(Arrays.toString(str.split(".")));
        System.out.println(Arrays.toString(str.split("o")));
    }
}
