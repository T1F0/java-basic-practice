package com.supconit.study.JavaBasics.switchPratice;

import java.util.Scanner;

public class SwitchPractice2 {

    public static void main(String[] args) {
        System.out.println("请输入诗词的前半句：");
        Scanner input = new Scanner(System.in);
        String firstHalfOfSentence = input.next();
        //case穿透
        switch(firstHalfOfSentence) {
            case "采菊东篱下": System.out.println("悠然见南山");
            break;
            case "问君能有几多愁": System.out.println("恰似一江春水向东流");
            break;
            case "君不见高堂明镜悲白发":  System.out.println("朝如青丝暮成雪");
//            break;//只要是没有break;就会发生case穿透
            case "古道西风瘦马":  System.out.println("夕阳西下，断肠人在天涯");
            break;
            default: System.out.println("小包子查询不到下一句哦");
        }
    }
}
