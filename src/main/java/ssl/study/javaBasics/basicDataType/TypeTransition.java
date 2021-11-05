package ssl.study.javaBasics.basicDataType;


/**
 * 三元操作符类型的转换规则：
 * 1.若两个操作数不可转换，则不做转换，返回值为Object类型
 * 2.若两个操作数是明确类型的表达式（比如变量），则按照正常的二进制数字来转换，int类型转换为long类型，long类型转换为float类型等。
 * 3.若两个操作数中有一个是数字S,另外一个是表达式，且其类型标示为T，那么，若数字S在T的范围内，则转换为T类型；若S超出了T类型的范围，则T转换为S类型。
 * 4.若两个操作数都是直接量数字，则返回值类型为范围较大者
 */
public class TypeTransition {
    public static void main(String[] args) {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.print(o1);
        System.out.print(" ");
        System.out.print(o2);


        byte b = 1;
        char c = 1;
        short s = 1;
        int i = 1;

// 三目运算符，byte与char，结果为int
// 其它情况结果为两边中范围大的。适用包装类型
        i = true ? b : c; // int
        b = true ? b : b; // byte
        s = true ? b : s; // short

// 表达式，两边为byte,short,char，结果为int型
// 其它情况结果为两边中范围大的。适用包装类型
        i = b + c; // int
        i = b + b; // int
        i = b + s; // int

// 当 a 为基本数据类型时，a += b，相当于 a = (a) (a + b)
// 当 a 为包装类型时， a += b 就是 a = a + b
        b += s; // 没问题
        c += i; // 没问题

// 常量任君搞，long以上不能越
        b = (char) 1 + (short) 1 + (int) 1; // 没问题
// i = (long) 1 // 错误
    }
}

