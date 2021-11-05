package ssl.study.algorithmPractice.findMinOrMax;

/**
 * 找最小的数
 */
public class FindMin {
    public static void main(String[] args) {
        int[] score = {1,5,2,4,6};
        int temp = score[0];
        for (int index = 1; index < 5; index++) {
            if (score[index] < temp) {
                temp = score[index];
            }
        }
        System.out.println(temp);
    }
}
