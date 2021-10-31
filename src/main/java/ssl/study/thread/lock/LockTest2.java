package com.supconit.study.thread.lock;


/**
 * 死锁产生的条件
 * 1，多线程
 * 2，多个锁
 * 3，锁嵌套
 *  线程1使用A锁，释放A锁的条件是拿到B锁；
 *  线程2使用B锁，释放B锁的条件是拿到A锁；
 *  并且休眠（sleep），那么其他线程在调用这个方法时，
 *  在锁释放之前处于等待状态，这个状态默认CPU是不执行的。
 */
public class LockTest2 {
   static Object objA = new Object();
   static Object objB = new Object();

   public static class MyThread implements Runnable {
       public void run() {
           System.out.println(Thread.currentThread().getName() + "，run prepare");
           synchronized (objA) {// obj锁
               System.out.println(Thread.currentThread().getName() + ",拿到objA锁");
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //不会执行，因为th2线程拿着B锁
               synchronized (objB) {
                   System.out.println(Thread.currentThread().getName() + ",拿到objB锁");
               }
           }
       }
   }

   public static class MyThread2 implements Runnable {
       public void run() {
           System.out.println(Thread.currentThread().getName() + "run prepare");
           synchronized (objB) {// obj锁
               System.out.println(Thread.currentThread().getName() + "，拿到 objB锁");
               try {
                   Thread.sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //不会执行，因为th线程拿着A锁
               synchronized (objA) {
                   System.out.println(Thread.currentThread().getName() + "，拿到 objA锁");
               }
           }
       }
   }

   public static void main(String[] args) {
       MyThread t = new MyThread();
       MyThread2 t2 = new MyThread2();
       Thread th = new Thread(t);
       Thread th2 = new Thread(t2);

       th.start();
       th2.start();
   }
}
