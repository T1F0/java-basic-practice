package ssl.study.algorithmPractice.calculus;

import java.util.Scanner;

/**
 * 在一个科学实验室里，两种化学物质结合后产生初始能量，该能量每秒以恒定的速率发生变化，科学家希望计算出在反应持续N秒的情况下所能产生的能量总和。
 * 输入： intialEnergy（初始能量）、rate（恒定变化率）、time（时间，第N秒）
 *
 * 实例：
 * 输入：5 3 3 (3 2 3) (2 3 4)
 * 输出：24 (15) (26)
 * 说明：
 * N = 1时，产生的初始能量是5；
 * N = 2时，产生的能量是8；
 * N = 3时，产生的能量是11
 */
public class calculusTest {

    public static int totalEnergy(int intialEnergy, int rate, int time) {
        int result = 0;
        for (int i = 0; i < time; i++) {
            result += (intialEnergy + rate * i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入初始能量
        int intialEnergy = input.nextInt();
        //输入增长率
        int rate = input.nextInt();
        //输入时间
        int time = input.nextInt();

        System.out.println(totalEnergy(intialEnergy, rate, time));
    }
}
