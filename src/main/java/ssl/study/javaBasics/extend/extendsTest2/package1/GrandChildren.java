package com.supconit.study.JavaBasics.extend.extendsTest2.package1;


public class GrandChildren extends Children {
//    private String name = "小宋";
//    int sex = 1;
    public int age;
//    public String nickName = "小佳";
//
    private void sameClass(){
        System.out.println("private");
    }
    void samePackage(){
        System.out.println("default");
    }
    @Override
    public void samePackageButExtends(){
        super.all();
        super.samePackageButExtends();
        System.out.println("孙子的Protected");
    }

    @Override
    public void all(){
        System.out.println("孙子的Public");
    }
}
