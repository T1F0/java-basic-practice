package com.supconit.study.timeTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeTest {
    public static void main(String[] args) {
            Timer timer = new Timer();


            //以String类型定义时间参数
            SimpleDateFormat realDateFormat = new SimpleDateFormat("2021-10-12 18:42:37");
        try {
            // 获得SimpleDateFormat类，转换为yyyy-MM-dd HH:mm:ss的时间格式，
            // 使用SimpleDateFormat的parse()方法将String转换为Date类型
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(realDateFormat.format(new Date()));
            TimerTask timerTask = new TimerTask() {
                int i = 0;
                @Override
                public void run() {
                    i++;
                    System.out.println(i);
                }
            };
            timer.scheduleAtFixedRate(timerTask, date, 10000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
