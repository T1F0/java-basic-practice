package com.supconit.study.generationAlgorithm.dataDisplay;

public class DataVisualization {
    //数据可视化
    public void dataDisplay(int number) {
        for (int i = 0; i < number/10; i++) {
            System.out.print("-");
        }
        System.out.println(number);
    }
}
