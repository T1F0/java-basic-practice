package com.supconit.study.algorithmPractice;

public class Fraction {

    /**分数的化简
     *
     * @param molecule
     * @param denominator
     */
    public void main(Integer molecule,Integer denominator){
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
