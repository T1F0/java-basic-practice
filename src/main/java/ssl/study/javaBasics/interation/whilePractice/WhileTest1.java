package ssl.study.javaBasics.interation.whilePractice;

/**
 * 神奇的while，未解决
 */
public class WhileTest1 {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            i = i + 1;
            if (i == 10) {
                break;
            }
        }
        System.out.println(i);
    }
}
