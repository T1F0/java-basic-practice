package test.qunar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 给定一个只包含大小写英文字母的字符串，需要将字符串中出现的字符按照一定的规则重新排序后输出。
 *         排序规则如下：
 *         1. 首先按照字符串里字符出现的频率降序排列
 *         2. 对于频率相同的字符，则按照先大写后小写的顺序排列
 *         3. 对于频率相同且大小写相同的字符，则按照字母的顺序排序，即 a/A 排在最前，z/Z 排在最后，中间的字母以此类推。
 */

public class StringOperation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.next();
        String[] strings = string.split("");
        Map hashMap = new HashMap();
        String[] stringsNoRepetition = new String[string.length()];
        int stringsNoRepetitionIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            int times = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].equals(strings[j])){
                    times++;
                }
            }
            if (!hashMap.containsKey(strings[i])) {
                hashMap.put(strings[i], times);
                stringsNoRepetition[++stringsNoRepetitionIndex] = strings[i];
            }
        }
        String[] resultStrings = new String[string.length()];
        for (int i = 1; i < hashMap.size(); i++) {
            for (int j = 0; j < strings.length; j++) {
                if (hashMap.get(stringsNoRepetition[j]).equals(i)) {
                    for (int k = 0; k < i; k++) {
                        resultStrings[strings.length - k] = stringsNoRepetition[j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(resultStrings));
    }
}
