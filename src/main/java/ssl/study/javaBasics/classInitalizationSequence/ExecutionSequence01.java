package com.supconit.study.JavaBasics.classInitalizationSequence;

public class ExecutionSequence01 {
    //父类的构造方法
    public ExecutionSequence01() {
        System.out.println("父类的构造方法 class A");
    }

    //父类的普通代码块(成员初始化)
    static {
        System.out.println("父类的普通代码块(成员初始化) I'm A class");
    }

    //父类的静态代码块
    static {
        System.out.println("父类的静态代码块 class A static");
    }
}
class B extends ExecutionSequence01 {
    //子类的构造方法
    public B() {
        System.out.println("子类的构造方法 class B");
    }

    //子类的普通方法(成员初始化)
    static {
        System.out.println("子类的普通方法(成员初始化) I'm B class");
    }

    //子类的静态代码块
    static {
        System.out.println("子类的静态代码块 class B static");
    }

    public static void main(String[] args) {
        new B();
    }
}

