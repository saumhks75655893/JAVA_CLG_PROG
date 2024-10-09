package ownJava.OOPS.INHERITANCE.INTERFACE_MULTIPLE_INHERITANCE;

interface car {
    public void PriceCar(int price);

    public void start();
}

class ElectricCar implements car {
    public void start() {
        System.out.println("Electric Car start");
    }
    public void PriceCar(int n) {
        System.out.println("Electric Car price " + n);
    }
}

class DieselCar implements car {
    public void start() {
        System.out.println("Diesel Car start");
    }
    public void PriceCar(int n) {
        System.out.println("Diesel Car price " + n);
    }
}

public class InterfaceBasic2 {
    public static void main(String[] args) {
        car Tesla = new ElectricCar();
        Tesla.start();
        Tesla.PriceCar(1200000);
        car XUV700 = new DieselCar();
        XUV700.start();
        XUV700.PriceCar(750000);
    }
}
