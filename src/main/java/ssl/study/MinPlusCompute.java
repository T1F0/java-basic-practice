package test;

import java.util.Arrays;

/**
 * 求解数组中和最小的子序列，要求输出最后的和即可。
 * 数组子序列的定义：
 * 1.是这个数组的子片段；
 * 2.长度大于1小于这个数组的长度；
 *
 * 要求：时间复杂度为O(n)；
 */
public class MinPlusCompute {
    public static void main(String[] args) {
        int[] array = {7,-6,5,-9,10};
        int startIndex = 0;
        int endIndex = 0;
        int sum = array[startIndex];
        boolean b = true;
        while (b) {
            if (array[endIndex + 1] <= 0) {
                sum += array[startIndex + 1];
                endIndex++;
                continue;
            } else if (array[endIndex + 1] >= 0) {
                if (array[endIndex + 1] <= array[startIndex]) {
                    sum = sum + array[endIndex + 1] - array[startIndex];
                    startIndex++;
                    endIndex++;
                    continue;
                }
            }
            b = false;
        }
        System.out.println("开始" + startIndex + "结束" + endIndex + "总和" + sum);
    }
}
