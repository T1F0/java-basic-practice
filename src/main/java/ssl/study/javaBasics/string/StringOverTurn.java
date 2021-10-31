package com.supconit.study.JavaBasics.string;

import java.util.Objects;
import java.util.Scanner;

public class StringOverTurn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();
        System.out.println(overTurn(string1, string2));
    }


    public static boolean overTurn(String string1,String string2) {
        String[] stringArray1 = string1.split("");
        String[] stringArray2 = string2.split("");
        if (stringArray1.length != stringArray2.length) return false;
        outer:
        for (int i = 0; i < stringArray2.length; i++) {
            for (int j = 0; j < stringArray1.length; j++) {
                if (Objects.equals(stringArray2[i], stringArray1[j])) {
                    continue outer;
                }
            }
            return false;
        }
        return true;
    }
}
