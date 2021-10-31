package main.java.ssl.study.algorithmPractice;

import java.util.Scanner;

/**
 * 实现功能：输入总利润，按照下面的奖金发放规则计算奖金：
 * 奖金发放规则：
 * 已知一个产品上市后，项目团队参与项目的利润分成。
 * 当项目利润低于或等于10万元（以下金额单位均为万元，省略）时，奖金可提5%；
 * 10~20，10部分沿用上面分成，高于10的部分，奖金提4%
 * 20~40：高于20，提5%；
 * 40~60：高于40，提3%；
 * 60~100：高于60，提1.5%；
 * 高于100，提1%
 */
public class BonusCompute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int profit = input.nextInt();
        double bonus;
        if (profit <= 10) {
            bonus = profit * 0.05;
        }
        if (profit > 10) {
            bonus = (profit - 10) ;
        }
    }
}
