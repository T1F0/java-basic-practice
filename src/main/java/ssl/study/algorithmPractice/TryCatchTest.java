package com.supconit.study.algorithmPractice;

public class TryCatchTest {
    public static void main(String[] args) {
        try {
            int a = 5/0;
        }catch (Exception ex){
            System.out.println(ex.getSuppressed());
            /**getLocalizedMessage()   / by zero
             * .getMessage() / by zero
             * hashCode()  1296064247
             * getStackTrace()  [Ljava.lang.StackTraceElement;@4d405ef7
             * .fillInStackTrace() java.lang.ArithmeticException: / by zero
             */
        }
        finally {
        int i = 1;
            System.out.println(i);
        }
    }
}
