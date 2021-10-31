package com.supconit.study.genericity;

import java.util.ArrayList;

public class Genericity {

    public static  <T> ArrayList list(){
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(10);
//        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(list());
    }
}
