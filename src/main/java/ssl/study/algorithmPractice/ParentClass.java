package com.supconit.study.algorithmPractice;

public class ParentClass {
    protected int method1 (int a,int b){
        return 0;
    }

//    //'method1(int, int)' is already defined in 'xxx.ParentClass'
//    private int method1(int a,int b){
//        return 1;
//    }
    private int method1(int a,String b){
        return 1;
    }
//    private short method1(int a,int b){
//        return 1;
//    }
//    public int method1(int a,int b){
//        return 1;
//    }
    public static void main(String[] args) {
//        int result = this.method1(1,"2");

//        System.out.println(result);
    }
}
