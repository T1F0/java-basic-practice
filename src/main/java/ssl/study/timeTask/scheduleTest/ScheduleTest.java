package com.supconit.study.timeTask.scheduleTest;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {

    @Scheduled(cron = "0/1 * * * * ? ")
    public void test() throws Exception{
        System.out.println("helloWorld");
    }

}
