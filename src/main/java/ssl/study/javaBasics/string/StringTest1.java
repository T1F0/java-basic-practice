package ssl.study.javaBasics.string;

public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        //append
        StringBuffer buffer = new StringBuffer(s1);
        System.out.println(buffer.append(s2));
    }
}
