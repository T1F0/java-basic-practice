package test;

/**
 * java核心卷I中43页有如下表述：两个数值进行二元操作时，会有如下的转换操作：
 * 如果两个操作数其中有一个是double类型，另一个操作就会转换为double类型。
 * 否则，如果其中一个操作数是float类型，另一个将会转换为float类型。
 * 否则，如果其中一个操作数是long类型，另一个会转换为long类型。
 * 否则，两个操作数都转换为int类型。
 * 故，x==f1[0]中，x将会转换为float类型。
 */
public class CompareReference{
    public static void main(String [] args){
        float f=42.0f;
        float f1[]=new float[2];
        float f2[]=new float[2];
        float[] f3=f1;
        long x=42;
        f1[0]=42.0f;

        //区别是一个市new的，一个是直接给复制的
        System.out.println(f1==f2);
        System.out.println(f1==f3);
        //long自动转型为float
        System.out.println(x==f1[0]);
    }
}
