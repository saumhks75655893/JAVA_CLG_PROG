class Vehicle {
    double mileage;
    String color;
    double price;

    public void display() {
        System.out.println("Car color is : " + color);
        System.out.println("Car price is : " + price);
        System.out.println("Car mileage is : " + mileage);
    }
}

class Car extends Vehicle {
    String ftype;
    boolean sunroof;

    public void show() {
        System.out.println("Car fuel type is : " + ftype);
        if(sunroof == false)
        {
            System.out.println("Car has not sunroof !! ");
        }
        else
        {
            System.out.println("Car has sunroof !! ");
        }
    }
}

public class VehicleCarInheritanceExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "Red";
        c1.ftype = "Diseasel";
        c1.mileage = 18.4;
        c1.price = 150000;
        c1.sunroof = false;
        System.out.println("-------------------");
        System.out.println();
        c1.display();
        c1.show();
        System.out.println();
        System.out.println("--------------------- ");
    }
}
