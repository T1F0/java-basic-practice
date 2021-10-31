package com.supconit.study.JavaBasics.ByteTest;

public class ByteRange {
    public static void add (Byte b){
        b = b++;
    }
    public static void main(String[] args){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a + " ");
        add(b);
        System.out.println(b + "");
    }
}
