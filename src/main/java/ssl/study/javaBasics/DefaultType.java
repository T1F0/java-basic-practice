package com.supconit.study.JavaBasics;

/**
 * java基本数据类型的默认值
 * 以及相应数组的默认值
 */
public class DefaultType {
    int[] i;
    String[] s;
    char[] c;
    float[] f;
    boolean[] b;
    Dog dog;
    public static void main(String[] args) {
        DefaultType d = new DefaultType();
        System.out.println(d.i);
        System.out.println(d.s);
        System.out.println(d.c);
        System.out.println(d.f);
        System.out.println(d.b);
//        System.out.println(d.dog);
    }
}

class Dog{
  int age = 1;
}
