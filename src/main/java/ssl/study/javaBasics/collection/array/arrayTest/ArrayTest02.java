package ssl.study.javaBasics.collection.array.arrayTest;

import java.util.Arrays;

/**
 * 数组的合法定义方式；
 * new float[][]中，第一个框必须写，这是一维数组的长度，第二个可以暂时不用定义，可以不写
 */
public class ArrayTest02 {

    public static void main(String[] args) {
        float a[][] = new float[6][6];

        float []b[] = new float[6][6];

        float [][]d = new float[6][6];

        float [][]e = new float[6][];
        System.out.println(Arrays.deepToString(e));
    }


}
