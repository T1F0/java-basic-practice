package test.extendsConstruction;

public class extend01 {


    public static void main(String[] args) {
        new Son(6);
    }
}

class Parent{
    private Integer age;
    private String name;

    Parent() {
        System.out.println("ParentNoParam");
    }
    Parent(int id ) {
        System.out.println("ParentHasParam");
    }
}

class Son extends Parent{
    private String name;
    private Integer age;

    Son() {
        System.out.println("sonNoParam");
    }

    Son(int id) {
        System.out.println("sonHasParam");
    }
}
