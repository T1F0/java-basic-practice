package com.supconit.study.JavaBasics.string;

/**
 * 考察的是indexOf方法，如果indexOf方法传递的字符或者是其他的类型，如果这些字符串是存在于母字符串中的，那么就返回
 * 第一个字符的下标，如果这些字符串不存在于母字符串中，那么就会返回-1
 */
public class TestStringIndexOf {
    public static void main(String[] args) {
        String str = "Hello World, Hello China, Hello";
        int index = str.indexOf("China, ");
        if (index == -1) {
            System.out.println("查找的字符不存在");
        } else {
            System.out.println("index的值是" + index);
        }
    }
}
