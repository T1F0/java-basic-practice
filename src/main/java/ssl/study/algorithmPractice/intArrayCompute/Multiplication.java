package ssl.study.algorithmPractice.intArrayCompute;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = String.valueOf(num);
        int l = str.length();
        int[] numArray = new int[l];
        //循环放入数组
        for(int i=0;i<l;i++){
            numArray[i] = str.charAt(i) - 48;
        }
        int ouNumSum = 0;
        int jiNumSum = 0;
        for (int i = 0; i < numArray.length; i++) {
            //
            if ((numArray.length - i) % 2 == 0) {
                ouNumSum += numArray[i];
            }else {
                jiNumSum += numArray[i];
            }
//            if (numArray[i] % 2 == 0) {
//                ouNumSum += numArray[i];
//            }else {
//                jiNumSum += numArray[i];
//            }
        }
        int result = ouNumSum * jiNumSum;
        System.out.println(result);
    }
}
    /**
     *     以下是c语言解决方案：
     *
     *     string str = Console.ReadLine();
     *     int[] numArray = new int[str.Length];
     *     for (int i = 0; i < str.Length; i++) {
     *         numArray[i] = Convert.ToInt32(str[i].ToString());
     *     }
     *     int ouNumSum = 0;
     *     int jiNumSum = 0;
     *     for (int i = 0; i < numArray.Length; i++) {
     *         if (numArray[i] % 2 == 0) {
     *             ouNumSum += numArray[i];
     *         } else {
     *             jiNumSum += numArray[i];
     *         }
     *     }
     *     int result = ouNumSum * jiNumSum;
     *     Console.WriteLine(result);
     *     Console.ReadKey();
     */

