package com.supconit.study.JavaBasics.extend.extendsTest2.package1;

import com.supconit.study.JavaBasics.extend.extendsTest2.package2.Parent;

public class Children extends Parent {
    //可有可无
    @Override
    public void all(){
        System.out.println("爸爸的public");
    }
    @Override
    public void samePackageButExtends(){
        System.out.println("爸爸的protected");
    }



//    public void samePackage(){
//        System.out.println("default");
//    }
}
