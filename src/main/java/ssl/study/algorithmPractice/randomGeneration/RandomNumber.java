package ssl.study.algorithmPractice.randomGeneration;

public class RandomNumber {

    /**
     * 生成随机数，在0~2^n-1（n是二进制位数）之间随机生成一个数
     * @param args
     */
    public static void main(String[] args) {

        String string = new String();
        //2^8-1
        for (int i = 0; i < 8; i++) {
            string += Math.random() > 0.5 ? 1 : 0;
        }
        System.out.println(Integer.parseInt(string, 2));

    }
}
