package ssl.study.algorithmPractice.intArrayCompute;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 *
 * 示例 1：输入：target = 7, nums = [2,3,1,2,4,3]输出：2解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 * 示例 2：输入：target = 4, nums = [1,4,4]输出：1
 * 示例 3：输入：target = 11, nums = [1,1,1,1,1,1,1,1]输出：0
 * 提示：
 *     1 <= target <= 109
 *     1 <= nums.length <= 105
 *     1 <= nums[i] <= 105
 */
public class Addition {
    public static void main(String[] args) {
        int[] ints = {1,1,1,1,1,1,1,5,1};
        int target = 11;
        int sum;
        int minLength = Integer.MAX_VALUE;
        //穷举起始下标
        for (int i = 0; i < ints.length; i++) {
            sum = 0;
            //循环相加，直到大于target
            for (int j = i; j < ints.length; j++) {
                sum += ints[j];
                if (sum >= target) {
                    minLength = Math.min((j - i + 1), minLength);
                    break;
                }
            }
        }
            System.out.println(minLength);

    }

}
