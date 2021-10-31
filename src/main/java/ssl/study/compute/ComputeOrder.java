package ssl.study.compute;
/**
 * 先赋值再运算：int i = a--;
 * 先运算再赋值：int i = --a;
 */
public class ComputeOrder {

    public static void main(String[] args) {
        int a =100,b=50,c=a---b,d=a---b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}
