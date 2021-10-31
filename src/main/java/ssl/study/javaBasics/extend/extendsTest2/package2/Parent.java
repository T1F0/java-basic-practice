package com.supconit.study.JavaBasics.extend.extendsTest2.package2;


public class Parent {

    private String name = "xiao";
    int sex = 1;
    protected int age = 18;
    public String nickName = "小东";

     public void setAge(int age) {
         this.age = age;
     }

     /**private只有当前类能用，别人永远拿不到，包括子类
     * default（缺省）同包可以拿到
     */
    private void sameClass(){
        System.out.println("爷爷的private");
    }
    void samePackage(){
        System.out.println("爷爷的default");
    }

    /**不同包子类可以拿到
     */
    protected void samePackageButExtends(){
            System.out.println("爷爷的protected");
        }

    /**全部可以拿到
     */
    public void all(){
            System.out.println("爷爷的public");
        }

 }
