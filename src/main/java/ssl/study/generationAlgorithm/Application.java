package com.supconit.study.generationAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 遗传算法GenerationAlgorithm
 * 数组中：下标表示资源需求者的子任务，数值表示相应的资源提供者编号
 * 目标函数对应表暂时设置为下标与资源提供者编号相乘
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
