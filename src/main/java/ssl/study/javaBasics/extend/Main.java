package com.supconit.study.JavaBasics.extend;


/**
 * 如果一个类中存在有参构造，那么要想在别的类中使用它的有参构造，必须写出它的无参构造
 */
class Person{
    String name;

    Person() {
        name = "Tom";
    }

    Person(String s) {
        name = s;
    }
}

class Woman extends Person{
}
public class Main {
    public static void main(String[] args) {
       Person person = new Person("java");
        //Woman woman = new Woman("HanMei");//会报错，因为Woman类根本没有构造方法。
        Woman woman = new Woman();
        System.out.println(woman.name);
    }
}
