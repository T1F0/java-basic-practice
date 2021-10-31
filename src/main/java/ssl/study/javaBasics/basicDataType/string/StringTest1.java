package com.supconit.study.JavaBasics.basicDataType.string;

//方法区的位置是
public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        //append
        StringBuffer buffer = new StringBuffer(s1);
        System.out.println(buffer.append(s2));

        /** intern方法：
         *  当常量池中不存在"abc"这个字符串的引用，将这个对象的引用加入常量池，返回这个对象的引用。
         *  当常量池中存在"abc"这个字符串的引用，返回这个对象的引用；
         */

        String s3 = new String("hello") + new String("world");
        System.out.println("'s3.intern() == s3'为" + (s3.intern() == s3));
        String s4 = new String("hello") + new String("world");
        System.out.println("'s4.intern() == s3'为" + (s4.intern() == s3));

    }
}
