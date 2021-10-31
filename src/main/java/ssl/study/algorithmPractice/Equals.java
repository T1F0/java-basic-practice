package com.supconit.study.algorithmPractice;

public class Equals {
    public static void main(String[] args) {
        String s1 = "abc" +"def";
        String s2 = new String(s1);
        if (s1==s2)
            System.out.println("hello==");
        if (s1.equals(s2))
            System.out.println("hello.equals");
    }
}
