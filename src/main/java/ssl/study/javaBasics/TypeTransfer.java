package com.supconit.study.JavaBasics;

public class TypeTransfer {
    public static void main(String[] args) {
        //为什么可以呢
        Boolean x = null;
        long l = 2;
//        double d = 1.0d;
//        byte b = 128
        byte b = 1;
        short s = 1;
        int i = 0;
        float f = 0.23f;
        double d = 0.263;
        char c = 1;
        i = b;
        b = (byte) i;
        d = f;
        i = c;

    }
}
