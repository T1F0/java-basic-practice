
package ssl;
import java.util.Scanner;

/** 快乐数：
 * 写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
 * 也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * 示例：
 * 输入: 19，输出: true
 * 解释:  1*1+9*9=82 => 8*8 + 2*2 = 68 => 6*6 + 8*8 = 100 => 1*1 + 0*0 + 0*0 = 1
 */
public class HappyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number != 1) {
            String numberString = Integer.toString(number);
            int[] numberArray = new int[numberString.length()];
            String[] stringArray = numberString.split("");
            for (int i = 0; i < numberString.length(); i++) {
                numberArray[i] = Integer.parseInt(stringArray[i]);
            }
            int result = 0;
            /** for (int i = 0; i < numberArray.length; i++) {
             *                 result += (int) Math.pow(numberArray[i], 2);
             *             }
             */
            for (int j : numberArray) {
                result += (int) Math.pow(j, 2);
            }
            number = result;
        }
        System.out.println(number);
        boolean isHappyNumber = result(number);
        System.out.println(isHappyNumber);
    }


    public static boolean result(int n) {
        int sum = 0;         //定义一个变量，为后来记录和值用
        if(n<=0||n<=4&&n>1){
            return false;
        }else{
            while(n!=1){
                while(n!=0){
                    sum = 0;
                    sum += Math.pow(n % 10 , 2);
                    n=n/10;
                }
                n = sum;
                if(n==4){
                    return false;
                }
            }
            return true;
        }
    }
}
