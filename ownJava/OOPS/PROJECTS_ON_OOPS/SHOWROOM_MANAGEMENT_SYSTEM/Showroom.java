package ownJava.OOPS.PROJECTS_ON_OOPS.SHOWROOM_MANAGEMENT_SYSTEM;

import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;


    @Override
    public void get_details() {
        System.out.println("=========================== Details of the Showrooms ========================= ");
        System.out.println("Showroom name : " + showroom_name);
        System.out.println("Showroom address : " + showroom_address);
        System.out.println("Total employees : " + total_employees);
        System.out.println("Total cars in_stock : " + total_cars_in_stock);
        System.out.println("Manager name : " + manager_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================== ENTER SHOWROOM DETAILS ====================== ");
        System.out.println("Enter Showroom name : ");
        showroom_name = sc.nextLine();
        System.out.println("Enter Showroom address : ");
        showroom_address = sc.nextLine();
        System.out.println("Enter Total employees : ");
        total_employees = sc.nextInt();
        System.out.println("Enter Total cars in_stock : ");
        total_cars_in_stock = sc.nextInt();
        manager_name = sc.nextLine();

    }

}
