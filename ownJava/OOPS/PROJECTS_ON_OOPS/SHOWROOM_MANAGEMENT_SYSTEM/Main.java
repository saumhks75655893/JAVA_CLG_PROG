package ownJava.OOPS.PROJECTS_ON_OOPS.SHOWROOM_MANAGEMENT_SYSTEM;

import java.util.Scanner;

interface utility {
    public void get_details();

    public void set_details();
}

public class Main {

    public static void main_menu() {
        System.out.println();
        System.out.println("************** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *************");
        System.out.println();
        System.out.println("******* ENTER YOUR CHOICE ********** ");
        System.out.println();
        System.out.println("1. ADD SHOWROOMS \t\t\t 2. ADD EMPLOYEES \t\t\t 3. ADD CARS ");
        System.out.println();
        System.out.println("4. GET SHOWROOMS \t\t\t 5. GET EMPLOYEES \t\t\t 6. GET CARS ");
        System.out.println();
        System.out.print("Enter your choice[1-6] or 0 to exit: ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Empoyees emp[] = new Empoyees[5];
        Cars car[] = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int emp_counter = 0;
        int choice = 100;
        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();
            while (choice != 0 && choice != 9)
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1. ADD NEW SHOWROOM : ");
                        System.out.println("9. GO BACK TO MAIN MENU : ");
                        System.out.print("Enter your choice : ");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        emp[emp_counter] = new Empoyees();
                        emp[emp_counter].set_details();
                        emp_counter++;
                        System.out.println();
                        System.out.println("1. ADD NEW EMPLOYEE : ");
                        System.out.println("9. GO BACK TO MAIN MENU : ");
                        System.out.print("Enter your choice : ");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("1. ADD NEW CAR : ");
                        System.out.println("9. GO BACK TO MAIN MENU : ");
                        System.out.print("Enter your choice : ");
                        choice = sc.nextInt();
                        car_counter++;
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. GO BACK TO MAIN MENU : ");
                        System.out.println("0. EXIT");
                        System.out.print("Enter your choice : ");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < emp_counter; i++) {
                            emp[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. GO BACK TO MAIN MENU : ");
                        System.out.println("0. EXIT");
                        System.out.print("Enter your choice : ");
                        choice = sc.nextInt();
                        break;


                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9. GO BACK TO MAIN MENU : ");
                        System.out.println("0. EXIT");
                        System.out.print("Enter your choice : ");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid choice !!! ");
                        break;
                }
        }


    }

}
