package ssl.study.algorithmPractice.findMinOrMax;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 输入的第一行：numOfStocks（选定股票的数量） valueK（从小到大排列的股票的第几个）
 * 第二行：选定股票的相对股价 stock[i]...
 * 输出一个整数，表示选定的N支股票的第N低的股价
 * 约束条件：
 * 0 < valueK <= numOfStocks <= 10^6
 * 0 <= stork[i] <= 10^6
 * 0 <= i < numOfStocks
 *
 * 输入： 5 3 (7 4)
 * 10 5 7 88 19 (1 2 3 4 5 7 9)
 * 输出： 10 (4)
 */
public class FindRelativeMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //输入股票数量
        int stockSize = input.nextInt();
        int[] stock = new int[stockSize];
        //输入要输出第几个
        int valueK = input.nextInt();
        //输入股票股价
        for (int i = 0; i < stockSize; i++) {
            stock[i] = input.nextInt();
        }

        int result = smallestStockPrice(stock,valueK);
        System.out.println(result);
    }

    public static int smallestStockPrice(int[] stock, int valueK) {
        for (int i = 0; i < stock.length; i++) {
            int temp = 0;
            for (int j = i; j < stock.length; j++) {
                if (stock[i] > stock[j]) {
                    temp = stock[i];
                    stock[i] = stock[j];
                    stock[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(stock));
        return stock[valueK - 1];
    }
}
