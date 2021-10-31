package com.supconit.study.JavaBasics.extend.extendsTest1.children;

import com.supconit.study.JavaBasics.extend.extendsTest1.parent.Parent;
import lombok.Data;

@Data
public class Children extends Parent{

    public static void main(String[] args) {
        Children children = new Children();
//        System.out.println(children.name);
        System.out.println(children.getName());
//        System.out.println(children.sex);
        System.out.println(children.getSex());
        System.out.println(children.age);
        System.out.println(children.getAge());
        System.out.println(children.nickName);
        System.out.println(children.getNickName());
//        children.sameClass();
//        children.samePackage();
        children.samePackageButExtends();
        children.all();
    }
}
