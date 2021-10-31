package com.supconit.study.JavaBasics.extend;

class Animal {
    public void move() {
        System.out.println("动物动");
    }
}
class Dog extends Animal{

    public void move() {
        System.out.println("狗动");
    }
    public void bark() {
        System.out.println("狗叫");
    }
}

public class DogTest{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
        //b对象不能调用bark方法，因为类是Animal类
//        b.bark;
    }
}
