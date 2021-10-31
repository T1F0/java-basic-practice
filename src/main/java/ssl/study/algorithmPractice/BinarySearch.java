package com.supconit.study.algorithmPractice;

/**
 * 给定已经拍好序的n个元素a[0:n-1]，现在要将这n个元素中找到一特定的元素a,返回它的下标（从0开始）
 * 采用二分搜索法求解该问题
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7};
        System.out.println(binarySearch(a, 3));
    }

    static int binarySearch(int[] a, int n) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int middle = (left + right)/2;
            if (n == a[middle]) return middle;
            if (n > a[middle]) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }
}
