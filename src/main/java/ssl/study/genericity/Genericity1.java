package com.supconit.study.genericity;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

public class Genericity1 {
    public static void main(String[] args) {

    List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);

    for(int i = 0; i< arrayList.size();i++) {
    String item = (String) arrayList.get(i);
        System.out.println("泛型测试，item = " + item);
}
}
}
