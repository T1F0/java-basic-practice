package main.java.ssl.study.JavaBasics.basicDataType.string;

public class StringTest {
    static String  s = "aacecaaaa";
    //为保证效率，从中间开始进行判断
    static String[] strings = s.split("");
    static int middleIndex = strings.length % 2 == 0 ? strings.length/2 - 1 : strings.length/2;

    //看是否以
    public int while1(int middleIndex) {
        int i = 1;
        while (strings[middleIndex + i].equals(strings[middleIndex - i])) {
            i++;
            if (i == middleIndex) break;
        }
        if (i != middleIndex) while2();
        return middleIndex;
    }
    public void while2() {
        int i = 1;
        while (!strings[middleIndex + i].equals(strings[middleIndex - i])) {
            while1(--middleIndex);
        }
        while1(middleIndex);
    }
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        int result = stringTest.while1(middleIndex);
        System.out.println();
        }
}
