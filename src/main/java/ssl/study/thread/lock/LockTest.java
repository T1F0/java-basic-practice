package com.supconit.study.thread.lock;

/**
 * 一个简单的锁:
 * 如果线程1抢到了方法中的锁，并且休眠（sleep），那么其他线程在调用这个方法时，
 * 在锁释放之前处于等待状态，这个状态默认CPU是不执行的。
 */
public class LockTest {
   public static class MyThread implements Runnable {
       Object obj = new Object();
       public void run() {
           System.out.println( Thread.currentThread().getName() + "run prepare");
           synchronized(obj) {// obj锁
               System.out.println( Thread.currentThread().getName() + "run start");
               doSomething(); // this锁
           }
       }

       public void doSomething() { // this锁
           System.out.println(Thread.currentThread().getName() + "doSomething start");
           try {
               Thread.sleep(15000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           synchronized(obj) { // obj锁
               System.out.println(Thread.currentThread().getName() + "doSomething synchronized");
           }
       }
   }

   public static void main(String[] args) {
       MyThread t = new MyThread();
       Thread th = new Thread(t);
       Thread th2 = new Thread(t);
       th.start();
       th2.start();
   }
}
