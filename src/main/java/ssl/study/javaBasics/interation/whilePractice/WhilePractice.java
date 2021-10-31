package com.supconit.study.JavaBasics.whilePractice;

public class WhilePractice {
    public static void main(String[] args) {
        int a = 1;
        //if是当判断为真，只执行一次
        if (a==1){
            System.out.println("吃包子");
        }else if (a==2){
            System.out.println("吃馒头");
        }else {
            System.out.println("随便吃");
        }
        //while是当判断为真，开始循环执行
        while (a==14){
            System.out.print("吃火锅");
        }
        //do{}while()是先执行循环体，再按照判断条件判断是否循环
        do {
            a = 13;
            System.out.println("吃水饺");
        }while (a==13);
    }
}
