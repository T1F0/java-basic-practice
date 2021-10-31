package com.supconit.study.algorithmPractice;


/**输出命令中，如果输出内容只有单引号以及里面的字符，则输出单引号中本身的内容。
 * 如果单引号外边有运算符与之连接，则计算单引号中的ASCII码并进行四则运算
 * 扩展：这也是一种可以获取字符的ASCII码的方法
 */
public class ASCII {
    public static void main(String[] args) {
        int a=2;
        System.out.println('/');
        System.out.println(a+'/');
        System.out.println(a+'/'+10);
        System.out.println(12+10+'/');
        System.out.println(12+10+'0');
        System.out.println(15+'@');
        System.out.println('@'/8);
    }
}
