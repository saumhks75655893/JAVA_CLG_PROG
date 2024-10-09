import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        try (// taking input (scanner keyword)
             // print your name by taking input
             Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter you name : ");
            String MyName = sc.nextLine();
            System.out.println("My name is : " + MyName);

            System.out.print("Enter you name : ");
            String MyName1 = sc.nextLine();
            System.out.println("My name is : " + MyName1);
            // Q. -> Take 1 variables a and b and print their sum.
            System.out.print("Num1 : ");
            int a = sc.nextInt();
            System.out.print("Num2 : ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("Sum of the numbers " + a + " and " + b + " is : " + sum);
        }

    }

}
