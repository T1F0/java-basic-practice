package ssl.study.javaBasics.classInitalizationSequence;

public class ClassTest1 {
        private int a = 10;
        int b = 20;
        static int c = 1;
        public static void main(String args[]) {
            ClassTest1 t = new ClassTest1();
            //实例化之后所有的都能访问了，包括静态变量
            System.out.println(t.a);
            System.out.println(t.b);
            System.out.println(t.c);
            //类名直接加"."的就用static
            System.out.println(ClassTest1.c);
            //'xxx.ClassTest1.this' cannot be referenced from a static context,不能使用
        }
        public void test() {
            //表示此类中的变量，带有static的类的方法中不能使用this或者super
            System.out.println(this.a);
            System.out.println(this.b);
            System.out.println(this.c);
        }
}
