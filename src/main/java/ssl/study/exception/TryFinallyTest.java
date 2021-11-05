package ssl.study.exception;

/**
 * try后面如果有finally，finally必须执行，且必须在try中的return之前执行。
 * 如果finally中已经有return了，按照方法的执行逻辑（任何方法都只能返回一个return语句），不会去执行try中的return。
 */
public class TryFinallyTest {
    public static void func() {
        try {
            System.out.println("C");
            return;
        } finally {
            System.out.println("D");
        }
    }
    public static void main(String[] args) {
        System.out.println(test());
        try {
            func();
            System.out.println("A");
        } finally {
            System.out.println("B");
        }
    }
    public static int test() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
}
