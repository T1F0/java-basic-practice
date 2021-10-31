package com.supconit.study.timeTask;

import java.util.Date;
import java.util.TimerTask;

public class TimerTest03 {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date.getTime());
//        System.out.println(Math.abs(-1514));
//        System.out.println(Long.MAX_VALUE);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.print("定时器执行");
            }
        };

        task.run();
    }
}
