package com.supconit.study.exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int ret = 0;
        try {
            int a = 5 / 0;
            return ret;
        }finally {
            return 2;
        }
    }
}
