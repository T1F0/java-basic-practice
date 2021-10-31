package com.supconit.study.JavaBasics.extend.extendsTest2.test;

import com.supconit.study.JavaBasics.extend.extendsTest2.package1.Children;
import com.supconit.study.JavaBasics.extend.extendsTest2.package1.GrandChildren;

public class test {


    public static void main(String[] args){

        Children children = new Children();
        GrandChildren grandChildren = new GrandChildren();
        children.all();
        children.samePackageButExtends();
        grandChildren.all();
        grandChildren.samePackageButExtends();
        Children grandChildren2 = new GrandChildren();
        grandChildren2.all();
    }
}
