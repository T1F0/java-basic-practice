package com.supconit.study.timeTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest01 {
        public void timerRun() {
            // 一天的毫秒数
            long daySpan = 24 * 60 * 60 * 1000;
            // 规定的每天时间15:33:30运行
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd 09:16:00");
            // 首次运行时间
            try {
                Date startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdf.format(new Date()));
                // 如果今天的已经过了 首次运行时间就改为明天
                if (System.currentTimeMillis() > startTime.getTime()){
                    startTime = new Date(startTime.getTime() + daySpan);
                }
                Timer t = new Timer();
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        System.out.print("定时器执行");
                    }
                };
                // 以每24小时执行一次
                t.schedule(task, startTime, daySpan);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            new TimerTest01().timerRun();
        }
}
