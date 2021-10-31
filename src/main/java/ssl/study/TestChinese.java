package test;

/**
 * 单例模式:
 * 第一步，不让外部调用创建对象，所以把构造器私有化，用private修饰。
 * 第二步，怎么让外部获取本类的实例对象？通过本类提供一个方法，供外部调用获取实例。由于没有对象调用，所以此方法为类方法，用static修饰。
 * 第三步，通过方法返回实例对象，由于类方法(静态方法)只能调用静态方法，所以存放该实例的变量改为类变量，用static修饰。
 * 最后，类变量，类方法是在类加载时初始化的，只加载一次。所以由于外部不能创建对象，而且本来实例只在类加载时创建一次
 */
class Chinese{
    private static Chinese objref =new Chinese();
    private Chinese(){}
    public static Chinese getInstance() { return objref; }
}

public class TestChinese {
    public static void main(String [] args) {
        Chinese obj1 = Chinese.getInstance();
        Chinese obj2 = Chinese.getInstance();
        System.out.println(obj1 == obj2);
    }
}
