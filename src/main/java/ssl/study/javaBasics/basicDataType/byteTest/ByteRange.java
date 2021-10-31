package com.supconit.study.JavaBasics.basicDataType.byteTest;

/**
 * byte,Byte类型的数据范围是-128~127，即-2^7~2^7-1，总共有2^8个数。
 */
public class ByteRange {
    public static void add (Byte b){
        b = b++;
    }
    public static void main(String[] args){
        Byte a = 127;
        Byte b = 127;
        byte c = -128;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b + "");
    }
}
