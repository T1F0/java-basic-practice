package test;

import java.util.Arrays;

/**
 * 有两个有序数组，合并为一个有序数组。
 *
 *  示例：
 *
 *  输入
 * arrayA : [1， 3， 5， 7， 9]
 * arrayB : [2, 4, 6, 8, 10]
 *  输出：
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */
public class Append {
    public static void main(String[] args) {
        //输入两个有序数组
        int[] numberArray1 = {1,3,5,7,9};
        int[] numberArray2 = {2,4,6,8,10};
        int[] outputArray = new int[numberArray1.length + numberArray2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < outputArray.length; i++) {
            if (numberArray1[index1] < numberArray2[index2]) {
                outputArray[i] = numberArray1[index1];
                index1 = index1 == numberArray1.length - 1 ? index1 : index1+1;
            } else if (numberArray1[index1] > numberArray2[index2]) {
                outputArray[i] = numberArray2[index2];
                index2 = index2 == numberArray2.length - 1 ? index2 : index2+1;
            }
        }
        System.out.println(Arrays.toString(outputArray));
    }
}
