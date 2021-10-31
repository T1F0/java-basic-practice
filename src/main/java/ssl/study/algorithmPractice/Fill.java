package com.supconit.study.algorithmPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * 功能：将输入的字符串补充为长度为8整数倍且最短的字符串，没有的位数补充0
 * 如：123 --> 12300000
 * 123456789 --> 1234567890000000
 * 青山常伴绿水 --> 青山常伴绿水00
 *
 */
public class Fill {
    public static void main(String[] args) {
        //将输入的字符串转换成数组strings
        Scanner input = new Scanner(System.in);
        String string = input.next();
        String[] strings = string.split("");
        //新建新数组newStrings
        int newStringsLength = strings.length % 8 == 0 ? strings.length : strings.length - strings.length%8 + 8;
        String[] newStrings = new String[newStringsLength];
        //根据旧数组的内容填充新数组
        for (int i = 0; i < newStringsLength/8; i++) {
            for (int j = 0; j < 8; j++) {
                if (8 * i + j < strings.length) {
                    newStrings[8 * i + j] = strings[8 * i + j];
                }else {
                    newStrings[8 * i + j] = "0";
                }
            }
        }
        //將数组转化为字符串
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < newStringsLength; i++) {
            result.append(newStrings[i]);
        }
        System.out.println(result);
    }
}
