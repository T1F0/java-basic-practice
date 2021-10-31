package com.supconit.study.JavaBasics.string;


/**
 * String/StringBuffer/StringBuilder
 * 三者看起来在运算上没有什么区别，但是内存的占用与运算空间是不一样的额，
 * String在修改时会重新开辟内存空间，但是StringBuffer和StringBuilder就不会
 */
public class StringClass {
    //三者的赋值
    static String string1 = "hello";
    static StringBuffer stringBuffer1 = new StringBuffer("哈哈");
    static StringBuilder stringBuilder1 = new StringBuilder("就是将");

    public static void main(String[] args) {
        //这个过程其实开辟了一个新的空间
        String string3 = string1 + "World";
        System.out.println(string3);
        //但是下面两行代码就不会开辟新的空间
        System.out.println(stringBuffer1 + "哈哈什么");
        System.out.println(stringBuilder1 + "花好月圆");
    }
}
