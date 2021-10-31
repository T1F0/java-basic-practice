package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * “特殊数字”是指只能被分解为2，3，7的乘积的数字。“特殊数字”序列为1, 2, 3, 4, 6, 7, 8, 9, 12, 14, ...
 * 展示了前10个“特殊数字”。按照惯例，1也是“特殊数字”。
 * 给定整数n，写一个程序，找到序列中，第n个“特殊数字”。如：n=9，找到“特殊数字”序列中第9位数字，也就是输出12。
 * 输入：
 * 每一行包含一个正整数，n (n <= 1500)。如果输入的一行为0，则输入终止。
 * 输出：
 * 对于每一行输入，输出“特殊数字”。注意不要解析输入为0的行
 * 示例：
 * 输入：
 * 1
 * 2
 * 9
 * 0
 * 输出：
 * 1
 * 2
 * 12
 * 提示：请在本地将代码调通后再提交
 */
public class SpecialNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        int[] numberList = new int[1100];
        int index = 0;
        //循环检验1~1500是否为特殊字符
        outer:
        for (int i = 1; i <= 1500; i++) {
            int number = i;
            while (number != 1) {
                number = number % 2 == 0 ? number / 2 : number;
                number = number % 3 == 0 ? number / 3 : number;
                number = number % 7 == 0 ? number / 7 : number;
                if (number == 1)break;
                if (number % 2 != 0 && number % 3 != 0 && number % 7 != 0) {
                    continue outer;
                }
            }
            numberList[++index] = i;
        }
        System.out.println(numberList[firstNumber]);
        System.out.println(numberList[secondNumber]);
        System.out.println(numberList[thirdNumber]);

    }
}
