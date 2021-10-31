package ssl.study.exception;

/**
 * try后面如果有finally，finally必须执行，且必须在try中的return之前执行。
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
        try {
            func();
            System.out.println("A");
        } finally {
            System.out.println("B");
        }
    }
}
