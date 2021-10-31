package main.java.ssl.study.JavaBasics.basicDataType.string;

import java.util.Arrays;

/**
 * 输入文本：
 * 想知道如果提高王者荣耀水平，上分把妹不是梦，加微信：17252sugats78，加QQ：34676328889
 * 输入标签：
 * [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4,4,4,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4]
 * 输出格式化文本：
 * 关键字：['微信','QQ']，串:['17252sugats78','34676328889']
 * 提示：请在本地将代码调通后再提交 
 */
public class StringTransfer {


    //数组扩容
    public static StringBuffer[] dilatation(StringBuffer[] strings) {
        StringBuffer[] newStrings;
        newStrings = Arrays.copyOf(strings, strings.length + 1);
        return newStrings;
    }

    public static void main(String[] args) {
        String fontString = "想知道如果提高王者荣耀水平，上分把妹不是梦，加微信：17252sugats78，加QQ：34676328889";
        int[] numberArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4,4,4,0,0,1,2,0,3,4,4,4,4,4,4,4,4,4,4};
        String[] fontChar = fontString.split("");
        StringBuffer[] fontResult = new StringBuffer[0];
        int fontCharIndex = 0;
        StringBuffer[] informationResult = new StringBuffer[0];
        int informationResultIndex = 0;
        for (int i = 0; i < fontChar.length; i++) {
            if (numberArray[i] == 0) {
                continue;
            } else if (numberArray[i] == 1) {
                fontResult = dilatation(fontResult);
                fontResult[fontCharIndex] = new StringBuffer("’").append(fontChar[i]);
                i++;
                while (numberArray[i] == 2) {
                    fontResult[fontCharIndex].append(fontChar[i]);
                    i++;
                }
                fontResult[fontCharIndex].append("‘");
                fontCharIndex++;
            } else if (numberArray[i] == 3) {
                informationResult = dilatation(informationResult);
                informationResult[informationResultIndex] = new StringBuffer("’").append(fontChar[i]);
                i++;
                while (numberArray[i] == 4 && i != numberArray.length - 1) {
                    informationResult[informationResultIndex].append(fontChar[i]);
                    i++;
                }
                informationResult[informationResultIndex].append("‘");
                informationResultIndex++;
            }
        }
        System.out.println("关键字：" + Arrays.toString(fontResult) + "，串：" + Arrays.toString(informationResult));
    }
}
