package test.extendsConstruction;


/**
 * 找出二维数组中所有的“弱数组”数组
 * "弱数组"定义：弱数组中每一个数都比某一数组中每一个下标对应的数小，且“某一数组“至少存在一个。
 * 示例：
 * [[6,2],[5,8],[1,3]]中第3个子数组中，每一个数都比第2个子数组小，那么第3个子数组就是一个“弱数组”。
 *
 */
class Game{
    public static void main(String[] args) {
        int[][] properties  = new int[][]{{4, 2}, {8, 5}, {6, 4}};
        int number = 0;
        for(int i = 0;i < 3;i++) {
            for(int j = 0;j < 3;j++) {
                if(i == j)continue;
                if(properties[i][0]<properties[j][0] && properties[i][1]<properties[j][1]) {
                    number++;
                    break;
                }
            }
        }
        System.out.println(number);
    }
}