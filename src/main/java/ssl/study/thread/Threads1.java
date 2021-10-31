package com.supconit.study.thread;

/**
 * 在java多线程中实现多线程的方式有两种①extends Thread ②implements Runnable。
 * 这两种情况是我们最常见的，还有一种是由第二种变形而来的直接new Runnable(){}，
 * 我们都知道java的接口是不可以实例化的，但代码中的new Runnable(){xxx}确是实例化了，为什么？
 * 接口和抽象类不可以实例化是对的，这个是java语法规范来的，
 * 而new Runnable(){}其实不是实例化Runnable接口来的，实际上一种内部类的一种简写** 在这里：
 * ①首先构造了一个”implements Runnable “的无名local内部类(方法内的内部类)
 * ②然后构造了这个无名local内部类的一个实例
 * ③然后用Runnable来表示这个无名local内部类的type(OO多态)。
 * 例如上面这段代码编译后你会看到其实是编译了两个类来的，如下：
 * 其中Text2$1就是无名local内部内类，这个也就很好地解释了为什么在main（）方法中new Runnable(){xxx}里面的
 * 调用main()方法中的变量的时候要用final关键字来修饰
 */
public class Threads1 {
    public static void main(String[] args) {
        new Threads1().go();
    }

    public void go(){
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
