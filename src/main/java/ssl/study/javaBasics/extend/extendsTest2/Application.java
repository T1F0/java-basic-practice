package com.supconit.study.JavaBasics.extend.extendsTest2;

import com.supconit.study.JavaBasics.extend.extendsTest2.package2.Parent;

public class Application {
    public static void main(String[] args) {
//        GrandChildren grandChildren = new GrandChildren();
////        System.out.println(grandChildren.name);
//        System.out.println(grandChildren.getName());
////        System.out.println(grandChildren.sex);
//        System.out.println(grandChildren.getSex());
//        System.out.println(grandChildren.age);
//        System.out.println(grandChildren.nickName);
//        System.out.println(grandChildren.getNickName());
//
//        //在使用类中的方法时，首先扫描当前类的方法，
//        // 如果没有再看父类中有没有方法，按照访问权限获取执行方法，
//        // 如果父类中没有相关方法或者修饰符不允许访问，则访问爷爷类，以此类推。
//        grandChildren.samePackageButExtends();
//        grandChildren.all();

        Parent parent = new Parent();
        parent.setAge(15);

    }
}
