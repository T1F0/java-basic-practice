package com.supconit.study.JavaBasics.interfaceTest;

import com.supconit.study.JavaBasics.interfaceTest.service.Service;
import com.supconit.study.JavaBasics.interfaceTest.service.impl.ServiceImpl;

public class Application {

    public static void main(String[] args) {

        Service service  = new ServiceImpl();
        service.outputTest();
    }
}
