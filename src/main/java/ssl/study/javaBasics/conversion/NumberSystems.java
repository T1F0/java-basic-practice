package com.supconit.study.JavaBasics.conversion;

import io.swagger.models.auth.In;

import java.util.Arrays;

public class NumberSystems {

    public static void main(String[] args) {
        String word = "742e9679129f7f073347cd56c9773a83";
        String word2 = "b5ea7e4af7e4e7b67fbb06b7399f34f1";
        String keyStr = "4372734023526563727569744e616d65";
        String ivStr = "30313233343536373839414243444546";
        String recruitNodeCode0 =  "c46b889d06f309dc67e66a0a15bce0db";

        System.out.println(transferASCIIToChar(conversion16To10(recruitNodeCode0)));
    }
    
    public static int[] conversion16To10(String n16) {
        int[] result = new int[n16.length()/2];
        for (int i = 0; i < n16.length()/2; i++) {
            result[i] = toHx16(n16.charAt(2*i))*16 + toHx16(n16.charAt(2*i+1));
        }
            return result;
    }

    public static char[] transferASCIIToChar(int[] ints) {
        char[] chars = new char[ints.length];
        for (int i = 0; i < ints.length; i++) {
            chars[i] = (char)ints[i];
        }
        return chars;
    }


    public static int toHx16(char str) {
        switch(str)
        {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'a':
            case 'A':
                return 10;
            case 'b':
            case 'B':
                return 11;
            case 'c':
            case 'C':
                return 12;
            case 'd':
            case 'D':
                return 13;
            case 'e':
            case 'E':
                return 14;
            case 'f':
            case 'F':
                return 15;
        }

        return 0;
    }
}
