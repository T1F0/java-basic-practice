package com.supconit.study.algorithmPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BucketProblem {

    public static void bucket() {
        Scanner input = new Scanner(System.in);
//        int[] nums = input.nextInt();
        int[] nums = {2,2,1055,2,2};
        int result = 0;
        outer:
        for (int i = 0; i < 1000; i++) {
            //所有数加1操作
            for (int j = 0; j < nums.length; j++) {
                nums[j]++;
            }
            nums[findMax(nums)]--;
            for (int z = 0; z < nums.length; z++) {
                if (nums[z] != nums[findMax(nums)]) {
                    break;
                }
                result = i+1;
                break outer;
            }
        }
        System.out.println(result);
    }

    //找数组中最大的数的下标
    public static Integer findMax(int[] nums) {
        int maxNum = Arrays.stream(nums).max().getAsInt();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxNum == nums[i]){
                result = i;
                break;
            }
         }
        return result;
    }

    public static void main(String[] args) {
        bucket();
    }
}
