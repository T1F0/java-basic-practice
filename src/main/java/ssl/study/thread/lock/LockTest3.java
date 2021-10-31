package ssl.study.thread.lock;

import java.util.LinkedList;

/**
 * 假设如下代码中，若t1线程在t2线程启动之前已经完成启动，代码的输出是
 */
public class LockTest3 {
    public static void main(String[] args) throws Exception {
        final Object obj = new Object();
        Thread t1 = new Thread() {
            public void run() {
                synchronized (obj) {
                    try {
                        obj.wait();
                        System.out.println("Thread 1 wake up");
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            public void run() {
                synchronized (obj) {
                    obj.notifyAll();
                    System.out.println("Thread 2 sent notify");
                }
            }
        };
        t2.start();
    }
}
