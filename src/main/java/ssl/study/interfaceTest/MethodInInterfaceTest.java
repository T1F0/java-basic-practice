package com.supconit.study.interfaceTest;

class MethodInInterfaceImpl implements MethodInInterface{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {
    }
}

public class MethodInInterfaceTest {
    public static void main(String[] args) {
        MethodInInterfaceImpl t = new MethodInInterfaceImpl();
        t.method3();
    }
}
