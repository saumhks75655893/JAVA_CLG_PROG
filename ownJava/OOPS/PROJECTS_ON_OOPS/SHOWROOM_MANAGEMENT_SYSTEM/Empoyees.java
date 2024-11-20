package ownJava.OOPS.PROJECTS_ON_OOPS.SHOWROOM_MANAGEMENT_SYSTEM;

import java.util.Scanner;
import java.util.UUID;

public class Empoyees extends Showroom implements utility {
    String emp_id;
    String emp_name;
    String emp_address;
    int emp_age;
    String emp_dept;

    @Override
    public void get_details() {
        System.out.println("================= Employee Details =============== ");
        System.out.println("Employee id : " + emp_id);
        System.out.println("Employee name : " + emp_name);
        System.out.println("Employee age : " + emp_age);
        System.out.println("Employee address : " + emp_address);
        System.out.println("Employee department : "+ emp_dept);
        System.out.println("Showroom : " + showroom_name);
    }

    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);

        System.out.println("================= Enter The Employees Details ================= ");
        System.out.println();
        System.out.print("Enter Employee name : ");
        emp_name = sc.nextLine();
        System.out.print("Enter Employee age : ");
        emp_age = sc.nextInt();
        System.out.print("Enter Employee address : ");
        emp_address = sc.nextLine();
        System.out.print("Enter Employee department : ");
        emp_dept = sc.nextLine();
        System.out.print("Enter showroom name : ");
        showroom_name = sc.nextLine();

    }
}
