package com.supconit.study.algorithmPractice;

public class NullPointerException {

    public  static void print(){
        System.out.println("ABCD");
    }

    public static void main(String[] args){
        try{
            ((NullPointerException)null).print();
        }catch (java.lang.NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
