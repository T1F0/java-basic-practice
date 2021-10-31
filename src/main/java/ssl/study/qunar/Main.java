package test.qunar;

import java.util.Scanner;

class Solution {
    /* Write Code Here */

    /**
     * @param a 数组1
     * @param m 数组1的有效元素个数
     * @param b 数组2
     * @param n 数组2的有效元素个数 
     * @return
     */
    public int[] mergeSortedArray(int[] a, int m, int[] b, int n) {

        //将数组2的有效元素放入数组1的非有效部分
        for (int i = m; i < a.length; i++) {
            a[i] = b[i - m];
        }
        return a;
    }
}

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _b_size = 0;
        _b_size = Integer.parseInt(in.nextLine().trim());
        int[] _b = new int[_b_size];
        int _b_item;
        for(int _b_i = 0; _b_i < _b_size; _b_i++) {
            _b_item = Integer.parseInt(in.nextLine().trim());
            _b[_b_i] = _b_item;
        }

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        res = new Solution().mergeSortedArray(_a, _m, _b, _n);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
