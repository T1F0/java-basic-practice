package com.supconit.study;

public class BasicType {
    static int arr[] = new int[5];
    static byte b;
    static short s;

    static int i;
    static int i1 = s;
    //自动装箱只能装对应的基本类型
    static Integer I = (int)s;

    static long l;
    static float floatInitialValue;
    static float f = 45.0f;

    static double d = 100;
    //自动装箱只能装对应的基本类型
    static Double D = 100.0;

    static boolean bo;
    static char charInitialValue;
    static char c = '\u0639';
    static Object object = 'd';

    static String S = "helloworld\0";


    public static void main(String[] args) {
        System.out.println(arr[0]);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bo);
        System.out.println("c =" + c);
        System.out.println(object);
        System.out.println(S);

    }
}
