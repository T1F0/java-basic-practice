package ssl;

public class OperationalCharacter {
    public static void main(String[] args) {
        int i =16;
        i -= 16;
        System.out.println(i);
        int a =16;
        a += 16;
        System.out.println(a);
        int b =16;
        b /= 8;
        System.out.println(b);
        int c =16;
        c *= 8;
        System.out.println(c);
        boolean f = true;
        boolean g = true;
        boolean h = false;
        f &= h;
        g |= h;
        System.out.println(f);
        System.out.println(g);
    }
}
