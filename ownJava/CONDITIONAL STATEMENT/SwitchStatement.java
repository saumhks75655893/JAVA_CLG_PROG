import java.util.Scanner;

class Calculator {
    int a;
    int b;
    String choice;

    public void WorkCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        a = sc.nextInt();
        System.out.println("Enter second number : ");
        b = sc.nextInt();
        System.out.println("Enter your choice (+, -, *, / , %): ");
        choice = sc.next();

        switch (choice) {
            case "+":
                System.out.println(a + " +  " + b + " =  " + (a + b));
                break;
            case "-":
                System.out.println(a + " -  " + b + " =  " + (a - b));
                break;
            case "*":
                System.out.println(a + " *  " + b + " =  " + (a * b));
                break;
            case "/":
                System.out.println(a + " /  " + b + " =  " + (a / b));
                break;
            case "%":
                System.out.println(a + " %  " + b + " =  " + (a % b));
                break;
            default:
                System.out.println("Invalid choice !!!!! ");
        }
    }
}

public class SwitchStatement {
    public static void main(String[] args) {
        // int button;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter you number : ");
        // button = sc.nextInt();

        Calculator cal = new Calculator();
        cal.WorkCalculator();

        // switch (button) {
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour ");
        //         break;
        //     default:
        //         System.out.println("Invalid button ");


        // }
    }
}
