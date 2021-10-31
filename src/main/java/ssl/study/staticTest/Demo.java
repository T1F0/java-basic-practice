package com.supconit.study.staticTest;

/**
 * 考察类的相关知识
 */
public class Demo {
    static Demo demo = new Demo();

    static int a;
    static int b = 1;

    Demo(){
        a++;
        b++;
    }

    static Demo getInstance() {
        return demo;
    }

    public static void main(String[] args) {
        Demo demo = Demo.getInstance();
        System.out.println(a +""+ b);
    }
}
