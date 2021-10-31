package com.supconit.study.JavaBasics.interfaceTest.service;

public interface Service {
    default void outputTest(){
        System.out.println("测试一下");
    }
}
