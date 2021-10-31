package test.switchTest;

/**
 * switch中允许以下类型：
 * char, Character
 * byte, Byte
 * short, Short
 * int, Integer
 * String,
 * or an enum
 */
public class switchTest {
    public static void main(String[] args) {
        char c = '1';
        switch (c) {
            case '1':
                System.out.println(c);
                break;
        }
        byte b = 1;
        switch (b) {
            case 1:
                System.out.println(b);
                break;
        }
        int i = 1;
        switch (i) {
            case 1:
                System.out.println(i);
                break;
        }
    }
}
