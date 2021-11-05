package com.supconit.study.probability;

import java.util.Scanner;


/** 解决有序选择的概率计算问题(ordered)
 * 例如: 从3个男生、2个女生的队伍中找出2个人组成新队伍，
 *      新队伍为一男一女的概率为3/5（无序）
 *      新队伍为一男一女并且男前女后的概率为3/10（有序）
 *  解决无序选择的概率计算问题(unordered)
 *  例如: 从装有3只红球，2只白球的盒子中任意取出两只球，则其中有且只有一只红球的概率为3/5
 *  firstBox 第一样本数量
 *  secondBox 第二样本数量
 *  firstCatch 第一提取数量
 *  secondCatch 第二提取数量
 *  isOrder 有无序选择
 *
 *  例题1（古茗）：
 *  抽盲盒：盲盒中的物品包括a、b、c，共有15个盲盒，其中有5个盲盒装a，有个盲盒装b，有个盲盒装c，张三连抽3个盲盒，集齐abc的概率是：
 *  解题：(C51 * C51 * C51) / C15 3 = 15/2730 = 1/182
 *
 *  例题1（古茗）：
 *  8杯茶分给3个人，要求每个人至少1杯，问有多少种分配方式？
 *  解题：问题转换为将5杯茶分给3个人，005/014/023/113/122      C31 + C31*C21 +  C31*C21 + C31 + C31 = 21
 */
public class Probability {

    public static void main(String[] args) {
        System.out.println("请依次输入a样本总数量，b样本总数量，a样本取出个数，b样本取出个数：");

        Scanner input = new Scanner(System.in);
        int firstBox = input.nextInt();
        int secondBox = input.nextInt();
        int firstCatch = input.nextInt();
        int secondCatch = input.nextInt();
        String isOrder = input.next();

        if (isOrder.equals("ordered")){
            int molecule = compute1(firstBox,firstCatch)*compute1(secondBox,secondCatch);
            int denominator =compute1(firstBox+secondBox,firstCatch+secondCatch);
            double result = (double) molecule/denominator;
            simplify(molecule,denominator);
            System.out.println(result);
        }else if (isOrder.equals("unordered")){
            int molecule = compute1(firstBox,firstCatch)*compute1(secondBox,secondCatch)/(firstCatch*secondCatch);
            int denominator =compute1(firstBox+secondBox,firstCatch+secondCatch)/(firstCatch+secondCatch);
            double result = (double) molecule/denominator;
            simplify(molecule,denominator);
            System.out.println(result);
        }
    }
    //从first中取出inFirst所有的可能性
    public static int compute1(Integer first,Integer inFirst){
        return compute(first, inFirst);
    }
    private static int compute(Integer first,Integer inFirst){
        int i = 1;
        if (first<1||inFirst==0){
            return 1 ;
        }
        return first*compute(first-1,inFirst-1);
    }
    //化简分数
    private static void simplify(Integer molecule,Integer denominator){
        int minNumber = molecule<denominator? molecule : denominator;
        for (int i=2;i<=minNumber;i++){
            if (molecule%i!=0 || denominator%i!=0){
                continue;
            }
            molecule = molecule / i;
            denominator = denominator / i;
            minNumber = Math.min(molecule, denominator);
            i--;
        }
        //输出化简后的原始分数
        System.out.println(molecule+"/"+denominator);
        //分母分子相等
        if (molecule==denominator){
            System.out.println("1");
        }else if (denominator==1){
            //分母是1，直接输出分子
            System.out.println(molecule);
        }else if (molecule>denominator){
            //假分数化简
            int integer = molecule/denominator;
            int remainder =molecule%denominator;
            System.out.println(integer+"+"+remainder+"/"+denominator);
        }
    }

}
