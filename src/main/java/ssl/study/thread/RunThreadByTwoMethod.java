package com.supconit.study.thread;


import io.swagger.models.auth.In;

//import java.util.TaskQueue;

class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("我是通过实现Runnable创建的线程");
    }
}

class  MyThread2 extends Thread {

    private Integer queue;

    MyThread2(Integer queue) {
        this.queue = queue;
    }

    public void run() {
        System.out.println("我是通过继承Thread创建的线程");
    }
}

class CreateThread{
    Integer queue = 0;
    private final Thread t3 = new MyThread2(queue);
}
public class RunThreadByTwoMethod {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.run();
        CreateThread createThread = new CreateThread();
//        createThread.
    }
}
