package com.supconit.study.timeTask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerThread {

    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.print("定时器执行");
        }
    };
    public static void main(String[] args) {
        TimerTask task = (new TimerThread()).task;
        task.run();
    }
}
