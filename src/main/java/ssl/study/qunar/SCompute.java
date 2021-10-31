package test.qunar;

import java.util.Scanner;

/**
 * 简单 S 表达式整数计算器
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 首先，我们介绍下什么是 S 表达式。S 表达式常见于各类 Lisp 语言，比如 (+ 1 2) 就是一个 S 表达式。S 表达式的一个特点就是将函数和对应的参数用一对括号括起来。
 * 现在，我们需要实现一个整数计算器，他的输入是一个 S 表达式，输出是一个表示计算结果的字符串。

 * 输入描述
 * 输入的 S 表达式的详细规则如下：
 * 1. 仅支持 +、-、*、/ 这 4 中运算方法，计算时都按照整数规则进行。
 * 2. +、* 支持至少 1 个参数，例如 (+ 1)、(* 1 2 3 4 5)
 * 3. -、/ 仅支持 2 个参数，例如 (- 2 1)、(/ 6 2)
 * 4. S 表达式支持嵌套，例如 (+ (* 1 2 3 4) (/ 6 2) (- 1 4))、(+ (* (/ 2 1) (- 6 3)) (+ 1 2))
 * 5. 输入的 S 表达式可能是非法的，比如括号不配对、计算符错误、参数数量错误、非整数参数等。
 * 输出描述
 * 输出规则如下：
 * 1. 最终结果通过标准输出打印即可
 * 2. 对于非法的 S 表达式，输出 invalid expression
 * 3. 对于除 0 这种整数无法支持的运算场景，输出 division by zero
 * 样例输入
 * (+ (* 1 2 3) (/ 6 2) (- 1 4))
 * 样例输出
 * 6
 */
public class SCompute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = input.next().split("");

    }
    /**
     * 使用递归思想进行去括号的操作，在输入数组中进行循环，如果遇到运算符，检查后面是否有括号，
     * 如果有，将此运算符计算的区域进行提取，重新进入递归函数，
     *  如果没有就进行运算，按照运算符计算两个数得到的结果，
     *  这样递归下来最终会得到计算的结果。
     *
     */


    public static void Interation(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("+") || strings[i].equals("-") || strings[i].equals("*") || strings[i].equals("/")) {
                if (strings[i + 1].equals("(")) {
                    String[] strings1 = {strings[i+1],strings[i+2],strings[i+3]};
                    Interation(strings1);
                }
            }
        }
    }

}
