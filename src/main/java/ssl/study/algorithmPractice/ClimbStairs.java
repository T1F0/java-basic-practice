package main.java.ssl.study.algorithmPractice;


/**
 * 在你前面有一个n阶的楼梯，你一步只能上1阶或者2阶。请问，当n=11时，有多少中不同的方式怕这个楼梯。当n=9时呢？
 */
public class ClimbStairs {
    /**
     * 简单分析一下，最少需要n/2+n%2步。最多要进行n步
     */
        //先计算2可能出现的步数
    public static void main(String[] args) {
        int n = 9;
        int numberOfTwo;
        int numberOfOne;
        int schemeNumber = 0;
        for (int i = 0; i < n/2+n%2; i++) {
            numberOfTwo = i;
            for (int j = 0; j <= n; j++) {
                numberOfOne = j;
                if (numberOfTwo * 2 + numberOfOne == n){
                    System.out.println(numberOfOne+","+numberOfTwo);
                    schemeNumber += compute(numberOfOne+numberOfTwo,numberOfTwo);
                    break;
                }
            }
        }
        System.out.println(schemeNumber);
    }

    public static int compute(Integer total, Integer part) {
         part = part > total - part ? total - part : part;
        int result = 1;
        if (part != 0){
            for (int i = 0; i < part; i++) {
                result = result * (total - i);
                System.out.println("累乘" + result);
            }
        }
        System.out.println(result);
        return result;
    }
}
