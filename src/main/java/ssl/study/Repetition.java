package test;

import java.util.HashMap;

public class Repetition {

    public static void main(String[] args) {

        String string = "abcabcb";
        String[] strings = new String[string.length()];
        strings = string.split("");
        int startIndex = 0;
        int endIndex = 0;
        //i表示结果数组的长度,从2到原始数组长度依次遍历
        for (int i = 2; i < strings.length; i++) {
            //j为头标，表示结果数组的下标为j开始，最大值为“数组长度-结果数组长度”
            inner:
            for (int j = 0; j < strings.length - i + 1; j++) {
                HashMap<String,Integer> hashMap = new HashMap<>();
                //把第一个放入hash表中
                hashMap.put(strings[j],0);
                //从头标+1开始，依次遍历检查当前结果数组是否符合要求
                for (int k = j + 1; k < j + i - 1; k++) {
                    if (!hashMap.containsKey(strings[k])) {
                        hashMap.put(strings[k],0);
                    }else continue inner;
                }
                startIndex = j;
                endIndex = startIndex + i - 1;
            }
        }
        System.out.println(endIndex - startIndex + 1);
    }
}
