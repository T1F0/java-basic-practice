package com.supconit.study.thread;

public class ThreadRun {
    public static void main(String args[]){
        Thread pushTicket = new Thread(){
            public void run(){
                print();
            }
        };
        pushTicket.run();
        System.out.print("MT");
    }
    static void print(){
        System.out.print("DP");
    }
}
