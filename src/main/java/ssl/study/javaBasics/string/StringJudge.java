package ssl.study.javaBasics.string;

public class StringJudge {

    public static void main(String[] args) {
        String s1 = "a" + "b";
        String s2 = new String(s1);
        if (s1 == s2) System.out.println("A");
        if (s1.equals(s2)) System.out.println("B");
    }
}
