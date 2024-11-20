package ownJava.OOPS.PROJECTS_ON_OOPS.SHOWROOM_MANAGEMENT_SYSTEM;

import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_type;
    String car_color;
    String car_fuel_type;
    String car_transmission;
    int car_price;

    public void get_details(){
        System.out.println("==================== CAR DETAILS ================= ");
        System.out.println("Car Name: " + car_name);
        System.out.println("Car Type: " + car_type);
        System.out.println("Car Color: " + car_color);
        System.out.println("Car Fuel Type: " + car_fuel_type);
        System.out.println("Car Transmission: " + car_transmission);
        System.out.println("Car Price: " + car_price);
    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================== ENTER CAR DETAILS ================= ");
        System.out.print("Enter car name : ");
        car_name = sc.nextLine();
        System.out.print("Enter car type(Sedan/SUV/HATCHBACK) : ");
        car_type = sc.nextLine();
        System.out.print("Enter car color : ");
        car_color = sc.nextLine();
        System.out.print("Enter car fuel type : ");
        car_fuel_type = sc.nextLine();
        System.out.print("Enter car transmission(Automatic/Manual) : ");
        car_transmission = sc.nextLine();
        System.out.print("Enter car price : ");
        car_price = sc.nextInt();
        total_cars_in_stock++;
    }

}
