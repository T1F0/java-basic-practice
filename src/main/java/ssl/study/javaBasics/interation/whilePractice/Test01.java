package com.supconit.study.JavaBasics.whilePractice;

/**
 * 考察case穿透，只有运行到break;才会跳出
 *
 * 1. 根据switch表达式中的值，依次匹配各个case中的常量。一旦匹配成功，则进入相应case结构中，调用其执行语句。
 * 当调用完执行语句以后，则仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构
 * 末尾为止结束。
 * (2.)break，可以使用在switch-case结构中，表示一但执行到此关键字，就跳出switch-case结构
 * (3.)switch结构中的表达式，只能是如下的6种数据类型之一：byte、short、char、int、枚举类型（JDK5.0新增）、string类型（JDK7.0新增）
 * (4.)case之后只能声明常量，不能声明范围
 * (5.)break关键字是可选的。
 * 6. default:相当于if-else结构中的else，default结构是可选的，而且位置是灵活的
 */
public class Test01 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            switch (i) {
                case 0:
                case 3: i = i + 2;
                case 1: i = i + 3;
                case 2: i = i + 5;
                default: i += 5;
                break;
            }
        }
        System.out.println(i);
    }
}
