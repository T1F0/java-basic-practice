package main.java.ssl.study.JavaBasics.judgeTest.switchPratice;

public class CasePenetrate {
    public static void main(String[] args) {
        char c = 'A';
        int num = 5;
        switch (c) {
            case 'B':
                num++;
            case 'A':
                num++;
            case 'Y':
                num++;
                break;
            default:
                num--;
        }
        System.out.println("num = " + num);
    }
}
