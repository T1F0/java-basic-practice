package com.supconit.study.JavaBasics.arrayTest;

import java.util.ArrayList;

public class ArrayTest1 {
    public static void main(String[] args) {
        //类型不一样是不行的
//        ArrayList<Object> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
//        ArrayList<String> list2 = new ArrayList<Object>();
        ArrayList<Object> list3 = new ArrayList();
    }
}
