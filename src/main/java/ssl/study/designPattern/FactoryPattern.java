package test.designPattern;


/**
 * 简单的工厂模式
 */

class Benz {
    public Benz() {
        System.out.println("新建奔驰车");
    }
    public void driveBenz() {
        System.out.println("开奔驰");
    }
}

class Audi {
    public Audi() {
        System.out.println("新建奥迪车");
    }
    public void driveAudi() {
        System.out.println("开奥迪");
    }
}


class CarFactory {
    public CarFactory(String type) {
        if (type.equals("Benz")) {
            new Benz().driveBenz();
        } else if (type.equals("Audi")) {
            new Audi().driveAudi();
        }
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory("Audi");
    }}
