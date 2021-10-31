package ssl.study.compute;

public class Computei {

    public static void main(String[] args) {
        int a = 10;
        //a++：先赋值再加1，a赋值10，运行a--之前，a变成11，先赋值，a赋值11
//        System.out.println(a++);
        System.out.println(a++ + a--);
    }
}
