package com.supconit.study.algorithmPractice;

public class InfiniteGreatNumber {
    public static void main(String[] args) {
        System.out.println(test(100));
    }
    public static int test(int n) {
        int cnt = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 8*i; j++) {
                cnt++;
            }
        }
        return cnt;
    }
}
