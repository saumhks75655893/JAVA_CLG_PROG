import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read the first integer
            System.out.print("Enter the first number (a): ");
            int a = Integer.parseInt(sc.nextLine());

            // Read the second integer
            System.out.print("Enter the second number (b): ");
            int b = Integer.parseInt(sc.nextLine());

            // If both inputs are valid, print the values
            System.out.println("You entered a = " + a + " and b = " + b);

        } catch (NumberFormatException ex) {
            // Catch invalid input and display error message
            System.out.println("Invalid input! Please enter only integers from [0 - 9].");
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
