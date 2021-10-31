package com.supconit.study.thread;

public class ThreadMethod {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.run();
        //优先事项; 最重要的事
        thread.getPriority();
    }
}
