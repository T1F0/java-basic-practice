package com.supconit.study.JavaBasics.extend.extendsTest1.parent;


import lombok.Data;

@Data
 public class Parent {

        private String name = "xiao";
        int sex = 1;
        protected int age = 18;
        public String nickName = "小东";

        private void sameClass(){
            System.out.println("private");
        }
        void samePackage(){
            System.out.println("default");
        }
        protected void samePackageButExtends(){
            System.out.println("protected");
        }
        public void all(){
            System.out.println("public");
        }

    }
