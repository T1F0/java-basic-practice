package ssl.study.exception;

/**
 * finally必须在try中的return之前执行
 */
public class ExceptionTest {
    public static String sRet = "";

    public static void func(int i) {
        try {
            if (i % 2 == 0) {
                throw new Exception();
            }
        }
        catch (Exception e) {
            sRet += "0";
            return;
        }
        finally {
            sRet += "我是finally里面的";
        }
        sRet += "2";
    }

    public static void main(String[] args) {
        func(1);
        func(2);
        System.out.println(sRet);
    }
}
