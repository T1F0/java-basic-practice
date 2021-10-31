package com.supconit.study.algorithmPractice;

public class PrintMultiplicationTable {
    public static void print(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        print();
    }
}
