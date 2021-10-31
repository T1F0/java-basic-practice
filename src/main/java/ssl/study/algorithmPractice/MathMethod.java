package com.supconit.study.algorithmPractice;


import java.util.Scanner;

/**
 * 3的102次方结尾数字是多少
 * 4的98次方结尾数字是多少
 * Math中常用的函数
 */
public class MathMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(Math.pow(input.nextInt(), input.nextInt()));
        /**
        //在Java中一个数的N次方不可以写成：a^0这种形式，算得的数不正确；
        System.out.println(10^2);
        //计算平方根
        System.out.println(Math.sqrt(16));   //4.0
        //计算立方根
        System.out.println(Math.cbrt(8));    //2.0
        //计算a的b次方
        System.out.println(Math.pow(3,2));     //9.0
        //计算最大值
        System.out.println(Math.max(2.3,4.5));//4.5
        //计算最小值
        System.out.println(Math.min(2.3,4.5));//2.3
        //求绝对值
        System.out.println(Math.abs(-10.4));    //10.4
        System.out.println(Math.abs(10.1));     //10.1

        //ceil天花板的意思，就是返回大的值(整数)
        System.out.println(Math.ceil(-10.1));   //-10.0
        System.out.println(Math.ceil(10.7));    //11.0
        System.out.println(Math.ceil(-0.7));    //-0.0
        System.out.println(Math.ceil(0.0));     //0.0
        System.out.println(Math.ceil(-0.0));    //-0.0
        System.out.println(Math.ceil(-1.7));    //-1.0
        //floor地板的意思，就是返回小的值(整数)
        System.out.println(Math.floor(-10.1));  //-11.0
        System.out.println(Math.floor(10.7));   //10.0
        System.out.println(Math.floor(-0.7));   //-1.0
        System.out.println(Math.floor(0.0));    //0.0
        System.out.println(Math.floor(-0.0));   //-0.0

        //random 取得一个大于等于0.0且小于1.0的随机数
        System.out.println(Math.random());  //小于1大于0的double类型的数
        System.out.println(Math.random()*2);//大于0小于1的double类型的数
        System.out.println(Math.random()*2+1);//大于1小于2的double类型的数

        //rint 四舍五入，返回double值,注意.5的时候会取上下两数中的偶数
        System.out.println(Math.rint(10.1));    //10.0
        System.out.println(Math.rint(10.7));    //11.0
        System.out.println(Math.rint(11.5));    //12.0
        System.out.println(Math.rint(10.5));    //10.0
        System.out.println(Math.rint(10.51));   //11.0
        System.out.println(Math.rint(-10.5));   //-10.0
        System.out.println(Math.rint(-11.5));   //-12.0
        System.out.println(Math.rint(-10.51));  //-11.0
        System.out.println(Math.rint(-10.6));   //-11.0
        System.out.println(Math.rint(-10.2));   //-10.0

        //round 四舍五入，float时返回int值，double时返回long值
        System.out.println(Math.round(10.1));   //10
        System.out.println(Math.round(10.7));   //11
        System.out.println(Math.round(10.5));   //11
        System.out.println(Math.round(10.51));  //11
        System.out.println(Math.round(-10.5));  //-10
        System.out.println(Math.round(-10.51)); //-11
        System.out.println(Math.round(-10.6));  //-11
        System.out.println(Math.round(-10.2));  //-10
         */
    }


}

